package spatial.ros

import org.virtualized._

trait WaypointPushApi extends WaypointPushExp {
self: RosApi =>

  }

trait WaypointPushExp {
    self: RosExp =>

    case class WaypointPush(waypoints: MetaArray[Waypoint])
    case class WaypointPushReply(success: Bool, wp_transfered: FixPt[FALSE,_32,_0])
}

object WaypointPush {
}
