package spatial.ros

import org.virtualized._

trait BatteryStatusApi extends BatteryStatusExp {
    self: RosApi =>

}

trait BatteryStatusExp {
    self: RosExp =>

    case class BatteryStatus()
}

object BatteryStatus {
}
