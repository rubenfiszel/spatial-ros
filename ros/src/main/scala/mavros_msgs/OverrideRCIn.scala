
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
    @api def channels: FixPt[FALSE,_16,_0] = FixPt(stage(OverrideRCIn_channels(s))(ctx))
    @api def ===(that: OverrideRCIn) = ???
    @api def =!=(that: OverrideRCIn) = ???
    @api def toText: Text = textify(this)
  }

  
case class OverrideRCIn_channels(msg: Exp[OverrideRCIn]) extends Op[FixPt[FALSE,_16,_0]] {
  def mirror(f: Tx) = stage(OverrideRCIn_channels(f(msg)))(EmptyContext)
}

  
  object OverrideRCIn {
    val CHAN_RELEASE: FixPt[FALSE,_16,_0] = 0
    val CHAN_NOCHANGE: FixPt[FALSE,_16,_0] = 65535
  }

}

