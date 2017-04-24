package spatial.ros

import forge._
import org.virtualized._

trait RCInApi extends RCInExp {
    self: RosApi =>

}

trait RCInExp {
    self: RosExp =>

      implicit object RCInType extends Meta[RCIn] {
    def wrapped(x: Exp[RCIn]) = RCIn(x)
    def stagedClass = classOf[RCIn]
    def isPrimitive = false
  }
    case class RCIn(s: Exp[RCIn]) extends MetaAny[RCIn] {
    @api def rssi: FixPt[FALSE,_8,_0] = ???
    @api def channels: MetaArray[FixPt[FALSE,_16,_0]] = ???

    @api def ===(that: RCIn) = ??? 
    @api def =!=(that: RCIn) = ??? 
    @api def toText: Text = ??? 
  }
}

object RCIn{
}
