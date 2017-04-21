package spatial.ros

trait AttitudeTargetApi extends AttitudeTargetExp {
    self: RosApi =>

}

trait AttitudeTargetExp {
    self: RosExp =>

    case class AttitudeTarget(type_mask: FixPt[FALSE,_8,_0], orientation: Quaternion, body_rate: Vector3, thrust: FltPt[_24,_8])
}

object AttitudeTarget {
}
