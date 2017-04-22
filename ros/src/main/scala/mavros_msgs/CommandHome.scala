package spatial.ros

import org.virtualized._

trait CommandHomeApi extends CommandHomeExp {
self: RosApi =>

  }

trait CommandHomeExp {
    self: RosExp =>

    @struct case class CommandHome(current_gps: Bool, latitude: FltPt[_24,_8], longitude: FltPt[_24,_8], altitude: FltPt[_24,_8])
    @struct case class CommandHomeReply(success: Bool, result: FixPt[FALSE,_8,_0])
}

object CommandHome {
}
