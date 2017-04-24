
package spatial.ros

import forge._
import org.virtualized._

trait WaypointApi extends WaypointExp {
  self: RosApi =>

}

trait WaypointExp {
  self: RosExp =>
  
  
case class Waypoint_frame(msg: Exp[Waypoint]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = ???//Waypoint_frame(f(msg))
}

  
case class Waypoint_command(msg: Exp[Waypoint]) extends Op[FixPt[FALSE,_16,_0]] {
  def mirror(f: Tx) = ???//Waypoint_command(f(msg))
}

  
case class Waypoint_is_current(msg: Exp[Waypoint]) extends Op[Bool] {
  def mirror(f: Tx) = ???//Waypoint_is_current(f(msg))
}

  
case class Waypoint_autocontinue(msg: Exp[Waypoint]) extends Op[Bool] {
  def mirror(f: Tx) = ???//Waypoint_autocontinue(f(msg))
}

  
case class Waypoint_param1(msg: Exp[Waypoint]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//Waypoint_param1(f(msg))
}

  
case class Waypoint_param2(msg: Exp[Waypoint]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//Waypoint_param2(f(msg))
}

  
case class Waypoint_param3(msg: Exp[Waypoint]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//Waypoint_param3(f(msg))
}

  
case class Waypoint_param4(msg: Exp[Waypoint]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//Waypoint_param4(f(msg))
}

  
case class Waypoint_x_lat(msg: Exp[Waypoint]) extends Op[FltPt[_53,_11]] {
  def mirror(f: Tx) = ???//Waypoint_x_lat(f(msg))
}

  
case class Waypoint_y_long(msg: Exp[Waypoint]) extends Op[FltPt[_53,_11]] {
  def mirror(f: Tx) = ???//Waypoint_y_long(f(msg))
}

  
case class Waypoint_z_alt(msg: Exp[Waypoint]) extends Op[FltPt[_53,_11]] {
  def mirror(f: Tx) = ???//Waypoint_z_alt(f(msg))
}


  implicit object WaypointType extends Meta[Waypoint] {
    def wrapped(x: Exp[Waypoint]) = Waypoint(x)
    def stagedClass = classOf[Waypoint]
    def isPrimitive = false
  }

  case class Waypoint(s: Exp[Waypoint]) extends MetaAny[Waypoint] {
    @api def frame: FixPt[FALSE,_8,_0] = ???
    @api def command: FixPt[FALSE,_16,_0] = ???
    @api def is_current: Bool = ???
    @api def autocontinue: Bool = ???
    @api def param1: FltPt[_24,_8] = ???
    @api def param2: FltPt[_24,_8] = ???
    @api def param3: FltPt[_24,_8] = ???
    @api def param4: FltPt[_24,_8] = ???
    @api def x_lat: FltPt[_53,_11] = ???
    @api def y_long: FltPt[_53,_11] = ???
    @api def z_alt: FltPt[_53,_11] = ???
    @api def ===(that: Waypoint) = ???
    @api def =!=(that: Waypoint) = ???
    @api def toText: Text = ???
  }
  
  object Waypoint {

  }

}

