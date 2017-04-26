
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait QuaternionApi extends QuaternionExp {
  self: RosApi =>

}

trait QuaternionExp {
  self: RosExp =>

  implicit object QuaternionType extends Meta[Quaternion] {
    def wrapped(x: Exp[Quaternion]) = Quaternion(x)
    def stagedClass = classOf[Quaternion]
    def isPrimitive = false
  }

  implicit object QuaternionMsg extends Msg[Quaternion]

  case class Quaternion(s: Exp[Quaternion]) extends MetaAny[Quaternion] {
    @api def x: FltPt[_53,_11] = FltPt(stage(Quaternion_x(s))(ctx))
    @api def y: FltPt[_53,_11] = FltPt(stage(Quaternion_y(s))(ctx))
    @api def z: FltPt[_53,_11] = FltPt(stage(Quaternion_z(s))(ctx))
    @api def w: FltPt[_53,_11] = FltPt(stage(Quaternion_w(s))(ctx))
    @api def ===(that: Quaternion) = ???
    @api def =!=(that: Quaternion) = ???
    @api def toText: Text = textify(this)
  }

  
case class Quaternion_x(msg: Exp[Quaternion]) extends Op[FltPt[_53,_11]] {
  def mirror(f: Tx) = stage(Quaternion_x(f(msg)))(EmptyContext)
}

  
case class Quaternion_y(msg: Exp[Quaternion]) extends Op[FltPt[_53,_11]] {
  def mirror(f: Tx) = stage(Quaternion_y(f(msg)))(EmptyContext)
}

  
case class Quaternion_z(msg: Exp[Quaternion]) extends Op[FltPt[_53,_11]] {
  def mirror(f: Tx) = stage(Quaternion_z(f(msg)))(EmptyContext)
}

  
case class Quaternion_w(msg: Exp[Quaternion]) extends Op[FltPt[_53,_11]] {
  def mirror(f: Tx) = stage(Quaternion_w(f(msg)))(EmptyContext)
}

  case class NewQuaternion(x: Exp[FltPt[_53,_11]], y: Exp[FltPt[_53,_11]], z: Exp[FltPt[_53,_11]], w: Exp[FltPt[_53,_11]]) extends Op[Quaternion] {
    def mirror(f: Tx) = stage(NewQuaternion(f(x), f(y), f(z), f(w)))(EmptyContext)
  }

  object Quaternion {

  @api def apply(x: FltPt[_53,_11], y: FltPt[_53,_11], z: FltPt[_53,_11], w: FltPt[_53,_11]): Quaternion = Quaternion(stage(NewQuaternion(x.s, y.s, z.s, w.s))(ctx))


  }

}

trait ScalaGenQuaternion extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case Quaternion_x(msg) => emit(src"val $lhs = $msg.x")
    case Quaternion_y(msg) => emit(src"val $lhs = $msg.y")
    case Quaternion_z(msg) => emit(src"val $lhs = $msg.z")
    case Quaternion_w(msg) => emit(src"val $lhs = $msg.w")
    case NewQuaternion(x, y, z, w) =>
      emit(src"val $lhs = Quaternion($x, $y, $z, $w)")
    case _ => super.emitNode(lhs, rhs)
  }

}


