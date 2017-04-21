package spatial.ros

trait PositionTargetApi extends PositionTargetExp {
    self: RosApi =>

}

trait PositionTargetExp {
    self: RosExp =>

    case class PositionTarget(coordinate_frame: FixPt[FALSE,_8,_0], type_mask: FixPt[FALSE,_16,_0], position: Point, velocity: Vector3, acceleration_or_force: Vector3, yaw: FltPt[_24,_8], yaw_rate: FltPt[_24,_8])
}

object PositionTarget {
}
