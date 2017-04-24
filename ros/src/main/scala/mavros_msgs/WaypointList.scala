
package spatial.ros

import forge._
import org.virtualized._

trait WaypointListApi extends WaypointListExp {
  self: RosApi =>

}

trait WaypointListExp {
  self: RosExp =>
  
  
case class WaypointList_waypoints(msg: Exp[WaypointList]) extends Op[MetaArray[Waypoint]] {
  def mirror(f: Tx) = ???//WaypointList_waypoints(f(msg))
}


  implicit object WaypointListType extends Meta[WaypointList] {
    def wrapped(x: Exp[WaypointList]) = WaypointList(x)
    def stagedClass = classOf[WaypointList]
    def isPrimitive = false
  }

  case class WaypointList(s: Exp[WaypointList]) extends MetaAny[WaypointList] {
    @api def waypoints: MetaArray[Waypoint] = ???
    @api def ===(that: WaypointList) = ???
    @api def =!=(that: WaypointList) = ???
    @api def toText: Text = ???
  }
  
  object WaypointList {

  }

}

