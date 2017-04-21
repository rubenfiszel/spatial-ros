package spatial.ros

trait WaypointPullApi extends WaypointPullExp {
self: RosApi =>

  }

trait WaypointPullExp {
    self: RosExp =>

    case class WaypointPull()
    case class WaypointPullReply(success: Bool, wp_received: FixPt[FALSE,_32,_0])
}

object WaypointPull {
}
