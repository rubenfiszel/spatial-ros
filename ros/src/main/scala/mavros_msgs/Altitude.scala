package spatial.ros

import org.virtualized._

trait AltitudeApi extends AltitudeExp {
    self: RosApi =>

}

trait AltitudeExp {
    self: RosExp =>

    case class Altitude(monotonic: FltPt[_24,_8], amsl: FltPt[_24,_8], local: FltPt[_24,_8], relative: FltPt[_24,_8], terrain: FltPt[_24,_8], bottom_clearance: FltPt[_24,_8])
}

object Altitude {
}
