
package spatial.ros

import forge._
import org.virtualized._

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
    @api def param_id: Text = ???
    @api def value: ParamValue = ???
    @api def response: ParamSetRep = ???//ParamSetRep(ParamSetReply(s))
    @api def ===(that: ParamSet): Bool = ???
    @api def =!=(that: ParamSet): Bool = ???
    @api def toText: Text = ???
  }

  case class ParamSetRep(s: Exp[ParamSetRep]) extends MetaAny[ParamSetRep] {
    @api def success: Bool = ???
    @api def value: ParamValue = ???
    @api def ===(that: ParamSetRep): Bool = ???
    @api def =!=(that: ParamSetRep): Bool = ???
    @api def toText: Text = ???
  }

  
case class ParamSet_param_id(srv: Exp[ParamSet]) extends Op[Text] {
  def mirror(f: Tx) = stage(ParamSet_param_id(f(srv)))(EmptyContext)
}

  
case class ParamSet_value(srv: Exp[ParamSet]) extends Op[ParamValue] {
  def mirror(f: Tx) = stage(ParamSet_value(f(srv)))(EmptyContext)
}

  
case class ParamSetRep_param_id(srv: Exp[ParamSetRep]) extends Op[Text] {
  def mirror(f: Tx) = stage(ParamSetRep_param_id(f(srv)))(EmptyContext)
}

  
case class ParamSetRep_value(srv: Exp[ParamSetRep]) extends Op[ParamValue] {
  def mirror(f: Tx) = stage(ParamSetRep_value(f(srv)))(EmptyContext)
}

  case class ParamSetReply(srv: Exp[ParamSet]) extends Op[ParamSetRep]{
    def mirror(f: Tx) = stage(ParamSetReply(f(srv)))(EmptyContext)
  }

  
  object ParamSet {

  }

  object ParamSetRep {

  }

}

