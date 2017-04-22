package spatial.ros

import org.virtualized._

trait WaypointListApi extends WaypointListExp {
    self: RosApi =>

}

trait WaypointListExp {
    self: RosExp =>

    @struct case class WaypointList(waypoints: MetaArray[Waypoint])
}

object WaypointList {
}
