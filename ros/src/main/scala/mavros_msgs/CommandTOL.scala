package spatial.ros

import org.virtualized._

trait CommandTOLApi extends CommandTOLExp {
self: RosApi =>

  }

trait CommandTOLExp {
    self: RosExp =>

    @struct case class CommandTOL(yaw: FltPt[_24,_8], latitude: FltPt[_24,_8], longitude: FltPt[_24,_8], altitude: FltPt[_24,_8])
    @struct case class CommandTOLReply(success: Bool, result: FixPt[FALSE,_8,_0])
}

object CommandTOL {
}
