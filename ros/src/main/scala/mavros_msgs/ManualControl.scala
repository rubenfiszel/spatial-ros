
package spatial.ros

import forge._
import org.virtualized._

trait ManualControlApi extends ManualControlExp {
  self: RosApi =>

}

trait ManualControlExp {
  self: RosExp =>

  implicit object ManualControlType extends Meta[ManualControl] {
    def wrapped(x: Exp[ManualControl]) = ManualControl(x)
    def stagedClass = classOf[ManualControl]
    def isPrimitive = false
  }

  case class ManualControl(s: Exp[ManualControl]) extends MetaAny[ManualControl] {
    @api def x: FltPt[_24,_8] = FltPt(stage(ManualControl_x(s))(ctx))
    @api def y: FltPt[_24,_8] = FltPt(stage(ManualControl_y(s))(ctx))
    @api def z: FltPt[_24,_8] = FltPt(stage(ManualControl_z(s))(ctx))
    @api def r: FltPt[_24,_8] = FltPt(stage(ManualControl_r(s))(ctx))
    @api def buttons: FixPt[FALSE,_16,_0] = FixPt(stage(ManualControl_buttons(s))(ctx))
    @api def ===(that: ManualControl) = ???
    @api def =!=(that: ManualControl) = ???
    @api def toText: Text = textify(this)
  }

  
case class ManualControl_x(msg: Exp[ManualControl]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(ManualControl_x(f(msg)))(EmptyContext)
}

  
case class ManualControl_y(msg: Exp[ManualControl]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(ManualControl_y(f(msg)))(EmptyContext)
}

  
case class ManualControl_z(msg: Exp[ManualControl]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(ManualControl_z(f(msg)))(EmptyContext)
}

  
case class ManualControl_r(msg: Exp[ManualControl]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(ManualControl_r(f(msg)))(EmptyContext)
}

  
case class ManualControl_buttons(msg: Exp[ManualControl]) extends Op[FixPt[FALSE,_16,_0]] {
  def mirror(f: Tx) = stage(ManualControl_buttons(f(msg)))(EmptyContext)
}

  
  object ManualControl {

  }

}

