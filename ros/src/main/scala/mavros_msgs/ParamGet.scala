package spatial.ros

trait ParamGetApi extends ParamGetExp {
self: RosApi =>

  }

trait ParamGetExp {
    self: RosExp =>

    case class ParamGet(param_id: Text)
    case class ParamGetReply(success: Bool, value: ParamValue)
}

object ParamGet {
}
