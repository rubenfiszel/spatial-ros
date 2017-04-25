package spatial.ros

import argon.codegen.scalagen.ScalaCodegen
import forge._
import org.virtualized._

trait ParamPushApi extends ParamPushExp { self: RosApi =>

}

trait ParamPushExp { self: RosExp =>

  implicit object ParamPushType extends Meta[ParamPush] {
    def wrapped(x: Exp[ParamPush]) = ParamPush(x)
    def stagedClass                = classOf[ParamPush]
    def isPrimitive                = false
  }

  implicit object ParamPushRepType extends Meta[ParamPushRep] {
    def wrapped(x: Exp[ParamPushRep]) = ParamPushRep(x)
    def stagedClass                   = classOf[ParamPushRep]
    def isPrimitive                   = false
  }

  case class ParamPush(s: Exp[ParamPush]) extends MetaAny[ParamPush] {

    @api def response: ParamPushRep =
      ParamPushRep(stage(ParamPushReply(s))(ctx))
    @api def ===(that: ParamPush): Bool = ???
    @api def =!=(that: ParamPush): Bool = ???
    @api def toText: Text               = textify(this)
  }

  case class ParamPushRep(s: Exp[ParamPushRep]) extends MetaAny[ParamPushRep] {
    @api def success: Bool = Bool(stage(ParamPushRep_reply_success(s))(ctx))
    @api def param_transfered: FixPt[FALSE, _32, _0] =
      FixPt(stage(ParamPushRep_reply_param_transfered(s))(ctx))
    @api def ===(that: ParamPushRep): Bool = ???
    @api def =!=(that: ParamPushRep): Bool = ???
    @api def toText: Text                  = textify(this)
  }

  case class ParamPushRep_reply_success(srv: Exp[ParamPushRep])
      extends Op[Bool] {
    def mirror(f: Tx) = stage(ParamPushRep_reply_success(f(srv)))(EmptyContext)
  }

  case class ParamPushRep_reply_param_transfered(srv: Exp[ParamPushRep])
      extends Op[FixPt[FALSE, _32, _0]] {
    def mirror(f: Tx) =
      stage(ParamPushRep_reply_param_transfered(f(srv)))(EmptyContext)
  }

  case class ParamPushReply(srv: Exp[ParamPush]) extends Op[ParamPushRep] {
    def mirror(f: Tx) = stage(ParamPushReply(f(srv)))(EmptyContext)
  }
  case class NewParamPush() extends Op[ParamPush] {
    def mirror(f: Tx) = stage(NewParamPush())(EmptyContext)
  }

  object ParamPush {

    @api def apply(): ParamPush = ParamPush(stage(NewParamPush())(ctx))
  }

  object ParamPushRep {}

}

trait ScalaGenParamPush extends ScalaCodegen {}
