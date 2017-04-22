package spatial.ros

import org.virtualized._

trait GlobalPositionTargetApi extends GlobalPositionTargetExp {
    self: RosApi =>

}

trait GlobalPositionTargetExp {
    self: RosExp =>

    @struct case class GlobalPositionTarget(coordinate_frame: FixPt[FALSE,_8,_0], type_mask: FixPt[FALSE,_16,_0], latitude: FltPt[_53,_11], longitude: FltPt[_53,_11], velocity: Vec3, acceleration_or_force: Vec3, yaw: FltPt[_24,_8], yaw_rate: FltPt[_24,_8])
}

object GlobalPositionTarget {
}
