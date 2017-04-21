package spatial.ros

trait Vector3Api extends Vector3Exp {
    self: RosApi =>

}

trait Vector3Exp {
    self: RosExp =>

    case class Vector3(x: FltPt[_53,_11], y: FltPt[_53,_11], z: FltPt[_53,_11])
}

object Vector3 {
}
