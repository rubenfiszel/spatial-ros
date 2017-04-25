
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen

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
    @api def rssi: FixPt[FALSE,_8,_0] = FixPt(stage(RadioStatus_rssi(s))(ctx))
    @api def remrssi: FixPt[FALSE,_8,_0] = FixPt(stage(RadioStatus_remrssi(s))(ctx))
    @api def txbuf: FixPt[FALSE,_8,_0] = FixPt(stage(RadioStatus_txbuf(s))(ctx))
    @api def noise: FixPt[FALSE,_8,_0] = FixPt(stage(RadioStatus_noise(s))(ctx))
    @api def remnoise: FixPt[FALSE,_8,_0] = FixPt(stage(RadioStatus_remnoise(s))(ctx))
    @api def rxerrors: FixPt[FALSE,_16,_0] = FixPt(stage(RadioStatus_rxerrors(s))(ctx))
    @api def fixed: FixPt[FALSE,_16,_0] = FixPt(stage(RadioStatus_fixed(s))(ctx))
    @api def rssi_dbm: FltPt[_24,_8] = FltPt(stage(RadioStatus_rssi_dbm(s))(ctx))
    @api def remrssi_dbm: FltPt[_24,_8] = FltPt(stage(RadioStatus_remrssi_dbm(s))(ctx))
    @api def ===(that: RadioStatus) = ???
    @api def =!=(that: RadioStatus) = ???
    @api def toText: Text = textify(this)
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

  case class NewRadioStatus(rssi: Exp[FixPt[FALSE,_8,_0]], remrssi: Exp[FixPt[FALSE,_8,_0]], txbuf: Exp[FixPt[FALSE,_8,_0]], noise: Exp[FixPt[FALSE,_8,_0]], remnoise: Exp[FixPt[FALSE,_8,_0]], rxerrors: Exp[FixPt[FALSE,_16,_0]], fixed: Exp[FixPt[FALSE,_16,_0]], rssi_dbm: Exp[FltPt[_24,_8]], remrssi_dbm: Exp[FltPt[_24,_8]]) extends Op[RadioStatus] {
    def mirror(f: Tx) = stage(NewRadioStatus(f(rssi), f(remrssi), f(txbuf), f(noise), f(remnoise), f(rxerrors), f(fixed), f(rssi_dbm), f(remrssi_dbm)))(EmptyContext)
  }

  object RadioStatus {

  @api def apply(rssi: FixPt[FALSE,_8,_0], remrssi: FixPt[FALSE,_8,_0], txbuf: FixPt[FALSE,_8,_0], noise: FixPt[FALSE,_8,_0], remnoise: FixPt[FALSE,_8,_0], rxerrors: FixPt[FALSE,_16,_0], fixed: FixPt[FALSE,_16,_0], rssi_dbm: FltPt[_24,_8], remrssi_dbm: FltPt[_24,_8]): RadioStatus = RadioStatus(stage(NewRadioStatus(rssi.s, remrssi.s, txbuf.s, noise.s, remnoise.s, rxerrors.s, fixed.s, rssi_dbm.s, remrssi_dbm.s))(ctx))


  }

}

trait ScalaGenRadioStatus extends ScalaCodegen{
  override def emitFileHeader() = {
//    emit(src"import DataImplicits._")
    super.emitFileHeader()
  }
}

