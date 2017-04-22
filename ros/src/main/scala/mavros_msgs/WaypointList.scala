package spatial.ros

import org.virtualized._

trait WaypointListApi extends WaypointListExp {
    self: RosApi =>

}

trait WaypointListExp {
    self: RosExp =>

    case class WaypointList(waypoints: Array[Waypoint])
}

object WaypointList {
}
