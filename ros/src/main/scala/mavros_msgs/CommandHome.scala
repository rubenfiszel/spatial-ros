package spatial.ros

import argon.codegen.scalagen.ScalaCodegen
import forge._
import org.virtualized._

trait CommandHomeApi extends CommandHomeExp { self: RosApi =>

}

trait CommandHomeExp { self: RosExp =>

  implicit object CommandHomeType extends Meta[CommandHome] {
    def wrapped(x: Exp[CommandHome]) = CommandHome(x)
    def stagedClass                  = classOf[CommandHome]
    def isPrimitive                  = false
  }

  implicit object CommandHomeRepType extends Meta[CommandHomeRep] {
    def wrapped(x: Exp[CommandHomeRep]) = CommandHomeRep(x)
    def stagedClass                     = classOf[CommandHomeRep]
    def isPrimitive                     = false
  }

  case class CommandHome(s: Exp[CommandHome]) extends MetaAny[CommandHome] {
    @api def current_gps: Bool = Bool(stage(CommandHome_current_gps(s))(ctx))
    @api def latitude: FltPt[_24, _8] =
      FltPt(stage(CommandHome_latitude(s))(ctx))
    @api def longitude: FltPt[_24, _8] =
      FltPt(stage(CommandHome_longitude(s))(ctx))
    @api def altitude: FltPt[_24, _8] =
      FltPt(stage(CommandHome_altitude(s))(ctx))
    @api def response: CommandHomeRep =
      CommandHomeRep(stage(CommandHomeReply(s))(ctx))
    @api def ===(that: CommandHome): Bool = ???
    @api def =!=(that: CommandHome): Bool = ???
    @api def toText: Text                 = textify(this)
  }

  case class CommandHomeRep(s: Exp[CommandHomeRep])
      extends MetaAny[CommandHomeRep] {
    @api def success: Bool = Bool(stage(CommandHomeRep_reply_success(s))(ctx))
    @api def result: FixPt[FALSE, _8, _0] =
      FixPt(stage(CommandHomeRep_reply_result(s))(ctx))
    @api def ===(that: CommandHomeRep): Bool = ???
    @api def =!=(that: CommandHomeRep): Bool = ???
    @api def toText: Text                    = textify(this)
  }

  case class CommandHome_current_gps(srv: Exp[CommandHome]) extends Op[Bool] {
    def mirror(f: Tx) = stage(CommandHome_current_gps(f(srv)))(EmptyContext)
  }

  case class CommandHome_latitude(srv: Exp[CommandHome])
      extends Op[FltPt[_24, _8]] {
    def mirror(f: Tx) = stage(CommandHome_latitude(f(srv)))(EmptyContext)
  }

  case class CommandHome_longitude(srv: Exp[CommandHome])
      extends Op[FltPt[_24, _8]] {
    def mirror(f: Tx) = stage(CommandHome_longitude(f(srv)))(EmptyContext)
  }

  case class CommandHome_altitude(srv: Exp[CommandHome])
      extends Op[FltPt[_24, _8]] {
    def mirror(f: Tx) = stage(CommandHome_altitude(f(srv)))(EmptyContext)
  }

  case class CommandHomeRep_reply_success(srv: Exp[CommandHomeRep])
      extends Op[Bool] {
    def mirror(f: Tx) =
      stage(CommandHomeRep_reply_success(f(srv)))(EmptyContext)
  }

  case class CommandHomeRep_reply_result(srv: Exp[CommandHomeRep])
      extends Op[FixPt[FALSE, _8, _0]] {
    def mirror(f: Tx) =
      stage(CommandHomeRep_reply_result(f(srv)))(EmptyContext)
  }

  case class CommandHomeReply(srv: Exp[CommandHome])
      extends Op[CommandHomeRep] {
    def mirror(f: Tx) = stage(CommandHomeReply(f(srv)))(EmptyContext)
  }
  case class NewCommandHome(current_gps: Exp[Bool],
                            latitude: Exp[FltPt[_24, _8]],
                            longitude: Exp[FltPt[_24, _8]],
                            altitude: Exp[FltPt[_24, _8]])
      extends Op[CommandHome] {
    def mirror(f: Tx) =
      stage(
        NewCommandHome(f(current_gps),
                       f(latitude),
                       f(longitude),
                       f(altitude)))(EmptyContext)
  }

  object CommandHome {

    @api
    def apply(current_gps: Bool,
              latitude: FltPt[_24, _8],
              longitude: FltPt[_24, _8],
              altitude: FltPt[_24, _8]): CommandHome =
      CommandHome(
        stage(
          NewCommandHome(current_gps.s, latitude.s, longitude.s, altitude.s))(
          ctx))
  }

  object CommandHomeRep {}

}

trait ScalaGenCommandHome extends ScalaCodegen {}
