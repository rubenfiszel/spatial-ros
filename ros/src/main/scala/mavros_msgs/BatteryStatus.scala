
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen

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


  case class NewBatteryStatus() extends Op[BatteryStatus] {
    def mirror(f: Tx) = stage(NewBatteryStatus())(EmptyContext)
  }

  object BatteryStatus {

  @api def apply(): BatteryStatus = BatteryStatus(stage(NewBatteryStatus())(ctx))


  }

}

trait ScalaGenBatteryStatus extends ScalaCodegen{
  override def emitFileHeader() = {
//    emit(src"import DataImplicits._")
    super.emitFileHeader()
  }
}

