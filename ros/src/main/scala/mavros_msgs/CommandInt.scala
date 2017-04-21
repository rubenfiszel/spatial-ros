package spatial.ros

trait CommandIntApi extends CommandIntExp {
self: RosApi =>

  }

trait CommandIntExp {
    self: RosExp =>

    case class CommandInt(frame: FixPt[FALSE,_8,_0], command: FixPt[FALSE,_16,_0], current: FixPt[FALSE,_8,_0], autocontinue: FixPt[FALSE,_8,_0], param1: FltPt[_24,_8], param2: FltPt[_24,_8], param3: FltPt[_24,_8], param4: FltPt[_24,_8])
    case class CommandIntReply(success: Bool)
}

object CommandInt {
}
