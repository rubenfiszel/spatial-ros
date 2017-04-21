case class RadioStatus.msg(rssi: uint8, remrssi: uint8, txbuf: uint8, noise: uint8, remnoise: uint8, rxerrors: uint16, fixed: uint16, rssi_dbm: float32, remrssi_dbm: float32)
object RadioStatus.msg {
}
