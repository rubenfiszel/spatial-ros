
package spatial.ros

import forge._
import org.virtualized._

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

  
  object Point {

  }

}

