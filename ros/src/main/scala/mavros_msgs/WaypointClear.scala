package spatial.ros

trait WaypointClearApi extends WaypointClearExp {
self: RosApi =>

  }

trait WaypointClearExp {
    self: RosExp =>

    case class WaypointClear()
    case class WaypointClearReply(success: Bool)
}

object WaypointClear {
}
