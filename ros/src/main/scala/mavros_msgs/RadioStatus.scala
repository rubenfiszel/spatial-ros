package spatial.ros

trait RadioStatusApi extends RadioStatusExp {
    self: RosApi =>

}

trait RadioStatusExp {
    self: RosExp =>

    case class RadioStatus(rssi: FixPt[FALSE,_8,_0], remrssi: FixPt[FALSE,_8,_0], txbuf: FixPt[FALSE,_8,_0], noise: FixPt[FALSE,_8,_0], remnoise: FixPt[FALSE,_8,_0], rxerrors: FixPt[FALSE,_16,_0], fixed: FixPt[FALSE,_16,_0], rssi_dbm: FltPt[_24,_8], remrssi_dbm: FltPt[_24,_8])
}

object RadioStatus {
}
