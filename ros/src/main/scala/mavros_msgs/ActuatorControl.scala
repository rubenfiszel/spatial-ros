
package spatial.ros

import forge._
import org.virtualized._

trait ActuatorControlApi extends ActuatorControlExp {
  self: RosApi =>

}

trait ActuatorControlExp {
  self: RosExp =>

  implicit object ActuatorControlType extends Meta[ActuatorControl] {
    def wrapped(x: Exp[ActuatorControl]) = ActuatorControl(x)
    def stagedClass = classOf[ActuatorControl]
    def isPrimitive = false
  }

  case class ActuatorControl(s: Exp[ActuatorControl]) extends MetaAny[ActuatorControl] {
    @api def group_mix: FixPt[FALSE,_8,_0] = FixPt(stage(ActuatorControl_group_mix(s))(ctx))
    @api def controls: FltPt[_24,_8] = FltPt(stage(ActuatorControl_controls(s))(ctx))
    @api def ===(that: ActuatorControl) = ???
    @api def =!=(that: ActuatorControl) = ???
    @api def toText: Text = textify(this)
  }

  
case class ActuatorControl_group_mix(msg: Exp[ActuatorControl]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(ActuatorControl_group_mix(f(msg)))(EmptyContext)
}

  
case class ActuatorControl_controls(msg: Exp[ActuatorControl]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(ActuatorControl_controls(f(msg)))(EmptyContext)
}

  
  object ActuatorControl {

  }

}

