
package spatial.ros

import forge._
import org.virtualized._

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
    @api def response: CommandIntRep = ???//CommandIntRep(CommandIntReply(s))
    @api def ===(that: CommandInt): Bool = ???
    @api def =!=(that: CommandInt): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class CommandIntRep(s: Exp[CommandIntRep]) extends MetaAny[CommandIntRep] {
    @api def success: Bool = Bool(stage(CommandIntRep_reply_success(s))(ctx))
    @api def ===(that: CommandIntRep): Bool = ???
    @api def =!=(that: CommandIntRep): Bool = ???
    @api def toText: Text = textify(this)
  }

  
case class CommandInt_frame(srv: Exp[CommandInt]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(CommandInt_frame(f(srv)))(EmptyContext)
}

  
case class CommandInt_command(srv: Exp[CommandInt]) extends Op[FixPt[FALSE,_16,_0]] {
  def mirror(f: Tx) = stage(CommandInt_command(f(srv)))(EmptyContext)
}

  
case class CommandInt_current(srv: Exp[CommandInt]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(CommandInt_current(f(srv)))(EmptyContext)
}

  
case class CommandInt_autocontinue(srv: Exp[CommandInt]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(CommandInt_autocontinue(f(srv)))(EmptyContext)
}

  
case class CommandInt_param1(srv: Exp[CommandInt]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandInt_param1(f(srv)))(EmptyContext)
}

  
case class CommandInt_param2(srv: Exp[CommandInt]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandInt_param2(f(srv)))(EmptyContext)
}

  
case class CommandInt_param3(srv: Exp[CommandInt]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandInt_param3(f(srv)))(EmptyContext)
}

  
case class CommandInt_param4(srv: Exp[CommandInt]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandInt_param4(f(srv)))(EmptyContext)
}

  
case class CommandIntRep_reply_success(srv: Exp[CommandIntRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(CommandIntRep_reply_success(f(srv)))(EmptyContext)
}

  case class CommandIntReply(srv: Exp[CommandInt]) extends Op[CommandIntRep]{
    def mirror(f: Tx) = stage(CommandIntReply(f(srv)))(EmptyContext)
  }

  
  object CommandInt {

  }

  object CommandIntRep {

  }

}

