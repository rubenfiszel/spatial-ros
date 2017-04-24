
package spatial.ros

import forge._
import org.virtualized._

trait ParamValueApi extends ParamValueExp {
  self: RosApi =>

}

trait ParamValueExp {
  self: RosExp =>
  
  
case class ParamValue_integer(msg: Exp[ParamValue]) extends Op[FixPt[TRUE,_64,_0]] {
  def mirror(f: Tx) = ???//ParamValue_integer(f(msg))
}

  
case class ParamValue_real(msg: Exp[ParamValue]) extends Op[FltPt[_53,_11]] {
  def mirror(f: Tx) = ???//ParamValue_real(f(msg))
}


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
  
  object ParamValue {

  }

}

