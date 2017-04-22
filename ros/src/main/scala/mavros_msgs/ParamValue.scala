package spatial.ros

import org.virtualized._

trait ParamValueApi extends ParamValueExp {
    self: RosApi =>

}

trait ParamValueExp {
    self: RosExp =>

    case class ParamValue(integer: FixPt[TRUE,_64,_0], real: FltPt[_53,_11])
}

object ParamValue {
}
