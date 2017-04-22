package spatial.ros

import org.virtualized._

trait HilControlsApi extends HilControlsExp {
    self: RosApi =>

}

trait HilControlsExp {
    self: RosExp =>

    @struct case class HilControls(roll_ailerons: FltPt[_24,_8], pitch_elevator: FltPt[_24,_8], yaw_rudder: FltPt[_24,_8], throttle: FltPt[_24,_8], aux1: FltPt[_24,_8], aux2: FltPt[_24,_8], aux3: FltPt[_24,_8], aux4: FltPt[_24,_8], mode: FixPt[FALSE,_8,_0], nav_mode: FixPt[FALSE,_8,_0])
}

object HilControls {
}
