package spatial.ros

trait CommandTriggerControlApi extends CommandTriggerControlExp {
self: RosApi =>

  }

trait CommandTriggerControlExp {
    self: RosExp =>

    case class CommandTriggerControl()
    case class CommandTriggerControlReply(success: Bool, result: FixPt[FALSE,_8,_0])
}

object CommandTriggerControl {
}
