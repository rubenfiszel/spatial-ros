
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen

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
    @api def integer: FixPt[TRUE,_64,_0] = FixPt(stage(ParamValue_integer(s))(ctx))
    @api def real: FltPt[_53,_11] = FltPt(stage(ParamValue_real(s))(ctx))
    @api def ===(that: ParamValue) = ???
    @api def =!=(that: ParamValue) = ???
    @api def toText: Text = textify(this)
  }

  
case class ParamValue_integer(msg: Exp[ParamValue]) extends Op[FixPt[TRUE,_64,_0]] {
  def mirror(f: Tx) = stage(ParamValue_integer(f(msg)))(EmptyContext)
}

  
case class ParamValue_real(msg: Exp[ParamValue]) extends Op[FltPt[_53,_11]] {
  def mirror(f: Tx) = stage(ParamValue_real(f(msg)))(EmptyContext)
}

  case class NewParamValue(integer: Exp[FixPt[TRUE,_64,_0]], real: Exp[FltPt[_53,_11]]) extends Op[ParamValue] {
    def mirror(f: Tx) = stage(NewParamValue(f(integer), f(real)))(EmptyContext)
  }

  object ParamValue {

  @api def apply(integer: FixPt[TRUE,_64,_0], real: FltPt[_53,_11]): ParamValue = ParamValue(stage(NewParamValue(integer.s, real.s))(ctx))


  }

}

trait ScalaGenParamValue extends ScalaCodegen{
  override def emitFileHeader() = {
//    emit(src"import DataImplicits._")
    super.emitFileHeader()
  }
}

