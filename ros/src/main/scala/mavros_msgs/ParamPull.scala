package spatial.ros

import org.virtualized._

trait ParamPullApi extends ParamPullExp {
self: RosApi =>

  }

trait ParamPullExp {
    self: RosExp =>

    @struct case class ParamPull(force_pull: Bool)
    @struct case class ParamPullReply(success: Bool, param_received: FixPt[FALSE,_32,_0])
}

object ParamPull {
}
