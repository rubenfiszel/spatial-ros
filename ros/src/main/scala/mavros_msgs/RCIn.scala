
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
    @api def rssi: FixPt[FALSE,_8,_0] = FixPt(stage(RCIn_rssi(s))(ctx))
    @api def channels: MetaArray[FixPt[FALSE,_16,_0]] = MetaArray(stage(RCIn_channels(s))(ctx))
    @api def ===(that: RCIn) = ???
    @api def =!=(that: RCIn) = ???
    @api def toText: Text = textify(this)
  }

  
case class RCIn_rssi(msg: Exp[RCIn]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(RCIn_rssi(f(msg)))(EmptyContext)
}

  
case class RCIn_channels(msg: Exp[RCIn]) extends Op[MetaArray[FixPt[FALSE,_16,_0]]] {
  def mirror(f: Tx) = stage(RCIn_channels(f(msg)))(EmptyContext)
}

  
  object RCIn {

  }

}

