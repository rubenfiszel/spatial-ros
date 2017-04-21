package spatial.ros

trait WaypointPushApi extends WaypointPushExp {
self: RosApi =>

  }

trait WaypointPushExp {
    self: RosExp =>

    case class WaypointPush(waypoints: Array[Waypoint])
    case class WaypointPushReply(success: Bool, wp_transfered: FixPt[FALSE,_32,_0])
}

object WaypointPush {
}
