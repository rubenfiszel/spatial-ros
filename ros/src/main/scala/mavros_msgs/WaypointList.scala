package spatial.ros

trait WaypointListApi extends WaypointListExp {
    self: RosApi =>

}

trait WaypointListExp {
    self: RosExp =>

    case class WaypointList(waypoints: Array[Waypoint])
}

object WaypointList {
}
