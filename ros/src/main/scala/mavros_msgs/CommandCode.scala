package spatial.ros

import org.virtualized._

trait CommandCodeApi extends CommandCodeExp {
    self: RosApi =>

}

trait CommandCodeExp {
    self: RosExp =>

    case class CommandCode()
}

object CommandCode {
}
