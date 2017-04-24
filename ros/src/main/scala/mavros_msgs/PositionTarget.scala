package spatial.ros

import forge._
import org.virtualized._

trait PositionTargetApi extends PositionTargetExp {
    self: RosApi =>

}

trait PositionTargetExp {
    self: RosExp =>

      implicit object PositionTargetType extends Meta[PositionTarget] {
    def wrapped(x: Exp[PositionTarget]) = PositionTarget(x)
    def stagedClass = classOf[PositionTarget]
    def isPrimitive = false
  }
    case class PositionTarget(s: Exp[PositionTarget]) extends MetaAny[PositionTarget] {
    @api def coordinate_frame: FixPt[FALSE,_8,_0] = ???
    @api def type_mask: FixPt[FALSE,_16,_0] = ???
    @api def position: Point = ???
    @api def velocity: Vec3 = ???
    @api def acceleration_or_force: Vec3 = ???
    @api def yaw: FltPt[_24,_8] = ???
    @api def yaw_rate: FltPt[_24,_8] = ???

    @api def ===(that: PositionTarget) = ??? 
    @api def =!=(that: PositionTarget) = ??? 
    @api def toText: Text = ??? 
  }
}

object PositionTarget{
}
