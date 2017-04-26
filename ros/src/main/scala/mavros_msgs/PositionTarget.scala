
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen
import spatial.ros.codegen.scalagen.RosScalaCodegen

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

  implicit object PositionTargetMsg extends Msg[PositionTarget]

  case class PositionTarget(s: Exp[PositionTarget]) extends MetaAny[PositionTarget] {
    @api def coordinate_frame: FixPt[FALSE,_8,_0] = FixPt(stage(PositionTarget_coordinate_frame(s))(ctx))
    @api def type_mask: FixPt[FALSE,_16,_0] = FixPt(stage(PositionTarget_type_mask(s))(ctx))
    @api def position: Point = Point(stage(PositionTarget_position(s))(ctx))
    @api def velocity: Vec3 = Vec3(stage(PositionTarget_velocity(s))(ctx))
    @api def acceleration_or_force: Vec3 = Vec3(stage(PositionTarget_acceleration_or_force(s))(ctx))
    @api def yaw: FltPt[_24,_8] = FltPt(stage(PositionTarget_yaw(s))(ctx))
    @api def yaw_rate: FltPt[_24,_8] = FltPt(stage(PositionTarget_yaw_rate(s))(ctx))
    @api def ===(that: PositionTarget) = ???
    @api def =!=(that: PositionTarget) = ???
    @api def toText: Text = textify(this)
  }

  
case class PositionTarget_coordinate_frame(msg: Exp[PositionTarget]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(PositionTarget_coordinate_frame(f(msg)))(EmptyContext)
}

  
case class PositionTarget_type_mask(msg: Exp[PositionTarget]) extends Op[FixPt[FALSE,_16,_0]] {
  def mirror(f: Tx) = stage(PositionTarget_type_mask(f(msg)))(EmptyContext)
}

  
case class PositionTarget_position(msg: Exp[PositionTarget]) extends Op[Point] {
  def mirror(f: Tx) = stage(PositionTarget_position(f(msg)))(EmptyContext)
}

  
case class PositionTarget_velocity(msg: Exp[PositionTarget]) extends Op[Vec3] {
  def mirror(f: Tx) = stage(PositionTarget_velocity(f(msg)))(EmptyContext)
}

  
case class PositionTarget_acceleration_or_force(msg: Exp[PositionTarget]) extends Op[Vec3] {
  def mirror(f: Tx) = stage(PositionTarget_acceleration_or_force(f(msg)))(EmptyContext)
}

  
case class PositionTarget_yaw(msg: Exp[PositionTarget]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(PositionTarget_yaw(f(msg)))(EmptyContext)
}

  
case class PositionTarget_yaw_rate(msg: Exp[PositionTarget]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(PositionTarget_yaw_rate(f(msg)))(EmptyContext)
}

  case class NewPositionTarget(coordinate_frame: Exp[FixPt[FALSE,_8,_0]], type_mask: Exp[FixPt[FALSE,_16,_0]], position: Exp[Point], velocity: Exp[Vec3], acceleration_or_force: Exp[Vec3], yaw: Exp[FltPt[_24,_8]], yaw_rate: Exp[FltPt[_24,_8]]) extends Op[PositionTarget] {
    def mirror(f: Tx) = stage(NewPositionTarget(f(coordinate_frame), f(type_mask), f(position), f(velocity), f(acceleration_or_force), f(yaw), f(yaw_rate)))(EmptyContext)
  }

  object PositionTarget {

  @api def apply(coordinate_frame: FixPt[FALSE,_8,_0], type_mask: FixPt[FALSE,_16,_0], position: Point, velocity: Vec3, acceleration_or_force: Vec3, yaw: FltPt[_24,_8], yaw_rate: FltPt[_24,_8]): PositionTarget = PositionTarget(stage(NewPositionTarget(coordinate_frame.s, type_mask.s, position.s, velocity.s, acceleration_or_force.s, yaw.s, yaw_rate.s))(ctx))


  }

}

trait ScalaGenPositionTarget extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case PositionTarget_coordinate_frame(msg) => emit(src"val $lhs = $msg.coordinate_frame")
    case PositionTarget_type_mask(msg) => emit(src"val $lhs = $msg.type_mask")
    case PositionTarget_position(msg) => emit(src"val $lhs = $msg.position")
    case PositionTarget_velocity(msg) => emit(src"val $lhs = $msg.velocity")
    case PositionTarget_acceleration_or_force(msg) => emit(src"val $lhs = $msg.acceleration_or_force")
    case PositionTarget_yaw(msg) => emit(src"val $lhs = $msg.yaw")
    case PositionTarget_yaw_rate(msg) => emit(src"val $lhs = $msg.yaw_rate")
    case NewPositionTarget(coordinate_frame, type_mask, position, velocity, acceleration_or_force, yaw, yaw_rate) =>
      emit(src"val $lhs = PositionTarget($coordinate_frame, $type_mask, $position, $velocity, $acceleration_or_force, $yaw, $yaw_rate)")
    case _ => super.emitNode(lhs, rhs)
  }

}


