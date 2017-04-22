package spatial.ros

import org.virtualized._

trait WaypointSetCurrentApi extends WaypointSetCurrentExp {
self: RosApi =>

  }

trait WaypointSetCurrentExp {
    self: RosExp =>

    @struct case class WaypointSetCurrent(wp_seq: FixPt[FALSE,_16,_0])
    @struct case class WaypointSetCurrentReply(success: Bool)
}

object WaypointSetCurrent {
}
