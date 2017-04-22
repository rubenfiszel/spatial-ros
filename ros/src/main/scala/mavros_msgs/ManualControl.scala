package spatial.ros

import org.virtualized._

trait ManualControlApi extends ManualControlExp {
    self: RosApi =>

}

trait ManualControlExp {
    self: RosExp =>

    case class ManualControl(x: FltPt[_24,_8], y: FltPt[_24,_8], z: FltPt[_24,_8], r: FltPt[_24,_8], buttons: FixPt[FALSE,_16,_0])
}

object ManualControl {
}
