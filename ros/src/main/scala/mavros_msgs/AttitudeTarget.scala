package spatial.ros

import forge._
import org.virtualized._

trait AttitudeTargetApi extends AttitudeTargetExp {
    self: RosApi =>

}

trait AttitudeTargetExp {
    self: RosExp =>

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
}

object AttitudeTarget{
}
