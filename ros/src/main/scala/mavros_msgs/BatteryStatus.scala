package spatial.ros

trait BatteryStatusApi extends BatteryStatusExp {
    self: RosApi =>

}

trait BatteryStatusExp {
    self: RosExp =>

    case class BatteryStatus()
}

object BatteryStatus {
}
