package spatial.ros

import org.virtualized._

trait RCInApi extends RCInExp {
    self: RosApi =>

}

trait RCInExp {
    self: RosExp =>

    case class RCIn(rssi: FixPt[FALSE,_8,_0], channels: Array[FixPt[FALSE,_16,_0]])
}

object RCIn {
}
