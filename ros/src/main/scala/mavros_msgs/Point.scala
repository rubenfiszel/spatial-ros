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
    @api def x: FltPt[_53,_11] = ???
    @api def y: FltPt[_53,_11] = ???
    @api def z: FltPt[_53,_11] = ???

    @api def ===(that: Point) = ??? 
    @api def =!=(that: Point) = ??? 
    @api def toText: Text = ??? 
  }
}

object Point{
}
