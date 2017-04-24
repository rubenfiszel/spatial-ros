
package spatial.ros

import forge._
import org.virtualized._

trait ActuatorControlApi extends ActuatorControlExp {
  self: RosApi =>

}

trait ActuatorControlExp {
  self: RosExp =>
  
  
case class ActuatorControl_group_mix(msg: Exp[ActuatorControl]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = ???//ActuatorControl_group_mix(f(msg))
}

  
case class ActuatorControl_controls(msg: Exp[ActuatorControl]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//ActuatorControl_controls(f(msg))
}


  implicit object ActuatorControlType extends Meta[ActuatorControl] {
    def wrapped(x: Exp[ActuatorControl]) = ActuatorControl(x)
    def stagedClass = classOf[ActuatorControl]
    def isPrimitive = false
  }

  case class ActuatorControl(s: Exp[ActuatorControl]) extends MetaAny[ActuatorControl] {
    @api def group_mix: FixPt[FALSE,_8,_0] = ???
    @api def controls: FltPt[_24,_8] = ???
    @api def ===(that: ActuatorControl) = ???
    @api def =!=(that: ActuatorControl) = ???
    @api def toText: Text = ???
  }
  
  object ActuatorControl {

  }

}

