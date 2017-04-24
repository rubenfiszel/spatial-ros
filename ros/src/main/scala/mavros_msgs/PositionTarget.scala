
package spatial.ros

import forge._
import org.virtualized._

trait PositionTargetApi extends PositionTargetExp {
  self: RosApi =>

}

trait PositionTargetExp {
  self: RosExp =>
  
  
case class PositionTarget_coordinate_frame(msg: Exp[PositionTarget]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = ???//PositionTarget_coordinate_frame(f(msg))
}

  
case class PositionTarget_type_mask(msg: Exp[PositionTarget]) extends Op[FixPt[FALSE,_16,_0]] {
  def mirror(f: Tx) = ???//PositionTarget_type_mask(f(msg))
}

  
case class PositionTarget_position(msg: Exp[PositionTarget]) extends Op[Point] {
  def mirror(f: Tx) = ???//PositionTarget_position(f(msg))
}

  
case class PositionTarget_velocity(msg: Exp[PositionTarget]) extends Op[Vec3] {
  def mirror(f: Tx) = ???//PositionTarget_velocity(f(msg))
}

  
case class PositionTarget_acceleration_or_force(msg: Exp[PositionTarget]) extends Op[Vec3] {
  def mirror(f: Tx) = ???//PositionTarget_acceleration_or_force(f(msg))
}

  
case class PositionTarget_yaw(msg: Exp[PositionTarget]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//PositionTarget_yaw(f(msg))
}

  
case class PositionTarget_yaw_rate(msg: Exp[PositionTarget]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = ???//PositionTarget_yaw_rate(f(msg))
}


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
  
  object PositionTarget {

  }

}

