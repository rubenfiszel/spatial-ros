
package spatial.ros

import forge._
import org.virtualized._

trait CommandTOLApi extends CommandTOLExp {
  self: RosApi =>

}

trait CommandTOLExp {
  self: RosExp =>
  
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

  
case class CommandTOL_yaw(srv: Exp[CommandTOL]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandTOL_yaw(f(srv)))(EmptyContext)
}

  
case class CommandTOL_latitude(srv: Exp[CommandTOL]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandTOL_latitude(f(srv)))(EmptyContext)
}

  
case class CommandTOL_longitude(srv: Exp[CommandTOL]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandTOL_longitude(f(srv)))(EmptyContext)
}

  
case class CommandTOL_altitude(srv: Exp[CommandTOL]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandTOL_altitude(f(srv)))(EmptyContext)
}

  
case class CommandTOLRep_yaw(srv: Exp[CommandTOLRep]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandTOLRep_yaw(f(srv)))(EmptyContext)
}

  
case class CommandTOLRep_latitude(srv: Exp[CommandTOLRep]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandTOLRep_latitude(f(srv)))(EmptyContext)
}

  
case class CommandTOLRep_longitude(srv: Exp[CommandTOLRep]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandTOLRep_longitude(f(srv)))(EmptyContext)
}

  
case class CommandTOLRep_altitude(srv: Exp[CommandTOLRep]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandTOLRep_altitude(f(srv)))(EmptyContext)
}

  case class CommandTOLReply(srv: Exp[CommandTOL]) extends Op[CommandTOLRep]{
    def mirror(f: Tx) = stage(CommandTOLReply(f(srv)))(EmptyContext)
  }

  
  object CommandTOL {

  }

  object CommandTOLRep {

  }

}

