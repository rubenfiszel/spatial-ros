package spatial.ros

import org.virtualized._

trait ParamPullApi extends ParamPullExp {
self: RosApi =>

  }

trait ParamPullExp {
    self: RosExp =>

    case class ParamPull(force_pull: Bool)
    case class ParamPullReply(success: Bool, param_received: FixPt[FALSE,_32,_0])
}

object ParamPull {
}
