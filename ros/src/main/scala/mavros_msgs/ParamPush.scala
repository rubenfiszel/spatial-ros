package spatial.ros

import org.virtualized._

trait ParamPushApi extends ParamPushExp {
self: RosApi =>

  }

trait ParamPushExp {
    self: RosExp =>

    case class ParamPush()
    case class ParamPushReply(success: Bool, param_transfered: FixPt[FALSE,_32,_0])
}

object ParamPush {
}
