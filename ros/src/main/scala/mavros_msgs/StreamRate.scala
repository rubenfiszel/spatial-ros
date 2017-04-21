package spatial.ros

trait StreamRateApi extends StreamRateExp {
self: RosApi =>

  }

trait StreamRateExp {
    self: RosExp =>

    case class StreamRate(stream_id: FixPt[FALSE,_8,_0], message_rate: FixPt[FALSE,_16,_0], on_off: Bool)
    case class StreamRateReply()
}

object StreamRate {
}
