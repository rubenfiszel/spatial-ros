
package spatial.ros

import forge._
import org.virtualized._

trait CommandTOLApi extends CommandTOLExp {
  self: RosApi =>

}

trait CommandTOLExp {
  self: RosExp =>
  
  
case class CommandTOL_yaw(srv: Exp[CommandTOL]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//(CommandTOL_yaw(f(srv)): Exp[FltPt[_24,_8]])
}

  
case class CommandTOL_latitude(srv: Exp[CommandTOL]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//(CommandTOL_latitude(f(srv)): Exp[FltPt[_24,_8]])
}

  
case class CommandTOL_longitude(srv: Exp[CommandTOL]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//(CommandTOL_longitude(f(srv)): Exp[FltPt[_24,_8]])
}

  
case class CommandTOL_altitude(srv: Exp[CommandTOL]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//(CommandTOL_altitude(f(srv)): Exp[FltPt[_24,_8]])
}

  
case class CommandTOLRep_yaw(srv: Exp[CommandTOLRep]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//CommandTOLRep_yaw(f(srv))
}

  
case class CommandTOLRep_latitude(srv: Exp[CommandTOLRep]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//CommandTOLRep_latitude(f(srv))
}

  
case class CommandTOLRep_longitude(srv: Exp[CommandTOLRep]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//CommandTOLRep_longitude(f(srv))
}

  
case class CommandTOLRep_altitude(srv: Exp[CommandTOLRep]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//CommandTOLRep_altitude(f(srv))
}

  case class CommandTOLReply(srv: Exp[CommandTOL]) extends Op[CommandTOLRep]{
    def mirror(f: Tx) = ???//CommandTOLReply(f(srv))
  }

  implicit object CommandTOLType extends Meta[CommandTOL] {
    def wrapped(x: Exp[CommandTOL]) = CommandTOL(x)
    def stagedClass = classOf[CommandTOL]
    def isPrimitive = false
  }

  implicit object CommandTOLRepType extends Meta[CommandTOLRep] {
    def wrapped(x: Exp[CommandTOLRep]) = CommandTOLRep(x)
    def stagedClass = classOf[CommandTOLRep]
    def isPrimitive = false
  }

  case class CommandTOL(s: Exp[CommandTOL]) extends MetaAny[CommandTOL] {
    @api def yaw: FltPt[_24,_8] = ???
    @api def latitude: FltPt[_24,_8] = ???
    @api def longitude: FltPt[_24,_8] = ???
    @api def altitude: FltPt[_24,_8] = ???
    @api def response: CommandTOLRep = ???//CommandTOLRep(CommandTOLReply(s))
    @api def ===(that: CommandTOL): Bool = ???
    @api def =!=(that: CommandTOL): Bool = ???
    @api def toText: Text = ???
  }

  case class CommandTOLRep(s: Exp[CommandTOLRep]) extends MetaAny[CommandTOLRep] {
    @api def success: Bool = ???
    @api def result: FixPt[FALSE,_8,_0] = ???
    @api def ===(that: CommandTOLRep): Bool = ???
    @api def =!=(that: CommandTOLRep): Bool = ???
    @api def toText: Text = ???
  }
  
  object CommandTOL {

  }

  object CommandTOLRep {

  }

}

