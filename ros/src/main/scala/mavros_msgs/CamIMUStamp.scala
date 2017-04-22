package spatial.ros

import org.virtualized._

trait CamIMUStampApi extends CamIMUStampExp {
    self: RosApi =>

}

trait CamIMUStampExp {
    self: RosExp =>

    case class CamIMUStamp()
}

object CamIMUStamp {
}
