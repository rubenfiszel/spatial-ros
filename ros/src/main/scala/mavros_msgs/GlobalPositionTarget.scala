package spatial.ros

import forge._
import org.virtualized._

trait GlobalPositionTargetApi extends GlobalPositionTargetExp {
    self: RosApi =>

}

trait GlobalPositionTargetExp {
    self: RosExp =>

      implicit object GlobalPositionTargetType extends Meta[GlobalPositionTarget] {
    def wrapped(x: Exp[GlobalPositionTarget]) = GlobalPositionTarget(x)
    def stagedClass = classOf[GlobalPositionTarget]
    def isPrimitive = false
  }
    case class GlobalPositionTarget(s: Exp[GlobalPositionTarget]) extends MetaAny[GlobalPositionTarget] {
    @api def coordinate_frame: FixPt[FALSE,_8,_0] = ???
    @api def type_mask: FixPt[FALSE,_16,_0] = ???
    @api def latitude: FltPt[_53,_11] = ???
    @api def longitude: FltPt[_53,_11] = ???
    @api def velocity: Vec3 = ???
    @api def acceleration_or_force: Vec3 = ???
    @api def yaw: FltPt[_24,_8] = ???
    @api def yaw_rate: FltPt[_24,_8] = ???

    @api def ===(that: GlobalPositionTarget) = ??? 
    @api def =!=(that: GlobalPositionTarget) = ??? 
    @api def toText: Text = ??? 
  }
}

object GlobalPositionTarget{
}
