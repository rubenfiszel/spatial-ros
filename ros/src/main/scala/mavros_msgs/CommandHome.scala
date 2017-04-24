
package spatial.ros

import forge._
import org.virtualized._

trait CommandHomeApi extends CommandHomeExp {
  self: RosApi =>

}

trait CommandHomeExp {
  self: RosExp =>
  
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

  
case class CommandHome_current_gps(srv: Exp[CommandHome]) extends Op[Bool] {
  def mirror(f: Tx) = stage(CommandHome_current_gps(f(srv)))(EmptyContext)
}

  
case class CommandHome_latitude(srv: Exp[CommandHome]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandHome_latitude(f(srv)))(EmptyContext)
}

  
case class CommandHome_longitude(srv: Exp[CommandHome]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandHome_longitude(f(srv)))(EmptyContext)
}

  
case class CommandHome_altitude(srv: Exp[CommandHome]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandHome_altitude(f(srv)))(EmptyContext)
}

  
case class CommandHomeRep_current_gps(srv: Exp[CommandHomeRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(CommandHomeRep_current_gps(f(srv)))(EmptyContext)
}

  
case class CommandHomeRep_latitude(srv: Exp[CommandHomeRep]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandHomeRep_latitude(f(srv)))(EmptyContext)
}

  
case class CommandHomeRep_longitude(srv: Exp[CommandHomeRep]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandHomeRep_longitude(f(srv)))(EmptyContext)
}

  
case class CommandHomeRep_altitude(srv: Exp[CommandHomeRep]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandHomeRep_altitude(f(srv)))(EmptyContext)
}

  case class CommandHomeReply(srv: Exp[CommandHome]) extends Op[CommandHomeRep]{
    def mirror(f: Tx) = stage(CommandHomeReply(f(srv)))(EmptyContext)
  }

  
  object CommandHome {

  }

  object CommandHomeRep {

  }

}

