package spatial.ros

import org.virtualized._

trait CommandLongApi extends CommandLongExp {
self: RosApi =>

  }

trait CommandLongExp {
    self: RosExp =>

    case class CommandLong(command: FixPt[FALSE,_16,_0], confirmation: FixPt[FALSE,_8,_0], param1: FltPt[_24,_8], param2: FltPt[_24,_8], param3: FltPt[_24,_8], param4: FltPt[_24,_8])
    case class CommandLongReply(success: Bool, result: FixPt[FALSE,_8,_0])
}

object CommandLong {
}
