package spatial.ros

import org.virtualized._

trait VibrationApi extends VibrationExp {
    self: RosApi =>

}

trait VibrationExp {
    self: RosExp =>

    case class Vibration()
}

object Vibration {
}
