
package spatial.ros

import forge._
import org.virtualized._

trait AttitudeTargetApi extends AttitudeTargetExp {
  self: RosApi =>

}

trait AttitudeTargetExp {
  self: RosExp =>
  
  
case class AttitudeTarget_type_mask(msg: Exp[AttitudeTarget]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = ???//AttitudeTarget_type_mask(f(msg))
}

  
case class AttitudeTarget_orientation(msg: Exp[AttitudeTarget]) extends Op[Quaternion] {
  def mirror(f: Tx) = ???//AttitudeTarget_orientation(f(msg))
}

  
case class AttitudeTarget_body_rate(msg: Exp[AttitudeTarget]) extends Op[Vec3] {
  def mirror(f: Tx) = ???//AttitudeTarget_body_rate(f(msg))
}

  
case class AttitudeTarget_thrust(msg: Exp[AttitudeTarget]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//AttitudeTarget_thrust(f(msg))
}


  implicit object AttitudeTargetType extends Meta[AttitudeTarget] {
    def wrapped(x: Exp[AttitudeTarget]) = AttitudeTarget(x)
    def stagedClass = classOf[AttitudeTarget]
    def isPrimitive = false
  }

  case class AttitudeTarget(s: Exp[AttitudeTarget]) extends MetaAny[AttitudeTarget] {
    @api def type_mask: FixPt[FALSE,_8,_0] = ???
    @api def orientation: Quaternion = ???
    @api def body_rate: Vec3 = ???
    @api def thrust: FltPt[_24,_8] = ???
    @api def ===(that: AttitudeTarget) = ???
    @api def =!=(that: AttitudeTarget) = ???
    @api def toText: Text = ???
  }
  
  object AttitudeTarget {

  }

}

