package spatial.ros

trait ActuatorControlApi extends ActuatorControlExp {
    self: RosApi =>

}

trait ActuatorControlExp {
    self: RosExp =>

    case class ActuatorControl(group_mix: FixPt[FALSE,_8,_0], controls: FltPt[_24,_8])
}

object ActuatorControl {
}
