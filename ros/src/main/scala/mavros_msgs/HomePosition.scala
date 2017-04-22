package spatial.ros

import org.virtualized._

trait HomePositionApi extends HomePositionExp {
    self: RosApi =>

}

trait HomePositionExp {
    self: RosExp =>

    @struct case class HomePosition(longitude: FltPt[_53,_11])
}

object HomePosition {
}
