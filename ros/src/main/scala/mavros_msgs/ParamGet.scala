package spatial.ros

import org.virtualized._

trait ParamGetApi extends ParamGetExp {
self: RosApi =>

  }

trait ParamGetExp {
    self: RosExp =>

    @struct case class ParamGet(param_id: Text)
    @struct case class ParamGetReply(success: Bool, value: ParamValue)
}

object ParamGet {
}
