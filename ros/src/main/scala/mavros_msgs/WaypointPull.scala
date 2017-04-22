package spatial.ros

import org.virtualized._

trait WaypointPullApi extends WaypointPullExp {
self: RosApi =>

  }

trait WaypointPullExp {
    self: RosExp =>

    case class WaypointPull()
    @struct case class WaypointPullReply(success: Bool, wp_received: FixPt[FALSE,_32,_0])
}

object WaypointPull {
}
