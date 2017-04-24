package spatial.ros

import forge._
import org.virtualized._

trait WaypointApi extends WaypointExp {
    self: RosApi =>

}

trait WaypointExp {
    self: RosExp =>

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
}

object Waypoint{
}
