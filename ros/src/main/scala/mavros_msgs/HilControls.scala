
package spatial.ros

import forge._
import org.virtualized._

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
    @api def roll_ailerons: FltPt[_24,_8] = ???
    @api def pitch_elevator: FltPt[_24,_8] = ???
    @api def yaw_rudder: FltPt[_24,_8] = ???
    @api def throttle: FltPt[_24,_8] = ???
    @api def aux1: FltPt[_24,_8] = ???
    @api def aux2: FltPt[_24,_8] = ???
    @api def aux3: FltPt[_24,_8] = ???
    @api def aux4: FltPt[_24,_8] = ???
    @api def mode: FixPt[FALSE,_8,_0] = ???
    @api def nav_mode: FixPt[FALSE,_8,_0] = ???
    @api def ===(that: HilControls) = ???
    @api def =!=(that: HilControls) = ???
    @api def toText: Text = ???
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

  
  object HilControls {

  }

}

