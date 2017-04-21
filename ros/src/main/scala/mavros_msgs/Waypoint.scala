package spatial.ros

trait WaypointApi extends WaypointExp {
    self: RosApi =>

}

trait WaypointExp {
    self: RosExp =>

    case class Waypoint(frame: FixPt[FALSE,_8,_0], command: FixPt[FALSE,_16,_0], is_current: Bool, autocontinue: Bool, param1: FltPt[_24,_8], param2: FltPt[_24,_8], param3: FltPt[_24,_8], param4: FltPt[_24,_8], x_lat: FltPt[_53,_11], y_long: FltPt[_53,_11], z_alt: FltPt[_53,_11])
}

object Waypoint {
}
