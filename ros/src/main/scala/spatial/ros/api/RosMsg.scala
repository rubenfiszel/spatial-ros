package spatial.ros.api


import argon._
import argon.core.Staging
import forge._
import spatial.ros._

trait RosMsgApi extends RosMsgExp { self: RosApi => }

trait RosMsgExp extends Staging { self: RosExp =>

  /**
    * Parent class for all staged Structs
    */
  abstract class MetaRosMsg[T:RosMsgType] extends MetaAny[T]{ self =>
    protected def tp = implicitly[RosMsgType[T]]
    protected def field[R:Meta](name: String)(implicit ctx: SrcCtx): R = wrap(field_apply[T,R](self.s, name))
    protected def fieldToText[T](name: String, tp: Meta[T])(implicit ctx: SrcCtx) = tp.ev(field(name)(mtyp(tp), ctx)).toText

    def fields(implicit ctx: SrcCtx): Seq[(String,MetaAny[_])] = {
      tp.fields.map{case (name,fieldTyp) => name -> fieldTyp.ev(field(name)(mtyp(fieldTyp),ctx)) }
    }

    @api def =!=(that: T): Bool = struct_unequals(this.asInstanceOf[T],that)
    @api def ===(that: T): Bool = struct_equals(this.asInstanceOf[T],that)
    @api def toText = {
      val fields = tp.fields.map{case (name,fieldTyp) => fieldToText(name,fieldTyp) }
      lift[String,Text](tp.prefix + "(") + fields.reduceLeft{(a,b) => a + "," + b } + ")"
    }
  }

  def rosmsg_equals[T:RosMsgType](a: T, b: T)(implicit ctx: SrcCtx): Bool = {
    val tp = implicitly[RosMsgType[T]]
    def eql[F:Meta](x: F, y: F): Bool = x === y

    tp.fields.map {case (name, fieldTyp) =>
      implicit val mA: Meta[_] = fieldTyp
      val x = rosmsg_field(a, name)(tp, fieldTyp, ctx)
      val y = rosmsg_field(b, name)(tp, fieldTyp, ctx)
      eql(x,y)(mmeta(fieldTyp))
    }.reduce(_&&_)
  }
  def rosmsg_unequals[T:RosMsgType](a: T, b: T)(implicit ctx: SrcCtx): Bool = {
    val tp = implicitly[RosMsgType[T]]
    def neq[F:Meta](x: F, y: F): Bool = x =!= y

    tp.fields.map {case (name, fieldTyp) =>
      implicit val mA: Meta[_] = fieldTyp
      val x = rosmsg_field(a, name)(tp, fieldTyp, ctx)
      val y = rosmsg_field(b, name)(tp, fieldTyp, ctx)
      neq(x,y)(mmeta(fieldTyp))
    }.reduce(_||_)
  }



  abstract class RosMsgType[T](override implicit val ev: T <:< MetaStruct[T]) extends Meta[T] {
    override def isPrimitive = false
    def fields: Seq[(String, Meta[_])]
    def prefix: String = this.stagedClass.getSimpleName
  }

  // def record_new[T: RefinedManifest](fields: (String, _)*): T
  // def record_select[T: Manifest](record: Record, field: String): T
  def rosmsg_struct[T:RosMsgType](fields: (String, Exp[_])*)(implicit ctx: SrcCtx): T = wrap(struct_new[T](fields))
  def rosmsg_field[T:RosMsgType, R:Meta](struct: T, name: String)(implicit ctx: SrcCtx): R = wrap(field_apply[T,R](struct.s, name))


  /** IR Nodes **/
  abstract class RosMsgAlloc[T:RosMsgType] extends Op[T] {
    def elems: Seq[(String, Exp[_])]

    override def inputs   = dyns(elems.map(_._2))
    override def reads    = Nil
    override def freqs    = normal(elems.map(_._2))

    override def aliases  = Nil
    override def contains = dyns(elems.map(_._2))
  }

  case class RosMsgSimple[S:RosMsgType](elems: Seq[(String,Exp[_])]) extends RosMsgAlloc[S] {
    def mirror(f:Tx) = rosmsg_new[S](elems.map{case (idx,sym) => idx -> f(sym) })
  }

  case class RosMsgApply[S:RosMsgType,T:Type](struct: Exp[S], field: String) extends Op2[S,T] {
    def mirror(f:Tx) = rosmsg_apply[S,T](f(struct), field)

    override def extracts = dyns(struct)
  }
  case class RosMsgUpdate[S:RosMsgType,T:Type](struct: Exp[S], field: String, value: Exp[T]) extends Op3[S,T,Void] {
    def mirror(f:Tx) = rosmsg_update(f(struct), field, f(value))

    override def contains = dyns(value)  // TODO: Is this necessary?
  }


  /** Constructors **/
  def rosmsg_new[S:RosMsgType](elems: Seq[(String, Exp[_])])(implicit ctx: SrcCtx): Exp[S] = {
    stage(RosMsgSimple(elems))(ctx)
  }

  // TODO: Should struct unwrapping be disabled for mutable structs?
  def rosmsg_apply[S:RosMsgType, T:Type](struct: Exp[S], index: String)(implicit ctx: SrcCtx): Exp[T] = struct match {
    case Op(s: RosMsgAlloc[_]) if Config.unwrapStructs => rosmsg_unwrap[S,T](struct, index) match {
      case Some(x) => x
      case None => stage(FieldApply[S,T](struct, index))(ctx)
    }
    case _ => stage(FieldApply[S,T](struct, index))(ctx)
  }
  def rosmsg_update[S:RosMsgType,T:Type](struct: Exp[S], index: String, value: Exp[T])(implicit ctx: SrcCtx): Exp[Void] = {
    stageWrite(struct)(FieldUpdate(struct, index, value))(ctx)
  }

  /** Helper functions **/
  object RosMsg {
    def unapply(x: Op[_]): Option[Map[String,Exp[_]]] = x match {
      case s: RosMsgAlloc[_] => Some(s.elems.toMap)
      case _ => None
    }
  }

  def rosmsg_unwrap[S:RosMsgType, T:Type](struct: Exp[S], index: String): Option[Exp[T]] = struct match {
    case Op(RosMsg(elems)) => elems.get(index) match {
      case Some(x) if x.tp <:< typ[T] => Some(x.asInstanceOf[Exp[T]]) // TODO: Should this be Staged asInstanceOf?
      case None =>
        throw new NoFieldException(struct, index) // TODO: Should this be a user error?
    }
    case _ => None
  }

  /** Internals **/
  override def recurseAtomicLookup(s: Exp[_]): Exp[_] = s match {
    case Def(FieldApply(struct, index)) => recurseAtomicLookup(struct)
    case _ => super.recurseAtomicLookup(s)
  }

}
