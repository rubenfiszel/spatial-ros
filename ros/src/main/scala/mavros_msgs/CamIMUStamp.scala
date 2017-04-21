package spatial.ros

trait CamIMUStampApi extends CamIMUStampExp {
    self: RosApi =>

}

trait CamIMUStampExp {
    self: RosExp =>

    case class CamIMUStamp()
}

object CamIMUStamp {
}
