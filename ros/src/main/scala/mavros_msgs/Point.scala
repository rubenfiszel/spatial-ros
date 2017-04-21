package spatial.ros

trait PointApi extends PointExp {
    self: RosApi =>

}

trait PointExp {
    self: RosExp =>

    case class Point(x: FltPt[_53,_11], y: FltPt[_53,_11], z: FltPt[_53,_11])
}

object Point {
}
