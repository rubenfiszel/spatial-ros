package spatial.ros

import org.virtualized._

trait PositionTargetApi extends PositionTargetExp {
    self: RosApi =>

}

trait PositionTargetExp {
    self: RosExp =>

    case class PositionTarget(coordinate_frame: FixPt[FALSE,_8,_0], type_mask: FixPt[FALSE,_16,_0], position: Point, velocity: Vec3, acceleration_or_force: Vec3, yaw: FltPt[_24,_8], yaw_rate: FltPt[_24,_8])
}

object PositionTarget {
}
