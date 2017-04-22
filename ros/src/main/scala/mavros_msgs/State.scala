package spatial.ros

import org.virtualized._

trait StateApi extends StateExp {
    self: RosApi =>

}

trait StateExp {
    self: RosExp =>

    @struct case class State(connected: Bool, armed: Bool, guided: Bool, mode: Text)
}

object State {
}
