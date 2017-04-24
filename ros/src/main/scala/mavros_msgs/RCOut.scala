package spatial.ros

import forge._
import org.virtualized._

trait RCOutApi extends RCOutExp {
    self: RosApi =>

}

trait RCOutExp {
    self: RosExp =>

      implicit object RCOutType extends Meta[RCOut] {
    def wrapped(x: Exp[RCOut]) = RCOut(x)
    def stagedClass = classOf[RCOut]
    def isPrimitive = false
  }
    case class RCOut(s: Exp[RCOut]) extends MetaAny[RCOut] {
    @api def channels: MetaArray[FixPt[FALSE,_16,_0]] = ???

    @api def ===(that: RCOut) = ??? 
    @api def =!=(that: RCOut) = ??? 
    @api def toText: Text = ??? 
  }
}

object RCOut{
}
