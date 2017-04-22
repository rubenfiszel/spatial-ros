package spatial.ros

import org.virtualized._

trait MavlinkApi extends MavlinkExp {
    self: RosApi =>

}

trait MavlinkExp {
    self: RosExp =>

    @struct case class Mavlink(is_valid: Bool, len: FixPt[FALSE,_8,_0], seq: FixPt[FALSE,_8,_0], sysid: FixPt[FALSE,_8,_0], compid: FixPt[FALSE,_8,_0], msgid: FixPt[FALSE,_8,_0], checksum: FixPt[FALSE,_16,_0], payload64: MetaArray[FixPt[FALSE,_64,_0]])
}

object Mavlink {
}
