
package spatial.ros

import forge._
import org.virtualized._

trait HomePositionApi extends HomePositionExp {
  self: RosApi =>

}

trait HomePositionExp {
  self: RosExp =>

  implicit object HomePositionType extends Meta[HomePosition] {
    def wrapped(x: Exp[HomePosition]) = HomePosition(x)
    def stagedClass = classOf[HomePosition]
    def isPrimitive = false
  }

  case class HomePosition(s: Exp[HomePosition]) extends MetaAny[HomePosition] {
    @api def longitude: FltPt[_53,_11] = FltPt(stage(HomePosition_longitude(s))(ctx))
    @api def ===(that: HomePosition) = ???
    @api def =!=(that: HomePosition) = ???
    @api def toText: Text = textify(this)
  }

  
case class HomePosition_longitude(msg: Exp[HomePosition]) extends Op[FltPt[_53,_11]] {
  def mirror(f: Tx) = stage(HomePosition_longitude(f(msg)))(EmptyContext)
}

  
  object HomePosition {

  }

}

