
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen

trait ParamSetApi extends ParamSetExp {
  self: RosApi =>

}

trait ParamSetExp {
  self: RosExp =>
  
  implicit object ParamSetType extends Meta[ParamSet] {
    def wrapped(x: Exp[ParamSet]) = ParamSet(x)
    def stagedClass = classOf[ParamSet]
    def isPrimitive = false
  }

  implicit object ParamSetRepType extends Meta[ParamSetRep] {
    def wrapped(x: Exp[ParamSetRep]) = ParamSetRep(x)
    def stagedClass = classOf[ParamSetRep]
    def isPrimitive = false
  }

  case class ParamSet(s: Exp[ParamSet]) extends MetaAny[ParamSet] {
    @api def param_id: Text = Text(stage(ParamSet_param_id(s))(ctx))
    @api def value: ParamValue = ParamValue(stage(ParamSet_value(s))(ctx))
    @api def response: ParamSetRep = ParamSetRep(stage(ParamSetReply(s))(ctx))
    @api def ===(that: ParamSet): Bool = ???
    @api def =!=(that: ParamSet): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class ParamSetRep(s: Exp[ParamSetRep]) extends MetaAny[ParamSetRep] {
    @api def success: Bool = Bool(stage(ParamSetRep_reply_success(s))(ctx))
    @api def value: ParamValue = ParamValue(stage(ParamSetRep_reply_value(s))(ctx))
    @api def ===(that: ParamSetRep): Bool = ???
    @api def =!=(that: ParamSetRep): Bool = ???
    @api def toText: Text = textify(this)
  }

  
case class ParamSet_param_id(srv: Exp[ParamSet]) extends Op[Text] {
  def mirror(f: Tx) = stage(ParamSet_param_id(f(srv)))(EmptyContext)
}

  
case class ParamSet_value(srv: Exp[ParamSet]) extends Op[ParamValue] {
  def mirror(f: Tx) = stage(ParamSet_value(f(srv)))(EmptyContext)
}

  
case class ParamSetRep_reply_success(srv: Exp[ParamSetRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(ParamSetRep_reply_success(f(srv)))(EmptyContext)
}

  
case class ParamSetRep_reply_value(srv: Exp[ParamSetRep]) extends Op[ParamValue] {
  def mirror(f: Tx) = stage(ParamSetRep_reply_value(f(srv)))(EmptyContext)
}

  case class ParamSetReply(srv: Exp[ParamSet]) extends Op[ParamSetRep]{
    def mirror(f: Tx) = stage(ParamSetReply(f(srv)))(EmptyContext)
  }
  case class NewParamSet(param_id: Exp[Text], value: Exp[ParamValue]) extends Op[ParamSet] {
    def mirror(f: Tx) = stage(NewParamSet(f(param_id), f(value)))(EmptyContext)
  }

  
  object ParamSet {

  @api def apply(param_id: Text, value: ParamValue): ParamSet = ParamSet(stage(NewParamSet(param_id.s, value.s))(ctx))
  }

  object ParamSetRep {

  }

}

trait ScalaGenParamSet extends ScalaCodegen{
}

