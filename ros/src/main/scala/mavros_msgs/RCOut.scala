package spatial.ros

import org.virtualized._

trait RCOutApi extends RCOutExp {
    self: RosApi =>

}

trait RCOutExp {
    self: RosExp =>

    @struct case class RCOut(channels: MetaArray[FixPt[FALSE,_16,_0]])
}

object RCOut {
}
