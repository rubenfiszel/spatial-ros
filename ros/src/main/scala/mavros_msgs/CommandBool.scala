package spatial.ros

import argon.codegen.scalagen.ScalaCodegen
import forge._
import org.virtualized._

trait CommandBoolApi extends CommandBoolExp { self: RosApi =>

}

trait CommandBoolExp { self: RosExp =>

  implicit object CommandBoolType extends Meta[CommandBool] {
    def wrapped(x: Exp[CommandBool]) = CommandBool(x)
    def stagedClass                  = classOf[CommandBool]
    def isPrimitive                  = false
  }

  implicit object CommandBoolRepType extends Meta[CommandBoolRep] {
    def wrapped(x: Exp[CommandBoolRep]) = CommandBoolRep(x)
    def stagedClass                     = classOf[CommandBoolRep]
    def isPrimitive                     = false
  }

  case class CommandBool(s: Exp[CommandBool]) extends MetaAny[CommandBool] {
    @api def value: Bool = Bool(stage(CommandBool_value(s))(ctx))
    @api def response: CommandBoolRep =
      CommandBoolRep(stage(CommandBoolReply(s))(ctx))
    @api def ===(that: CommandBool): Bool = ???
    @api def =!=(that: CommandBool): Bool = ???
    @api def toText: Text                 = textify(this)
  }

  case class CommandBoolRep(s: Exp[CommandBoolRep])
      extends MetaAny[CommandBoolRep] {
    @api def success: Bool = Bool(stage(CommandBoolRep_reply_success(s))(ctx))
    @api def result: FixPt[FALSE, _8, _0] =
      FixPt(stage(CommandBoolRep_reply_result(s))(ctx))
    @api def ===(that: CommandBoolRep): Bool = ???
    @api def =!=(that: CommandBoolRep): Bool = ???
    @api def toText: Text                    = textify(this)
  }

  case class CommandBool_value(srv: Exp[CommandBool]) extends Op[Bool] {
    def mirror(f: Tx) = stage(CommandBool_value(f(srv)))(EmptyContext)
  }

  case class CommandBoolRep_reply_success(srv: Exp[CommandBoolRep])
      extends Op[Bool] {
    def mirror(f: Tx) =
      stage(CommandBoolRep_reply_success(f(srv)))(EmptyContext)
  }

  case class CommandBoolRep_reply_result(srv: Exp[CommandBoolRep])
      extends Op[FixPt[FALSE, _8, _0]] {
    def mirror(f: Tx) =
      stage(CommandBoolRep_reply_result(f(srv)))(EmptyContext)
  }

  case class CommandBoolReply(srv: Exp[CommandBool])
      extends Op[CommandBoolRep] {
    def mirror(f: Tx) = stage(CommandBoolReply(f(srv)))(EmptyContext)
  }
  case class NewCommandBool(value: Exp[Bool]) extends Op[CommandBool] {
    def mirror(f: Tx) = stage(NewCommandBool(f(value)))(EmptyContext)
  }

  object CommandBool {

    @api def apply(value: Bool): CommandBool =
      CommandBool(stage(NewCommandBool(value.s))(ctx))
  }

  object CommandBoolRep {}

}

trait ScalaGenCommandBool extends ScalaCodegen {}
