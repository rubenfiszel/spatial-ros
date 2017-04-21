package spatial.ros

trait CommandCodeApi extends CommandCodeExp {
    self: RosApi =>

}

trait CommandCodeExp {
    self: RosExp =>

    case class CommandCode()
}

object CommandCode {
}
