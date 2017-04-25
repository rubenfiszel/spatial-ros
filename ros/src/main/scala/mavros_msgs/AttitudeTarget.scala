
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen

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
    @api def type_mask: FixPt[FALSE,_8,_0] = FixPt(stage(AttitudeTarget_type_mask(s))(ctx))
    @api def orientation: Quaternion = Quaternion(stage(AttitudeTarget_orientation(s))(ctx))
    @api def body_rate: Vec3 = Vec3(stage(AttitudeTarget_body_rate(s))(ctx))
    @api def thrust: FltPt[_24,_8] = FltPt(stage(AttitudeTarget_thrust(s))(ctx))
    @api def ===(that: AttitudeTarget) = ???
    @api def =!=(that: AttitudeTarget) = ???
    @api def toText: Text = textify(this)
  }

  
case class AttitudeTarget_type_mask(msg: Exp[AttitudeTarget]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(AttitudeTarget_type_mask(f(msg)))(EmptyContext)
}

  
case class AttitudeTarget_orientation(msg: Exp[AttitudeTarget]) extends Op[Quaternion] {
  def mirror(f: Tx) = stage(AttitudeTarget_orientation(f(msg)))(EmptyContext)
}

  
case class AttitudeTarget_body_rate(msg: Exp[AttitudeTarget]) extends Op[Vec3] {
  def mirror(f: Tx) = stage(AttitudeTarget_body_rate(f(msg)))(EmptyContext)
}

  
case class AttitudeTarget_thrust(msg: Exp[AttitudeTarget]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(AttitudeTarget_thrust(f(msg)))(EmptyContext)
}

  case class NewAttitudeTarget(type_mask: Exp[FixPt[FALSE,_8,_0]], orientation: Exp[Quaternion], body_rate: Exp[Vec3], thrust: Exp[FltPt[_24,_8]]) extends Op[AttitudeTarget] {
    def mirror(f: Tx) = stage(NewAttitudeTarget(f(type_mask), f(orientation), f(body_rate), f(thrust)))(EmptyContext)
  }

  object AttitudeTarget {

  @api def apply(type_mask: FixPt[FALSE,_8,_0], orientation: Quaternion, body_rate: Vec3, thrust: FltPt[_24,_8]): AttitudeTarget = AttitudeTarget(stage(NewAttitudeTarget(type_mask.s, orientation.s, body_rate.s, thrust.s))(ctx))


  }

}

trait ScalaGenAttitudeTarget extends ScalaCodegen{
  override def emitFileHeader() = {
//    emit(src"import DataImplicits._")
    super.emitFileHeader()
  }
}

