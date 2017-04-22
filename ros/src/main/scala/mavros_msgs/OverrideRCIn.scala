package spatial.ros

import org.virtualized._

trait OverrideRCInApi extends OverrideRCInExp {
    self: RosApi =>

}

trait OverrideRCInExp {
    self: RosExp =>

    @struct case class OverrideRCIn(channels: FixPt[FALSE,_16,_0])
}

object OverrideRCIn {val CHAN_RELEASE = 0
val CHAN_NOCHANGE = 65535
}
