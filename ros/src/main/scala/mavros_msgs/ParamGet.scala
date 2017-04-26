
package spatial.ros

import forge._
import org.virtualized._
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait ParamGetApi extends ParamGetExp {
  self: RosApi =>

}

trait ParamGetExp {
  self: RosExp =>
  
  implicit object ParamGetType extends Meta[ParamGet] {
    def wrapped(x: Exp[ParamGet]) = ParamGet(x)
    def stagedClass = classOf[ParamGet]
    def isPrimitive = false
  }

  implicit object ParamGetSrv extends Srv[ParamGet] {
    type Response = ParamGetRep
    def response(srv: ParamGet) = srv.response
  }

  implicit object ParamGetRepType extends Meta[ParamGetRep] {
    def wrapped(x: Exp[ParamGetRep]) = ParamGetRep(x)
    def stagedClass = classOf[ParamGetRep]
    def isPrimitive = false
  }

  case class ParamGet(s: Exp[ParamGet]) extends MetaAny[ParamGet] {
    @api def param_id: Text = Text(stage(ParamGet_param_id(s))(ctx))
    @api def response: ParamGetRep = ParamGetRep(stage(ParamGetReply(s))(ctx))
    @api def ===(that: ParamGet): Bool = ???
    @api def =!=(that: ParamGet): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class ParamGetRep(s: Exp[ParamGetRep]) extends MetaAny[ParamGetRep] {
    @api def success: Bool = Bool(stage(ParamGetRep_success(s))(ctx))
    @api def value: ParamValue = ParamValue(stage(ParamGetRep_value(s))(ctx))
    @api def ===(that: ParamGetRep): Bool = ???
    @api def =!=(that: ParamGetRep): Bool = ???
    @api def toText: Text = textify(this)
  }

  
case class ParamGet_param_id(msg: Exp[ParamGet]) extends Op[Text] {
  def mirror(f: Tx) = stage(ParamGet_param_id(f(msg)))(EmptyContext)
}

  
case class ParamGetRep_success(srv: Exp[ParamGetRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(ParamGetRep_success(f(srv)))(EmptyContext)
}

  
case class ParamGetRep_value(srv: Exp[ParamGetRep]) extends Op[ParamValue] {
  def mirror(f: Tx) = stage(ParamGetRep_value(f(srv)))(EmptyContext)
}

  case class ParamGetReply(srv: Exp[ParamGet]) extends Op[ParamGetRep]{
    def mirror(f: Tx) = stage(ParamGetReply(f(srv)))(EmptyContext)
  }
  case class NewParamGet(param_id: Exp[Text]) extends Op[ParamGet] {
    def mirror(f: Tx) = stage(NewParamGet(f(param_id)))(EmptyContext)
  }

  
  object ParamGet {

  @api def apply(param_id: Text): ParamGet = ParamGet(stage(NewParamGet(param_id.s))(ctx))
  }

  object ParamGetRep {

  }

}

trait ScalaGenParamGet extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case ParamGet_param_id(msg) => emit(src"val $lhs = $msg.param_id")
    case ParamGetRep_success(msg) => emit(src"val $lhs = $msg.success")
    case ParamGetRep_value(msg) => emit(src"val $lhs = $msg.value")
    case NewParamGet(param_id) =>
      emit(src"val $lhs = ParamGet($param_id)")
    case ParamGetReply(srv) =>
      emit(src"val $lhs = $srv.response")
    case _ => super.emitNode(lhs, rhs)
  }

}

