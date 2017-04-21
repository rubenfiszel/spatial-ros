package spatial.ros

trait VibrationApi extends VibrationExp {
    self: RosApi =>

}

trait VibrationExp {
    self: RosExp =>

    case class Vibration()
}

object Vibration {
}
