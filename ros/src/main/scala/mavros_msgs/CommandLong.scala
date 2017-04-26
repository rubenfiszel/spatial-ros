
package spatial.ros

import forge._
import org.virtualized._
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait CommandLongApi extends CommandLongExp {
  self: RosApi =>

}

trait CommandLongExp {
  self: RosExp =>
  
  implicit object CommandLongType extends Meta[CommandLong] {
    def wrapped(x: Exp[CommandLong]) = CommandLong(x)
    def stagedClass = classOf[CommandLong]
    def isPrimitive = false
  }

  implicit object CommandLongSrv extends Srv[CommandLong] {
    type Response = CommandLongRep
    def response(srv: CommandLong) = srv.response
  }

  implicit object CommandLongRepType extends Meta[CommandLongRep] {
    def wrapped(x: Exp[CommandLongRep]) = CommandLongRep(x)
    def stagedClass = classOf[CommandLongRep]
    def isPrimitive = false
  }

  case class CommandLong(s: Exp[CommandLong]) extends MetaAny[CommandLong] {
    @api def command: FixPt[FALSE,_16,_0] = FixPt(stage(CommandLong_command(s))(ctx))
    @api def confirmation: FixPt[FALSE,_8,_0] = FixPt(stage(CommandLong_confirmation(s))(ctx))
    @api def param1: FltPt[_24,_8] = FltPt(stage(CommandLong_param1(s))(ctx))
    @api def param2: FltPt[_24,_8] = FltPt(stage(CommandLong_param2(s))(ctx))
    @api def param3: FltPt[_24,_8] = FltPt(stage(CommandLong_param3(s))(ctx))
    @api def param4: FltPt[_24,_8] = FltPt(stage(CommandLong_param4(s))(ctx))
    @api def response: CommandLongRep = CommandLongRep(stage(CommandLongReply(s))(ctx))
    @api def ===(that: CommandLong): Bool = ???
    @api def =!=(that: CommandLong): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class CommandLongRep(s: Exp[CommandLongRep]) extends MetaAny[CommandLongRep] {
    @api def success: Bool = Bool(stage(CommandLongRep_success(s))(ctx))
    @api def result: FixPt[FALSE,_8,_0] = FixPt(stage(CommandLongRep_result(s))(ctx))
    @api def ===(that: CommandLongRep): Bool = ???
    @api def =!=(that: CommandLongRep): Bool = ???
    @api def toText: Text = textify(this)
  }

  
case class CommandLong_command(msg: Exp[CommandLong]) extends Op[FixPt[FALSE,_16,_0]] {
  def mirror(f: Tx) = stage(CommandLong_command(f(msg)))(EmptyContext)
}

  
case class CommandLong_confirmation(msg: Exp[CommandLong]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(CommandLong_confirmation(f(msg)))(EmptyContext)
}

  
case class CommandLong_param1(msg: Exp[CommandLong]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandLong_param1(f(msg)))(EmptyContext)
}

  
case class CommandLong_param2(msg: Exp[CommandLong]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandLong_param2(f(msg)))(EmptyContext)
}

  
case class CommandLong_param3(msg: Exp[CommandLong]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandLong_param3(f(msg)))(EmptyContext)
}

  
case class CommandLong_param4(msg: Exp[CommandLong]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandLong_param4(f(msg)))(EmptyContext)
}

  
case class CommandLongRep_success(srv: Exp[CommandLongRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(CommandLongRep_success(f(srv)))(EmptyContext)
}

  
case class CommandLongRep_result(srv: Exp[CommandLongRep]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(CommandLongRep_result(f(srv)))(EmptyContext)
}

  case class CommandLongReply(srv: Exp[CommandLong]) extends Op[CommandLongRep]{
    def mirror(f: Tx) = stage(CommandLongReply(f(srv)))(EmptyContext)
  }
  case class NewCommandLong(command: Exp[FixPt[FALSE,_16,_0]], confirmation: Exp[FixPt[FALSE,_8,_0]], param1: Exp[FltPt[_24,_8]], param2: Exp[FltPt[_24,_8]], param3: Exp[FltPt[_24,_8]], param4: Exp[FltPt[_24,_8]]) extends Op[CommandLong] {
    def mirror(f: Tx) = stage(NewCommandLong(f(command), f(confirmation), f(param1), f(param2), f(param3), f(param4)))(EmptyContext)
  }

  
  object CommandLong {

  @api def apply(command: FixPt[FALSE,_16,_0], confirmation: FixPt[FALSE,_8,_0], param1: FltPt[_24,_8], param2: FltPt[_24,_8], param3: FltPt[_24,_8], param4: FltPt[_24,_8]): CommandLong = CommandLong(stage(NewCommandLong(command.s, confirmation.s, param1.s, param2.s, param3.s, param4.s))(ctx))
  }

  object CommandLongRep {

  }

}

trait ScalaGenCommandLong extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case CommandLong_command(msg) => emit(src"val $lhs = $msg.command")
    case CommandLong_confirmation(msg) => emit(src"val $lhs = $msg.confirmation")
    case CommandLong_param1(msg) => emit(src"val $lhs = $msg.param1")
    case CommandLong_param2(msg) => emit(src"val $lhs = $msg.param2")
    case CommandLong_param3(msg) => emit(src"val $lhs = $msg.param3")
    case CommandLong_param4(msg) => emit(src"val $lhs = $msg.param4")
    case CommandLongRep_success(msg) => emit(src"val $lhs = $msg.success")
    case CommandLongRep_result(msg) => emit(src"val $lhs = $msg.result")
    case NewCommandLong(command, confirmation, param1, param2, param3, param4) =>
      emit(src"val $lhs = CommandLong($command, $confirmation, $param1, $param2, $param3, $param4)")
    case CommandLongReply(srv) =>
      emit(src"val $lhs = $srv.response")
    case _ => super.emitNode(lhs, rhs)
  }

}

