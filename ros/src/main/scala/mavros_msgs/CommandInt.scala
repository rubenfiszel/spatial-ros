
package spatial.ros

import forge._
import org.virtualized._

trait CommandIntApi extends CommandIntExp {
  self: RosApi =>

}

trait CommandIntExp {
  self: RosExp =>
  
  
case class CommandInt_frame(srv: Exp[CommandInt]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = ???//(CommandInt_frame(f(srv)): Exp[FixPt[FALSE,_8,_0]])
}

  
case class CommandInt_command(srv: Exp[CommandInt]) extends Op[FixPt[FALSE,_16,_0]] {
  def mirror(f: Tx) = ???//(CommandInt_command(f(srv)): Exp[FixPt[FALSE,_16,_0]])
}

  
case class CommandInt_current(srv: Exp[CommandInt]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = ???//(CommandInt_current(f(srv)): Exp[FixPt[FALSE,_8,_0]])
}

  
case class CommandInt_autocontinue(srv: Exp[CommandInt]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = ???//(CommandInt_autocontinue(f(srv)): Exp[FixPt[FALSE,_8,_0]])
}

  
case class CommandInt_param1(srv: Exp[CommandInt]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//(CommandInt_param1(f(srv)): Exp[FltPt[_24,_8]])
}

  
case class CommandInt_param2(srv: Exp[CommandInt]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//(CommandInt_param2(f(srv)): Exp[FltPt[_24,_8]])
}

  
case class CommandInt_param3(srv: Exp[CommandInt]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//(CommandInt_param3(f(srv)): Exp[FltPt[_24,_8]])
}

  
case class CommandInt_param4(srv: Exp[CommandInt]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//(CommandInt_param4(f(srv)): Exp[FltPt[_24,_8]])
}

  
case class CommandIntRep_frame(srv: Exp[CommandIntRep]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = ???//CommandIntRep_frame(f(srv))
}

  
case class CommandIntRep_command(srv: Exp[CommandIntRep]) extends Op[FixPt[FALSE,_16,_0]] {
  def mirror(f: Tx) = ???//CommandIntRep_command(f(srv))
}

  
case class CommandIntRep_current(srv: Exp[CommandIntRep]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = ???//CommandIntRep_current(f(srv))
}

  
case class CommandIntRep_autocontinue(srv: Exp[CommandIntRep]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = ???//CommandIntRep_autocontinue(f(srv))
}

  
case class CommandIntRep_param1(srv: Exp[CommandIntRep]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//CommandIntRep_param1(f(srv))
}

  
case class CommandIntRep_param2(srv: Exp[CommandIntRep]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//CommandIntRep_param2(f(srv))
}

  
case class CommandIntRep_param3(srv: Exp[CommandIntRep]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//CommandIntRep_param3(f(srv))
}

  
case class CommandIntRep_param4(srv: Exp[CommandIntRep]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//CommandIntRep_param4(f(srv))
}

  case class CommandIntReply(srv: Exp[CommandInt]) extends Op[CommandIntRep]{
    def mirror(f: Tx) = ???//CommandIntReply(f(srv))
  }

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
    @api def frame: FixPt[FALSE,_8,_0] = ???
    @api def command: FixPt[FALSE,_16,_0] = ???
    @api def current: FixPt[FALSE,_8,_0] = ???
    @api def autocontinue: FixPt[FALSE,_8,_0] = ???
    @api def param1: FltPt[_24,_8] = ???
    @api def param2: FltPt[_24,_8] = ???
    @api def param3: FltPt[_24,_8] = ???
    @api def param4: FltPt[_24,_8] = ???
    @api def response: CommandIntRep = ???//CommandIntRep(CommandIntReply(s))
    @api def ===(that: CommandInt): Bool = ???
    @api def =!=(that: CommandInt): Bool = ???
    @api def toText: Text = ???
  }

  case class CommandIntRep(s: Exp[CommandIntRep]) extends MetaAny[CommandIntRep] {
    @api def success: Bool = ???
    @api def ===(that: CommandIntRep): Bool = ???
    @api def =!=(that: CommandIntRep): Bool = ???
    @api def toText: Text = ???
  }
  
  object CommandInt {

  }

  object CommandIntRep {

  }

}

