
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait Vec3Api extends Vec3Exp {
  self: RosApi =>

}

trait Vec3Exp {
  self: RosExp =>

  implicit object Vec3Type extends Meta[Vec3] {
    def wrapped(x: Exp[Vec3]) = Vec3(x)
    def stagedClass = classOf[Vec3]
    def isPrimitive = false
  }

  implicit object Vec3Msg extends Msg[Vec3]

  case class Vec3(s: Exp[Vec3]) extends MetaAny[Vec3] {
    @api def x: FltPt[_53,_11] = FltPt(stage(Vec3_x(s))(ctx))
    @api def y: FltPt[_53,_11] = FltPt(stage(Vec3_y(s))(ctx))
    @api def z: FltPt[_53,_11] = FltPt(stage(Vec3_z(s))(ctx))
    @api def ===(that: Vec3) = ???
    @api def =!=(that: Vec3) = ???
    @api def toText: Text = textify(this)
  }

  
case class Vec3_x(msg: Exp[Vec3]) extends Op[FltPt[_53,_11]] {
  def mirror(f: Tx) = stage(Vec3_x(f(msg)))(EmptyContext)
}

  
case class Vec3_y(msg: Exp[Vec3]) extends Op[FltPt[_53,_11]] {
  def mirror(f: Tx) = stage(Vec3_y(f(msg)))(EmptyContext)
}

  
case class Vec3_z(msg: Exp[Vec3]) extends Op[FltPt[_53,_11]] {
  def mirror(f: Tx) = stage(Vec3_z(f(msg)))(EmptyContext)
}

  case class NewVec3(x: Exp[FltPt[_53,_11]], y: Exp[FltPt[_53,_11]], z: Exp[FltPt[_53,_11]]) extends Op[Vec3] {
    def mirror(f: Tx) = stage(NewVec3(f(x), f(y), f(z)))(EmptyContext)
  }

  object Vec3 {

  @api def apply(x: FltPt[_53,_11], y: FltPt[_53,_11], z: FltPt[_53,_11]): Vec3 = Vec3(stage(NewVec3(x.s, y.s, z.s))(ctx))


  }

}

trait ScalaGenVec3 extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case Vec3_x(msg) => emit(src"val $lhs = $msg.x")
    case Vec3_y(msg) => emit(src"val $lhs = $msg.y")
    case Vec3_z(msg) => emit(src"val $lhs = $msg.z")
    case NewVec3(x, y, z) =>
      emit(src"val $lhs = Vec3($x, $y, $z)")
    case _ => super.emitNode(lhs, rhs)
  }

}


