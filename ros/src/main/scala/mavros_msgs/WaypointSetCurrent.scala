package spatial.ros

trait WaypointSetCurrentApi extends WaypointSetCurrentExp {
self: RosApi =>

  }

trait WaypointSetCurrentExp {
    self: RosExp =>

    case class WaypointSetCurrent(wp_seq: FixPt[FALSE,_16,_0])
    case class WaypointSetCurrentReply(success: Bool)
}

object WaypointSetCurrent {
}
