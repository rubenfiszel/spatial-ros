package spatial.ros

import argon.codegen.scalagen.ScalaCodegen
import forge._
import org.virtualized._

trait ParamGetApi extends ParamGetExp { self: RosApi =>

}

trait ParamGetExp { self: RosExp =>

  implicit object ParamGetType extends Meta[ParamGet] {
    def wrapped(x: Exp[ParamGet]) = ParamGet(x)
    def stagedClass               = classOf[ParamGet]
    def isPrimitive               = false
  }

  implicit object ParamGetRepType extends Meta[ParamGetRep] {
    def wrapped(x: Exp[ParamGetRep]) = ParamGetRep(x)
    def stagedClass                  = classOf[ParamGetRep]
    def isPrimitive                  = false
  }

  case class ParamGet(s: Exp[ParamGet]) extends MetaAny[ParamGet] {
    @api def param_id: Text            = Text(stage(ParamGet_param_id(s))(ctx))
    @api def response: ParamGetRep     = ParamGetRep(stage(ParamGetReply(s))(ctx))
    @api def ===(that: ParamGet): Bool = ???
    @api def =!=(that: ParamGet): Bool = ???
    @api def toText: Text              = textify(this)
  }

  case class ParamGetRep(s: Exp[ParamGetRep]) extends MetaAny[ParamGetRep] {
    @api def success: Bool = Bool(stage(ParamGetRep_reply_success(s))(ctx))
    @api def value: ParamValue =
      ParamValue(stage(ParamGetRep_reply_value(s))(ctx))
    @api def ===(that: ParamGetRep): Bool = ???
    @api def =!=(that: ParamGetRep): Bool = ???
    @api def toText: Text                 = textify(this)
  }

  case class ParamGet_param_id(srv: Exp[ParamGet]) extends Op[Text] {
    def mirror(f: Tx) = stage(ParamGet_param_id(f(srv)))(EmptyContext)
  }

  case class ParamGetRep_reply_success(srv: Exp[ParamGetRep])
      extends Op[Bool] {
    def mirror(f: Tx) = stage(ParamGetRep_reply_success(f(srv)))(EmptyContext)
  }

  case class ParamGetRep_reply_value(srv: Exp[ParamGetRep])
      extends Op[ParamValue] {
    def mirror(f: Tx) = stage(ParamGetRep_reply_value(f(srv)))(EmptyContext)
  }

  case class ParamGetReply(srv: Exp[ParamGet]) extends Op[ParamGetRep] {
    def mirror(f: Tx) = stage(ParamGetReply(f(srv)))(EmptyContext)
  }
  case class NewParamGet(param_id: Exp[Text]) extends Op[ParamGet] {
    def mirror(f: Tx) = stage(NewParamGet(f(param_id)))(EmptyContext)
  }

  object ParamGet {

    @api def apply(param_id: Text): ParamGet =
      ParamGet(stage(NewParamGet(param_id.s))(ctx))
  }

  object ParamGetRep {}

}

trait ScalaGenParamGet extends ScalaCodegen {}
