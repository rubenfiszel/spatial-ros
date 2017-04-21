package spatial.ros

trait ExtendedStateApi extends ExtendedStateExp {
    self: RosApi =>

}

trait ExtendedStateExp {
    self: RosExp =>

    case class ExtendedState(vtol_state: FixPt[FALSE,_8,_0], landed_state: FixPt[FALSE,_8,_0])
}

object ExtendedState {
}
