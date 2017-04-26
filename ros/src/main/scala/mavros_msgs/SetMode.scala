
package spatial.ros

import forge._
import org.virtualized._
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait SetModeApi extends SetModeExp {
  self: RosApi =>

}

trait SetModeExp {
  self: RosExp =>
  
  implicit object SetModeType extends Meta[SetMode] {
    def wrapped(x: Exp[SetMode]) = SetMode(x)
    def stagedClass = classOf[SetMode]
    def isPrimitive = false
  }

  implicit object SetModeSrv extends Srv[SetMode] {
    type Response = SetModeRep
    def response(srv: SetMode) = srv.response
  }

  implicit object SetModeRepType extends Meta[SetModeRep] {
    def wrapped(x: Exp[SetModeRep]) = SetModeRep(x)
    def stagedClass = classOf[SetModeRep]
    def isPrimitive = false
  }

  case class SetMode(s: Exp[SetMode]) extends MetaAny[SetMode] {

    @api def response: SetModeRep = SetModeRep(stage(SetModeReply(s))(ctx))
    @api def ===(that: SetMode): Bool = ???
    @api def =!=(that: SetMode): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class SetModeRep(s: Exp[SetModeRep]) extends MetaAny[SetModeRep] {
    @api def success: Bool = Bool(stage(SetModeRep_success(s))(ctx))
    @api def ===(that: SetModeRep): Bool = ???
    @api def =!=(that: SetModeRep): Bool = ???
    @api def toText: Text = textify(this)
  }


  
case class SetModeRep_success(srv: Exp[SetModeRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(SetModeRep_success(f(srv)))(EmptyContext)
}

  case class SetModeReply(srv: Exp[SetMode]) extends Op[SetModeRep]{
    def mirror(f: Tx) = stage(SetModeReply(f(srv)))(EmptyContext)
  }
  case class NewSetMode() extends Op[SetMode] {
    def mirror(f: Tx) = stage(NewSetMode())(EmptyContext)
  }

  
  object SetMode {

  @api def apply(): SetMode = SetMode(stage(NewSetMode())(ctx))
  }

  object SetModeRep {

  }

}

trait ScalaGenSetMode extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {

    case SetModeRep_success(msg) => emit(src"val $lhs = $msg.success")
    case NewSetMode() =>
      emit(src"val $lhs = SetMode()")
    case SetModeReply(srv) =>
      emit(src"val $lhs = $srv.response")
    case _ => super.emitNode(lhs, rhs)
  }

}

