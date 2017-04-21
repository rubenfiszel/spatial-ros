package spatial.ros

trait QuaternionApi extends QuaternionExp {
    self: RosApi =>

}

trait QuaternionExp {
    self: RosExp =>

    case class Quaternion(x: FltPt[_53,_11], y: FltPt[_53,_11], z: FltPt[_53,_11], w: FltPt[_53,_11])
}

object Quaternion {
}
