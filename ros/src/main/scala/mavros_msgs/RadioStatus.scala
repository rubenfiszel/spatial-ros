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
}

object RadioStatus{
}
