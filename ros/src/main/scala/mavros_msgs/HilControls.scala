
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen

trait HilControlsApi extends HilControlsExp {
  self: RosApi =>

}

trait HilControlsExp {
  self: RosExp =>

  implicit object HilControlsType extends Meta[HilControls] {
    def wrapped(x: Exp[HilControls]) = HilControls(x)
    def stagedClass = classOf[HilControls]
    def isPrimitive = false
  }

  case class HilControls(s: Exp[HilControls]) extends MetaAny[HilControls] {
    @api def roll_ailerons: FltPt[_24,_8] = FltPt(stage(HilControls_roll_ailerons(s))(ctx))
    @api def pitch_elevator: FltPt[_24,_8] = FltPt(stage(HilControls_pitch_elevator(s))(ctx))
    @api def yaw_rudder: FltPt[_24,_8] = FltPt(stage(HilControls_yaw_rudder(s))(ctx))
    @api def throttle: FltPt[_24,_8] = FltPt(stage(HilControls_throttle(s))(ctx))
    @api def aux1: FltPt[_24,_8] = FltPt(stage(HilControls_aux1(s))(ctx))
    @api def aux2: FltPt[_24,_8] = FltPt(stage(HilControls_aux2(s))(ctx))
    @api def aux3: FltPt[_24,_8] = FltPt(stage(HilControls_aux3(s))(ctx))
    @api def aux4: FltPt[_24,_8] = FltPt(stage(HilControls_aux4(s))(ctx))
    @api def mode: FixPt[FALSE,_8,_0] = FixPt(stage(HilControls_mode(s))(ctx))
    @api def nav_mode: FixPt[FALSE,_8,_0] = FixPt(stage(HilControls_nav_mode(s))(ctx))
    @api def ===(that: HilControls) = ???
    @api def =!=(that: HilControls) = ???
    @api def toText: Text = textify(this)
  }

  
case class HilControls_roll_ailerons(msg: Exp[HilControls]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(HilControls_roll_ailerons(f(msg)))(EmptyContext)
}

  
case class HilControls_pitch_elevator(msg: Exp[HilControls]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(HilControls_pitch_elevator(f(msg)))(EmptyContext)
}

  
case class HilControls_yaw_rudder(msg: Exp[HilControls]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(HilControls_yaw_rudder(f(msg)))(EmptyContext)
}

  
case class HilControls_throttle(msg: Exp[HilControls]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(HilControls_throttle(f(msg)))(EmptyContext)
}

  
case class HilControls_aux1(msg: Exp[HilControls]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(HilControls_aux1(f(msg)))(EmptyContext)
}

  
case class HilControls_aux2(msg: Exp[HilControls]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(HilControls_aux2(f(msg)))(EmptyContext)
}

  
case class HilControls_aux3(msg: Exp[HilControls]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(HilControls_aux3(f(msg)))(EmptyContext)
}

  
case class HilControls_aux4(msg: Exp[HilControls]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(HilControls_aux4(f(msg)))(EmptyContext)
}

  
case class HilControls_mode(msg: Exp[HilControls]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(HilControls_mode(f(msg)))(EmptyContext)
}

  
case class HilControls_nav_mode(msg: Exp[HilControls]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(HilControls_nav_mode(f(msg)))(EmptyContext)
}

  case class NewHilControls(roll_ailerons: Exp[FltPt[_24,_8]], pitch_elevator: Exp[FltPt[_24,_8]], yaw_rudder: Exp[FltPt[_24,_8]], throttle: Exp[FltPt[_24,_8]], aux1: Exp[FltPt[_24,_8]], aux2: Exp[FltPt[_24,_8]], aux3: Exp[FltPt[_24,_8]], aux4: Exp[FltPt[_24,_8]], mode: Exp[FixPt[FALSE,_8,_0]], nav_mode: Exp[FixPt[FALSE,_8,_0]]) extends Op[HilControls] {
    def mirror(f: Tx) = stage(NewHilControls(f(roll_ailerons), f(pitch_elevator), f(yaw_rudder), f(throttle), f(aux1), f(aux2), f(aux3), f(aux4), f(mode), f(nav_mode)))(EmptyContext)
  }

  object HilControls {

  @api def apply(roll_ailerons: FltPt[_24,_8], pitch_elevator: FltPt[_24,_8], yaw_rudder: FltPt[_24,_8], throttle: FltPt[_24,_8], aux1: FltPt[_24,_8], aux2: FltPt[_24,_8], aux3: FltPt[_24,_8], aux4: FltPt[_24,_8], mode: FixPt[FALSE,_8,_0], nav_mode: FixPt[FALSE,_8,_0]): HilControls = HilControls(stage(NewHilControls(roll_ailerons.s, pitch_elevator.s, yaw_rudder.s, throttle.s, aux1.s, aux2.s, aux3.s, aux4.s, mode.s, nav_mode.s))(ctx))


  }

}

trait ScalaGenHilControls extends ScalaCodegen{
  override def emitFileHeader() = {
//    emit(src"import DataImplicits._")
    super.emitFileHeader()
  }
}

