
package spatial.ros

import forge._
import org.virtualized._

trait CommandHomeApi extends CommandHomeExp {
  self: RosApi =>

}

trait CommandHomeExp {
  self: RosExp =>
  
  
case class CommandHome_current_gps(srv: Exp[CommandHome]) extends Op[Bool] {
  def mirror(f: Tx) = ???//(CommandHome_current_gps(f(srv)): Exp[Bool])
}

  
case class CommandHome_latitude(srv: Exp[CommandHome]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//(CommandHome_latitude(f(srv)): Exp[FltPt[_24,_8]])
}

  
case class CommandHome_longitude(srv: Exp[CommandHome]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//(CommandHome_longitude(f(srv)): Exp[FltPt[_24,_8]])
}

  
case class CommandHome_altitude(srv: Exp[CommandHome]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//(CommandHome_altitude(f(srv)): Exp[FltPt[_24,_8]])
}

  
case class CommandHomeRep_current_gps(srv: Exp[CommandHomeRep]) extends Op[Bool] {
  def mirror(f: Tx) = ???//CommandHomeRep_current_gps(f(srv))
}

  
case class CommandHomeRep_latitude(srv: Exp[CommandHomeRep]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//CommandHomeRep_latitude(f(srv))
}

  
case class CommandHomeRep_longitude(srv: Exp[CommandHomeRep]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//CommandHomeRep_longitude(f(srv))
}

  
case class CommandHomeRep_altitude(srv: Exp[CommandHomeRep]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//CommandHomeRep_altitude(f(srv))
}

  case class CommandHomeReply(srv: Exp[CommandHome]) extends Op[CommandHomeRep]{
    def mirror(f: Tx) = ???//CommandHomeReply(f(srv))
  }

  implicit object CommandHomeType extends Meta[CommandHome] {
    def wrapped(x: Exp[CommandHome]) = CommandHome(x)
    def stagedClass = classOf[CommandHome]
    def isPrimitive = false
  }

  implicit object CommandHomeRepType extends Meta[CommandHomeRep] {
    def wrapped(x: Exp[CommandHomeRep]) = CommandHomeRep(x)
    def stagedClass = classOf[CommandHomeRep]
    def isPrimitive = false
  }

  case class CommandHome(s: Exp[CommandHome]) extends MetaAny[CommandHome] {
    @api def current_gps: Bool = ???
    @api def latitude: FltPt[_24,_8] = ???
    @api def longitude: FltPt[_24,_8] = ???
    @api def altitude: FltPt[_24,_8] = ???
    @api def response: CommandHomeRep = ???//CommandHomeRep(CommandHomeReply(s))
    @api def ===(that: CommandHome): Bool = ???
    @api def =!=(that: CommandHome): Bool = ???
    @api def toText: Text = ???
  }

  case class CommandHomeRep(s: Exp[CommandHomeRep]) extends MetaAny[CommandHomeRep] {
    @api def success: Bool = ???
    @api def result: FixPt[FALSE,_8,_0] = ???
    @api def ===(that: CommandHomeRep): Bool = ???
    @api def =!=(that: CommandHomeRep): Bool = ???
    @api def toText: Text = ???
  }
  
  object CommandHome {

  }

  object CommandHomeRep {

  }

}

