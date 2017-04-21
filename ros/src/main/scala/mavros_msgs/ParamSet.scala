package spatial.ros

trait ParamSetApi extends ParamSetExp {
self: RosApi =>

  }

trait ParamSetExp {
    self: RosExp =>

    case class ParamSet(param_id: Text, value: ParamValue)
    case class ParamSetReply(success: Bool, value: ParamValue)
}

object ParamSet {
}
