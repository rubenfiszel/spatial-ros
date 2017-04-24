
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

  
case class GlobalPositionTarget_coordinate_frame(msg: Exp[GlobalPositionTarget]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(GlobalPositionTarget_coordinate_frame(f(msg)))(EmptyContext)
}

  
case class GlobalPositionTarget_type_mask(msg: Exp[GlobalPositionTarget]) extends Op[FixPt[FALSE,_16,_0]] {
  def mirror(f: Tx) = stage(GlobalPositionTarget_type_mask(f(msg)))(EmptyContext)
}

  
case class GlobalPositionTarget_latitude(msg: Exp[GlobalPositionTarget]) extends Op[FltPt[_53,_11]] {
  def mirror(f: Tx) = stage(GlobalPositionTarget_latitude(f(msg)))(EmptyContext)
}

  
case class GlobalPositionTarget_longitude(msg: Exp[GlobalPositionTarget]) extends Op[FltPt[_53,_11]] {
  def mirror(f: Tx) = stage(GlobalPositionTarget_longitude(f(msg)))(EmptyContext)
}

  
case class GlobalPositionTarget_velocity(msg: Exp[GlobalPositionTarget]) extends Op[Vec3] {
  def mirror(f: Tx) = stage(GlobalPositionTarget_velocity(f(msg)))(EmptyContext)
}

  
case class GlobalPositionTarget_acceleration_or_force(msg: Exp[GlobalPositionTarget]) extends Op[Vec3] {
  def mirror(f: Tx) = stage(GlobalPositionTarget_acceleration_or_force(f(msg)))(EmptyContext)
}

  
case class GlobalPositionTarget_yaw(msg: Exp[GlobalPositionTarget]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(GlobalPositionTarget_yaw(f(msg)))(EmptyContext)
}

  
case class GlobalPositionTarget_yaw_rate(msg: Exp[GlobalPositionTarget]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(GlobalPositionTarget_yaw_rate(f(msg)))(EmptyContext)
}

  
  object GlobalPositionTarget {

  }

}

