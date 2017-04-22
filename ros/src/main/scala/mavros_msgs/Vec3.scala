package spatial.ros

import org.virtualized._

trait Vec3Api extends Vec3Exp {
    self: RosApi =>

}

trait Vec3Exp {
    self: RosExp =>

    @struct case class Vec3(x: FltPt[_53,_11], y: FltPt[_53,_11], z: FltPt[_53,_11])
}

object Vec3 {
}
