
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen
import spatial.ros.codegen.scalagen.RosScalaCodegen

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

  implicit object BatteryStatusMsg extends Msg[BatteryStatus]

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

trait ScalaGenBatteryStatus extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {

    case NewBatteryStatus() =>
      emit(src"val $lhs = BatteryStatus()")
    case _ => super.emitNode(lhs, rhs)
  }

}


