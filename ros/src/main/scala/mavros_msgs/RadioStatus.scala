
package spatial.ros

import forge._
import org.virtualized._

trait RadioStatusApi extends RadioStatusExp {
  self: RosApi =>

}

trait RadioStatusExp {
  self: RosExp =>

  implicit object RadioStatusType extends Meta[RadioStatus] {
    def wrapped(x: Exp[RadioStatus]) = RadioStatus(x)
    def stagedClass = classOf[RadioStatus]
    def isPrimitive = false
  }

  case class RadioStatus(s: Exp[RadioStatus]) extends MetaAny[RadioStatus] {
    @api def rssi: FixPt[FALSE,_8,_0] = ???
    @api def remrssi: FixPt[FALSE,_8,_0] = ???
    @api def txbuf: FixPt[FALSE,_8,_0] = ???
    @api def noise: FixPt[FALSE,_8,_0] = ???
    @api def remnoise: FixPt[FALSE,_8,_0] = ???
    @api def rxerrors: FixPt[FALSE,_16,_0] = ???
    @api def fixed: FixPt[FALSE,_16,_0] = ???
    @api def rssi_dbm: FltPt[_24,_8] = ???
    @api def remrssi_dbm: FltPt[_24,_8] = ???
    @api def ===(that: RadioStatus) = ???
    @api def =!=(that: RadioStatus) = ???
    @api def toText: Text = ???
  }

  
case class RadioStatus_rssi(msg: Exp[RadioStatus]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(RadioStatus_rssi(f(msg)))(EmptyContext)
}

  
case class RadioStatus_remrssi(msg: Exp[RadioStatus]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(RadioStatus_remrssi(f(msg)))(EmptyContext)
}

  
case class RadioStatus_txbuf(msg: Exp[RadioStatus]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(RadioStatus_txbuf(f(msg)))(EmptyContext)
}

  
case class RadioStatus_noise(msg: Exp[RadioStatus]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(RadioStatus_noise(f(msg)))(EmptyContext)
}

  
case class RadioStatus_remnoise(msg: Exp[RadioStatus]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(RadioStatus_remnoise(f(msg)))(EmptyContext)
}

  
case class RadioStatus_rxerrors(msg: Exp[RadioStatus]) extends Op[FixPt[FALSE,_16,_0]] {
  def mirror(f: Tx) = stage(RadioStatus_rxerrors(f(msg)))(EmptyContext)
}

  
case class RadioStatus_fixed(msg: Exp[RadioStatus]) extends Op[FixPt[FALSE,_16,_0]] {
  def mirror(f: Tx) = stage(RadioStatus_fixed(f(msg)))(EmptyContext)
}

  
case class RadioStatus_rssi_dbm(msg: Exp[RadioStatus]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(RadioStatus_rssi_dbm(f(msg)))(EmptyContext)
}

  
case class RadioStatus_remrssi_dbm(msg: Exp[RadioStatus]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(RadioStatus_remrssi_dbm(f(msg)))(EmptyContext)
}

  
  object RadioStatus {

  }

}

