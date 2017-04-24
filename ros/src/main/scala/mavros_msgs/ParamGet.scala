
package spatial.ros

import forge._
import org.virtualized._

trait ParamGetApi extends ParamGetExp {
  self: RosApi =>

}

trait ParamGetExp {
  self: RosExp =>
  
  implicit object ParamGetType extends Meta[ParamGet] {
    def wrapped(x: Exp[ParamGet]) = ParamGet(x)
    def stagedClass = classOf[ParamGet]
    def isPrimitive = false
  }

  implicit object ParamGetRepType extends Meta[ParamGetRep] {
    def wrapped(x: Exp[ParamGetRep]) = ParamGetRep(x)
    def stagedClass = classOf[ParamGetRep]
    def isPrimitive = false
  }

  case class ParamGet(s: Exp[ParamGet]) extends MetaAny[ParamGet] {
    @api def param_id: Text = ???
    @api def response: ParamGetRep = ???//ParamGetRep(ParamGetReply(s))
    @api def ===(that: ParamGet): Bool = ???
    @api def =!=(that: ParamGet): Bool = ???
    @api def toText: Text = ???
  }

  case class ParamGetRep(s: Exp[ParamGetRep]) extends MetaAny[ParamGetRep] {
    @api def success: Bool = ???
    @api def value: ParamValue = ???
    @api def ===(that: ParamGetRep): Bool = ???
    @api def =!=(that: ParamGetRep): Bool = ???
    @api def toText: Text = ???
  }

  
case class ParamGet_param_id(srv: Exp[ParamGet]) extends Op[Text] {
  def mirror(f: Tx) = stage(ParamGet_param_id(f(srv)))(EmptyContext)
}

  
case class ParamGetRep_param_id(srv: Exp[ParamGetRep]) extends Op[Text] {
  def mirror(f: Tx) = stage(ParamGetRep_param_id(f(srv)))(EmptyContext)
}

  case class ParamGetReply(srv: Exp[ParamGet]) extends Op[ParamGetRep]{
    def mirror(f: Tx) = stage(ParamGetReply(f(srv)))(EmptyContext)
  }

  
  object ParamGet {

  }

  object ParamGetRep {

  }

}

