
package spatial.ros

import forge._
import org.virtualized._

trait BatteryStatusApi extends BatteryStatusExp {
  self: RosApi =>

}

trait BatteryStatusExp {
  self: RosExp =>

  implicit object BatteryStatusType extends Meta[BatteryStatus] {
    def wrapped(x: Exp[BatteryStatus]) = BatteryStatus(x)
    def stagedClass = classOf[BatteryStatus]
    def isPrimitive = false
  }

  case class BatteryStatus(s: Exp[BatteryStatus]) extends MetaAny[BatteryStatus] {

    @api def ===(that: BatteryStatus) = ???
    @api def =!=(that: BatteryStatus) = ???
    @api def toText: Text = textify(this)
  }


  
  object BatteryStatus {

  }

}

