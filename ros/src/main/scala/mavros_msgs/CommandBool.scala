package spatial.ros

import org.virtualized._

trait CommandBoolApi extends CommandBoolExp {
self: RosApi =>

  }

trait CommandBoolExp {
    self: RosExp =>

    @struct case class CommandBool(value: Bool)
    @struct case class CommandBoolReply(success: Bool, result: FixPt[FALSE,_8,_0])
}

object CommandBool {
}
