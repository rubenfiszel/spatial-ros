
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait PointApi extends PointExp {
  self: RosApi =>

}

trait PointExp {
  self: RosExp =>

  implicit object PointType extends Meta[Point] {
    def wrapped(x: Exp[Point]) = Point(x)
    def stagedClass = classOf[Point]
    def isPrimitive = false
  }

  implicit object PointMsg extends Msg[Point]

  case class Point(s: Exp[Point]) extends MetaAny[Point] {
    @api def x: FltPt[_53,_11] = FltPt(stage(Point_x(s))(ctx))
    @api def y: FltPt[_53,_11] = FltPt(stage(Point_y(s))(ctx))
    @api def z: FltPt[_53,_11] = FltPt(stage(Point_z(s))(ctx))
    @api def ===(that: Point) = ???
    @api def =!=(that: Point) = ???
    @api def toText: Text = textify(this)
  }

  
case class Point_x(msg: Exp[Point]) extends Op[FltPt[_53,_11]] {
  def mirror(f: Tx) = stage(Point_x(f(msg)))(EmptyContext)
}

  
case class Point_y(msg: Exp[Point]) extends Op[FltPt[_53,_11]] {
  def mirror(f: Tx) = stage(Point_y(f(msg)))(EmptyContext)
}

  
case class Point_z(msg: Exp[Point]) extends Op[FltPt[_53,_11]] {
  def mirror(f: Tx) = stage(Point_z(f(msg)))(EmptyContext)
}

  case class NewPoint(x: Exp[FltPt[_53,_11]], y: Exp[FltPt[_53,_11]], z: Exp[FltPt[_53,_11]]) extends Op[Point] {
    def mirror(f: Tx) = stage(NewPoint(f(x), f(y), f(z)))(EmptyContext)
  }

  object Point {

  @api def apply(x: FltPt[_53,_11], y: FltPt[_53,_11], z: FltPt[_53,_11]): Point = Point(stage(NewPoint(x.s, y.s, z.s))(ctx))


  }

}

trait ScalaGenPoint extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case Point_x(msg) => emit(src"val $lhs = $msg.x")
    case Point_y(msg) => emit(src"val $lhs = $msg.y")
    case Point_z(msg) => emit(src"val $lhs = $msg.z")
    case NewPoint(x, y, z) =>
      emit(src"val $lhs = Point($x, $y, $z)")
    case _ => super.emitNode(lhs, rhs)
  }

}


