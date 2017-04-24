
package spatial.ros

import forge._
import org.virtualized._

trait RCInApi extends RCInExp {
  self: RosApi =>

}

trait RCInExp {
  self: RosExp =>
  
  
case class RCIn_rssi(msg: Exp[RCIn]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = ???//RCIn_rssi(f(msg))
}

  
case class RCIn_channels(msg: Exp[RCIn]) extends Op[MetaArray[FixPt[FALSE,_16,_0]]] {
  def mirror(f: Tx) = ???//RCIn_channels(f(msg))
}


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
  
  object RCIn {

  }

}

