package spatial.ros

trait RCOutApi extends RCOutExp {
    self: RosApi =>

}

trait RCOutExp {
    self: RosExp =>

    case class RCOut(channels: Array[FixPt[FALSE,_16,_0]])
}

object RCOut {
}
