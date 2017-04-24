package spatial.ros

import forge._
import org.virtualized._

trait ParamValueApi extends ParamValueExp {
    self: RosApi =>

}

trait ParamValueExp {
    self: RosExp =>

      implicit object ParamValueType extends Meta[ParamValue] {
    def wrapped(x: Exp[ParamValue]) = ParamValue(x)
    def stagedClass = classOf[ParamValue]
    def isPrimitive = false
  }
    case class ParamValue(s: Exp[ParamValue]) extends MetaAny[ParamValue] {
    @api def integer: FixPt[TRUE,_64,_0] = ???
    @api def real: FltPt[_53,_11] = ???

    @api def ===(that: ParamValue) = ??? 
    @api def =!=(that: ParamValue) = ??? 
    @api def toText: Text = ??? 
  }
}

object ParamValue{
}
