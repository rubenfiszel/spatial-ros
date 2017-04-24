package spatial.ros

import forge._
import org.virtualized._

trait OverrideRCInApi extends OverrideRCInExp {
    self: RosApi =>

}

trait OverrideRCInExp {
    self: RosExp =>

      implicit object OverrideRCInType extends Meta[OverrideRCIn] {
    def wrapped(x: Exp[OverrideRCIn]) = OverrideRCIn(x)
    def stagedClass = classOf[OverrideRCIn]
    def isPrimitive = false
  }
    case class OverrideRCIn(s: Exp[OverrideRCIn]) extends MetaAny[OverrideRCIn] {
    @api def channels: FixPt[FALSE,_16,_0] = ???

    @api def ===(that: OverrideRCIn) = ??? 
    @api def =!=(that: OverrideRCIn) = ??? 
    @api def toText: Text = ??? 
  }
}

object OverrideRCIn{val CHAN_RELEASE = 0
val CHAN_NOCHANGE = 65535
}
