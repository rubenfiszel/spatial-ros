package spatial.ros

import argon.codegen.scalagen.ScalaCodegen
import forge._
import org.virtualized._

trait CommandLongApi extends CommandLongExp { self: RosApi =>

}

trait CommandLongExp { self: RosExp =>

  implicit object CommandLongType extends Meta[CommandLong] {
    def wrapped(x: Exp[CommandLong]) = CommandLong(x)
    def stagedClass                  = classOf[CommandLong]
    def isPrimitive                  = false
  }

  implicit object CommandLongRepType extends Meta[CommandLongRep] {
    def wrapped(x: Exp[CommandLongRep]) = CommandLongRep(x)
    def stagedClass                     = classOf[CommandLongRep]
    def isPrimitive                     = false
  }

  case class CommandLong(s: Exp[CommandLong]) extends MetaAny[CommandLong] {
    @api def command: FixPt[FALSE, _16, _0] =
      FixPt(stage(CommandLong_command(s))(ctx))
    @api def confirmation: FixPt[FALSE, _8, _0] =
      FixPt(stage(CommandLong_confirmation(s))(ctx))
    @api def param1: FltPt[_24, _8] = FltPt(stage(CommandLong_param1(s))(ctx))
    @api def param2: FltPt[_24, _8] = FltPt(stage(CommandLong_param2(s))(ctx))
    @api def param3: FltPt[_24, _8] = FltPt(stage(CommandLong_param3(s))(ctx))
    @api def param4: FltPt[_24, _8] = FltPt(stage(CommandLong_param4(s))(ctx))
    @api def response: CommandLongRep =
      CommandLongRep(stage(CommandLongReply(s))(ctx))
    @api def ===(that: CommandLong): Bool = ???
    @api def =!=(that: CommandLong): Bool = ???
    @api def toText: Text                 = textify(this)
  }

  case class CommandLongRep(s: Exp[CommandLongRep])
      extends MetaAny[CommandLongRep] {
    @api def success: Bool = Bool(stage(CommandLongRep_reply_success(s))(ctx))
    @api def result: FixPt[FALSE, _8, _0] =
      FixPt(stage(CommandLongRep_reply_result(s))(ctx))
    @api def ===(that: CommandLongRep): Bool = ???
    @api def =!=(that: CommandLongRep): Bool = ???
    @api def toText: Text                    = textify(this)
  }

  case class CommandLong_command(srv: Exp[CommandLong])
      extends Op[FixPt[FALSE, _16, _0]] {
    def mirror(f: Tx) = stage(CommandLong_command(f(srv)))(EmptyContext)
  }

  case class CommandLong_confirmation(srv: Exp[CommandLong])
      extends Op[FixPt[FALSE, _8, _0]] {
    def mirror(f: Tx) = stage(CommandLong_confirmation(f(srv)))(EmptyContext)
  }

  case class CommandLong_param1(srv: Exp[CommandLong])
      extends Op[FltPt[_24, _8]] {
    def mirror(f: Tx) = stage(CommandLong_param1(f(srv)))(EmptyContext)
  }

  case class CommandLong_param2(srv: Exp[CommandLong])
      extends Op[FltPt[_24, _8]] {
    def mirror(f: Tx) = stage(CommandLong_param2(f(srv)))(EmptyContext)
  }

  case class CommandLong_param3(srv: Exp[CommandLong])
      extends Op[FltPt[_24, _8]] {
    def mirror(f: Tx) = stage(CommandLong_param3(f(srv)))(EmptyContext)
  }

  case class CommandLong_param4(srv: Exp[CommandLong])
      extends Op[FltPt[_24, _8]] {
    def mirror(f: Tx) = stage(CommandLong_param4(f(srv)))(EmptyContext)
  }

  case class CommandLongRep_reply_success(srv: Exp[CommandLongRep])
      extends Op[Bool] {
    def mirror(f: Tx) =
      stage(CommandLongRep_reply_success(f(srv)))(EmptyContext)
  }

  case class CommandLongRep_reply_result(srv: Exp[CommandLongRep])
      extends Op[FixPt[FALSE, _8, _0]] {
    def mirror(f: Tx) =
      stage(CommandLongRep_reply_result(f(srv)))(EmptyContext)
  }

  case class CommandLongReply(srv: Exp[CommandLong])
      extends Op[CommandLongRep] {
    def mirror(f: Tx) = stage(CommandLongReply(f(srv)))(EmptyContext)
  }
  case class NewCommandLong(command: Exp[FixPt[FALSE, _16, _0]],
                            confirmation: Exp[FixPt[FALSE, _8, _0]],
                            param1: Exp[FltPt[_24, _8]],
                            param2: Exp[FltPt[_24, _8]],
                            param3: Exp[FltPt[_24, _8]],
                            param4: Exp[FltPt[_24, _8]])
      extends Op[CommandLong] {
    def mirror(f: Tx) =
      stage(
        NewCommandLong(f(command),
                       f(confirmation),
                       f(param1),
                       f(param2),
                       f(param3),
                       f(param4)))(EmptyContext)
  }

  object CommandLong {

    @api
    def apply(command: FixPt[FALSE, _16, _0],
              confirmation: FixPt[FALSE, _8, _0],
              param1: FltPt[_24, _8],
              param2: FltPt[_24, _8],
              param3: FltPt[_24, _8],
              param4: FltPt[_24, _8]): CommandLong =
      CommandLong(
        stage(
          NewCommandLong(command.s,
                         confirmation.s,
                         param1.s,
                         param2.s,
                         param3.s,
                         param4.s))(ctx))
  }

  object CommandLongRep {}

}

trait ScalaGenCommandLong extends ScalaCodegen {}
