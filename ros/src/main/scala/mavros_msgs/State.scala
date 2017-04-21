package spatial.ros

trait StateApi extends StateExp {
    self: RosApi =>

}

trait StateExp {
    self: RosExp =>

    case class State(connected: Bool, armed: Bool, guided: Bool, mode: Text)
}

object State {
}
