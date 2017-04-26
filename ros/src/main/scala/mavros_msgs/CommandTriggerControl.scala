
package spatial.ros

import forge._
import org.virtualized._
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait CommandTriggerControlApi extends CommandTriggerControlExp {
  self: RosApi =>

}

trait CommandTriggerControlExp {
  self: RosExp =>
  
  implicit object CommandTriggerControlType extends Meta[CommandTriggerControl] {
    def wrapped(x: Exp[CommandTriggerControl]) = CommandTriggerControl(x)
    def stagedClass = classOf[CommandTriggerControl]
    def isPrimitive = false
  }

  implicit object CommandTriggerControlSrv extends Srv[CommandTriggerControl] {
    type Response = CommandTriggerControlRep
    def response(srv: CommandTriggerControl) = srv.response
  }

  implicit object CommandTriggerControlRepType extends Meta[CommandTriggerControlRep] {
    def wrapped(x: Exp[CommandTriggerControlRep]) = CommandTriggerControlRep(x)
    def stagedClass = classOf[CommandTriggerControlRep]
    def isPrimitive = false
  }

  case class CommandTriggerControl(s: Exp[CommandTriggerControl]) extends MetaAny[CommandTriggerControl] {

    @api def response: CommandTriggerControlRep = CommandTriggerControlRep(stage(CommandTriggerControlReply(s))(ctx))
    @api def ===(that: CommandTriggerControl): Bool = ???
    @api def =!=(that: CommandTriggerControl): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class CommandTriggerControlRep(s: Exp[CommandTriggerControlRep]) extends MetaAny[CommandTriggerControlRep] {
    @api def success: Bool = Bool(stage(CommandTriggerControlRep_success(s))(ctx))
    @api def result: FixPt[FALSE,_8,_0] = FixPt(stage(CommandTriggerControlRep_result(s))(ctx))
    @api def ===(that: CommandTriggerControlRep): Bool = ???
    @api def =!=(that: CommandTriggerControlRep): Bool = ???
    @api def toText: Text = textify(this)
  }


  
case class CommandTriggerControlRep_success(srv: Exp[CommandTriggerControlRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(CommandTriggerControlRep_success(f(srv)))(EmptyContext)
}

  
case class CommandTriggerControlRep_result(srv: Exp[CommandTriggerControlRep]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(CommandTriggerControlRep_result(f(srv)))(EmptyContext)
}

  case class CommandTriggerControlReply(srv: Exp[CommandTriggerControl]) extends Op[CommandTriggerControlRep]{
    def mirror(f: Tx) = stage(CommandTriggerControlReply(f(srv)))(EmptyContext)
  }
  case class NewCommandTriggerControl() extends Op[CommandTriggerControl] {
    def mirror(f: Tx) = stage(NewCommandTriggerControl())(EmptyContext)
  }

  
  object CommandTriggerControl {

  @api def apply(): CommandTriggerControl = CommandTriggerControl(stage(NewCommandTriggerControl())(ctx))
  }

  object CommandTriggerControlRep {

  }

}

trait ScalaGenCommandTriggerControl extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {

    case CommandTriggerControlRep_success(msg) => emit(src"val $lhs = $msg.success")
    case CommandTriggerControlRep_result(msg) => emit(src"val $lhs = $msg.result")
    case NewCommandTriggerControl() =>
      emit(src"val $lhs = CommandTriggerControl()")
    case CommandTriggerControlReply(srv) =>
      emit(src"val $lhs = $srv.response")
    case _ => super.emitNode(lhs, rhs)
  }

}

