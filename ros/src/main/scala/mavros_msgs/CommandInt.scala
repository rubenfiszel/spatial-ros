
package spatial.ros

import forge._
import org.virtualized._
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait CommandIntApi extends CommandIntExp {
  self: RosApi =>

}

trait CommandIntExp {
  self: RosExp =>
  
  implicit object CommandIntType extends Meta[CommandInt] {
    def wrapped(x: Exp[CommandInt]) = CommandInt(x)
    def stagedClass = classOf[CommandInt]
    def isPrimitive = false
  }

  implicit object CommandIntSrv extends Srv[CommandInt] {
    type Response = CommandIntRep
    def response(srv: CommandInt) = srv.response
  }

  implicit object CommandIntRepType extends Meta[CommandIntRep] {
    def wrapped(x: Exp[CommandIntRep]) = CommandIntRep(x)
    def stagedClass = classOf[CommandIntRep]
    def isPrimitive = false
  }

  case class CommandInt(s: Exp[CommandInt]) extends MetaAny[CommandInt] {
    @api def frame: FixPt[FALSE,_8,_0] = FixPt(stage(CommandInt_frame(s))(ctx))
    @api def command: FixPt[FALSE,_16,_0] = FixPt(stage(CommandInt_command(s))(ctx))
    @api def current: FixPt[FALSE,_8,_0] = FixPt(stage(CommandInt_current(s))(ctx))
    @api def autocontinue: FixPt[FALSE,_8,_0] = FixPt(stage(CommandInt_autocontinue(s))(ctx))
    @api def param1: FltPt[_24,_8] = FltPt(stage(CommandInt_param1(s))(ctx))
    @api def param2: FltPt[_24,_8] = FltPt(stage(CommandInt_param2(s))(ctx))
    @api def param3: FltPt[_24,_8] = FltPt(stage(CommandInt_param3(s))(ctx))
    @api def param4: FltPt[_24,_8] = FltPt(stage(CommandInt_param4(s))(ctx))
    @api def response: CommandIntRep = CommandIntRep(stage(CommandIntReply(s))(ctx))
    @api def ===(that: CommandInt): Bool = ???
    @api def =!=(that: CommandInt): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class CommandIntRep(s: Exp[CommandIntRep]) extends MetaAny[CommandIntRep] {
    @api def success: Bool = Bool(stage(CommandIntRep_success(s))(ctx))
    @api def ===(that: CommandIntRep): Bool = ???
    @api def =!=(that: CommandIntRep): Bool = ???
    @api def toText: Text = textify(this)
  }

  
case class CommandInt_frame(msg: Exp[CommandInt]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(CommandInt_frame(f(msg)))(EmptyContext)
}

  
case class CommandInt_command(msg: Exp[CommandInt]) extends Op[FixPt[FALSE,_16,_0]] {
  def mirror(f: Tx) = stage(CommandInt_command(f(msg)))(EmptyContext)
}

  
case class CommandInt_current(msg: Exp[CommandInt]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(CommandInt_current(f(msg)))(EmptyContext)
}

  
case class CommandInt_autocontinue(msg: Exp[CommandInt]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(CommandInt_autocontinue(f(msg)))(EmptyContext)
}

  
case class CommandInt_param1(msg: Exp[CommandInt]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandInt_param1(f(msg)))(EmptyContext)
}

  
case class CommandInt_param2(msg: Exp[CommandInt]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandInt_param2(f(msg)))(EmptyContext)
}

  
case class CommandInt_param3(msg: Exp[CommandInt]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandInt_param3(f(msg)))(EmptyContext)
}

  
case class CommandInt_param4(msg: Exp[CommandInt]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandInt_param4(f(msg)))(EmptyContext)
}

  
case class CommandIntRep_success(srv: Exp[CommandIntRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(CommandIntRep_success(f(srv)))(EmptyContext)
}

  case class CommandIntReply(srv: Exp[CommandInt]) extends Op[CommandIntRep]{
    def mirror(f: Tx) = stage(CommandIntReply(f(srv)))(EmptyContext)
  }
  case class NewCommandInt(frame: Exp[FixPt[FALSE,_8,_0]], command: Exp[FixPt[FALSE,_16,_0]], current: Exp[FixPt[FALSE,_8,_0]], autocontinue: Exp[FixPt[FALSE,_8,_0]], param1: Exp[FltPt[_24,_8]], param2: Exp[FltPt[_24,_8]], param3: Exp[FltPt[_24,_8]], param4: Exp[FltPt[_24,_8]]) extends Op[CommandInt] {
    def mirror(f: Tx) = stage(NewCommandInt(f(frame), f(command), f(current), f(autocontinue), f(param1), f(param2), f(param3), f(param4)))(EmptyContext)
  }

  
  object CommandInt {

  @api def apply(frame: FixPt[FALSE,_8,_0], command: FixPt[FALSE,_16,_0], current: FixPt[FALSE,_8,_0], autocontinue: FixPt[FALSE,_8,_0], param1: FltPt[_24,_8], param2: FltPt[_24,_8], param3: FltPt[_24,_8], param4: FltPt[_24,_8]): CommandInt = CommandInt(stage(NewCommandInt(frame.s, command.s, current.s, autocontinue.s, param1.s, param2.s, param3.s, param4.s))(ctx))
  }

  object CommandIntRep {

  }

}

trait ScalaGenCommandInt extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case CommandInt_frame(msg) => emit(src"val $lhs = $msg.frame")
    case CommandInt_command(msg) => emit(src"val $lhs = $msg.command")
    case CommandInt_current(msg) => emit(src"val $lhs = $msg.current")
    case CommandInt_autocontinue(msg) => emit(src"val $lhs = $msg.autocontinue")
    case CommandInt_param1(msg) => emit(src"val $lhs = $msg.param1")
    case CommandInt_param2(msg) => emit(src"val $lhs = $msg.param2")
    case CommandInt_param3(msg) => emit(src"val $lhs = $msg.param3")
    case CommandInt_param4(msg) => emit(src"val $lhs = $msg.param4")
    case CommandIntRep_success(msg) => emit(src"val $lhs = $msg.success")
    case NewCommandInt(frame, command, current, autocontinue, param1, param2, param3, param4) =>
      emit(src"val $lhs = CommandInt($frame, $command, $current, $autocontinue, $param1, $param2, $param3, $param4)")
    case CommandIntReply(srv) =>
      emit(src"val $lhs = $srv.response")
    case _ => super.emitNode(lhs, rhs)
  }

}

