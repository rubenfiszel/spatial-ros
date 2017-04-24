
package spatial.ros

import forge._
import org.virtualized._

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

  implicit object CommandLongRepType extends Meta[CommandLongRep] {
    def wrapped(x: Exp[CommandLongRep]) = CommandLongRep(x)
    def stagedClass = classOf[CommandLongRep]
    def isPrimitive = false
  }

  case class CommandLong(s: Exp[CommandLong]) extends MetaAny[CommandLong] {
    @api def command: FixPt[FALSE,_16,_0] = ???
    @api def confirmation: FixPt[FALSE,_8,_0] = ???
    @api def param1: FltPt[_24,_8] = ???
    @api def param2: FltPt[_24,_8] = ???
    @api def param3: FltPt[_24,_8] = ???
    @api def param4: FltPt[_24,_8] = ???
    @api def response: CommandLongRep = ???//CommandLongRep(CommandLongReply(s))
    @api def ===(that: CommandLong): Bool = ???
    @api def =!=(that: CommandLong): Bool = ???
    @api def toText: Text = ???
  }

  case class CommandLongRep(s: Exp[CommandLongRep]) extends MetaAny[CommandLongRep] {
    @api def success: Bool = ???
    @api def result: FixPt[FALSE,_8,_0] = ???
    @api def ===(that: CommandLongRep): Bool = ???
    @api def =!=(that: CommandLongRep): Bool = ???
    @api def toText: Text = ???
  }

  
case class CommandLong_command(srv: Exp[CommandLong]) extends Op[FixPt[FALSE,_16,_0]] {
  def mirror(f: Tx) = stage(CommandLong_command(f(srv)))(EmptyContext)
}

  
case class CommandLong_confirmation(srv: Exp[CommandLong]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(CommandLong_confirmation(f(srv)))(EmptyContext)
}

  
case class CommandLong_param1(srv: Exp[CommandLong]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandLong_param1(f(srv)))(EmptyContext)
}

  
case class CommandLong_param2(srv: Exp[CommandLong]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandLong_param2(f(srv)))(EmptyContext)
}

  
case class CommandLong_param3(srv: Exp[CommandLong]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandLong_param3(f(srv)))(EmptyContext)
}

  
case class CommandLong_param4(srv: Exp[CommandLong]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandLong_param4(f(srv)))(EmptyContext)
}

  
case class CommandLongRep_command(srv: Exp[CommandLongRep]) extends Op[FixPt[FALSE,_16,_0]] {
  def mirror(f: Tx) = stage(CommandLongRep_command(f(srv)))(EmptyContext)
}

  
case class CommandLongRep_confirmation(srv: Exp[CommandLongRep]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(CommandLongRep_confirmation(f(srv)))(EmptyContext)
}

  
case class CommandLongRep_param1(srv: Exp[CommandLongRep]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandLongRep_param1(f(srv)))(EmptyContext)
}

  
case class CommandLongRep_param2(srv: Exp[CommandLongRep]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandLongRep_param2(f(srv)))(EmptyContext)
}

  
case class CommandLongRep_param3(srv: Exp[CommandLongRep]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandLongRep_param3(f(srv)))(EmptyContext)
}

  
case class CommandLongRep_param4(srv: Exp[CommandLongRep]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandLongRep_param4(f(srv)))(EmptyContext)
}

  case class CommandLongReply(srv: Exp[CommandLong]) extends Op[CommandLongRep]{
    def mirror(f: Tx) = stage(CommandLongReply(f(srv)))(EmptyContext)
  }

  
  object CommandLong {

  }

  object CommandLongRep {

  }

}

