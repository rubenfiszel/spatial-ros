package spatial.ros

import org.virtualized._

trait ParamSetApi extends ParamSetExp {
self: RosApi =>

  }

trait ParamSetExp {
    self: RosExp =>

    @struct case class ParamSet(param_id: Text, value: ParamValue)
    @struct case class ParamSetReply(success: Bool, value: ParamValue)
}

object ParamSet {
}
