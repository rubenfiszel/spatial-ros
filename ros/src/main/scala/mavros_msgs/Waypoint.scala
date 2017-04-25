package spatial.ros

import argon.codegen.scalagen.ScalaCodegen
import forge._
import org.virtualized._

trait WaypointApi extends WaypointExp { self: RosApi =>

}

trait WaypointExp { self: RosExp =>

  implicit object WaypointType extends Meta[Waypoint] {
    def wrapped(x: Exp[Waypoint]) = Waypoint(x)
    def stagedClass               = classOf[Waypoint]
    def isPrimitive               = false
  }

  case class Waypoint(s: Exp[Waypoint]) extends MetaAny[Waypoint] {
    @api def frame: FixPt[FALSE, _8, _0] = FixPt(stage(Waypoint_frame(s))(ctx))
    @api def command: FixPt[FALSE, _16, _0] =
      FixPt(stage(Waypoint_command(s))(ctx))
    @api def is_current: Bool        = Bool(stage(Waypoint_is_current(s))(ctx))
    @api def autocontinue: Bool      = Bool(stage(Waypoint_autocontinue(s))(ctx))
    @api def param1: FltPt[_24, _8]  = FltPt(stage(Waypoint_param1(s))(ctx))
    @api def param2: FltPt[_24, _8]  = FltPt(stage(Waypoint_param2(s))(ctx))
    @api def param3: FltPt[_24, _8]  = FltPt(stage(Waypoint_param3(s))(ctx))
    @api def param4: FltPt[_24, _8]  = FltPt(stage(Waypoint_param4(s))(ctx))
    @api def x_lat: FltPt[_53, _11]  = FltPt(stage(Waypoint_x_lat(s))(ctx))
    @api def y_long: FltPt[_53, _11] = FltPt(stage(Waypoint_y_long(s))(ctx))
    @api def z_alt: FltPt[_53, _11]  = FltPt(stage(Waypoint_z_alt(s))(ctx))
    @api def ===(that: Waypoint)     = ???
    @api def =!=(that: Waypoint)     = ???
    @api def toText: Text            = textify(this)
  }

  case class Waypoint_frame(msg: Exp[Waypoint])
      extends Op[FixPt[FALSE, _8, _0]] {
    def mirror(f: Tx) = stage(Waypoint_frame(f(msg)))(EmptyContext)
  }

  case class Waypoint_command(msg: Exp[Waypoint])
      extends Op[FixPt[FALSE, _16, _0]] {
    def mirror(f: Tx) = stage(Waypoint_command(f(msg)))(EmptyContext)
  }

  case class Waypoint_is_current(msg: Exp[Waypoint]) extends Op[Bool] {
    def mirror(f: Tx) = stage(Waypoint_is_current(f(msg)))(EmptyContext)
  }

  case class Waypoint_autocontinue(msg: Exp[Waypoint]) extends Op[Bool] {
    def mirror(f: Tx) = stage(Waypoint_autocontinue(f(msg)))(EmptyContext)
  }

  case class Waypoint_param1(msg: Exp[Waypoint]) extends Op[FltPt[_24, _8]] {
    def mirror(f: Tx) = stage(Waypoint_param1(f(msg)))(EmptyContext)
  }

  case class Waypoint_param2(msg: Exp[Waypoint]) extends Op[FltPt[_24, _8]] {
    def mirror(f: Tx) = stage(Waypoint_param2(f(msg)))(EmptyContext)
  }

  case class Waypoint_param3(msg: Exp[Waypoint]) extends Op[FltPt[_24, _8]] {
    def mirror(f: Tx) = stage(Waypoint_param3(f(msg)))(EmptyContext)
  }

  case class Waypoint_param4(msg: Exp[Waypoint]) extends Op[FltPt[_24, _8]] {
    def mirror(f: Tx) = stage(Waypoint_param4(f(msg)))(EmptyContext)
  }

  case class Waypoint_x_lat(msg: Exp[Waypoint]) extends Op[FltPt[_53, _11]] {
    def mirror(f: Tx) = stage(Waypoint_x_lat(f(msg)))(EmptyContext)
  }

  case class Waypoint_y_long(msg: Exp[Waypoint]) extends Op[FltPt[_53, _11]] {
    def mirror(f: Tx) = stage(Waypoint_y_long(f(msg)))(EmptyContext)
  }

  case class Waypoint_z_alt(msg: Exp[Waypoint]) extends Op[FltPt[_53, _11]] {
    def mirror(f: Tx) = stage(Waypoint_z_alt(f(msg)))(EmptyContext)
  }

  case class NewWaypoint(frame: Exp[FixPt[FALSE, _8, _0]],
                         command: Exp[FixPt[FALSE, _16, _0]],
                         is_current: Exp[Bool],
                         autocontinue: Exp[Bool],
                         param1: Exp[FltPt[_24, _8]],
                         param2: Exp[FltPt[_24, _8]],
                         param3: Exp[FltPt[_24, _8]],
                         param4: Exp[FltPt[_24, _8]],
                         x_lat: Exp[FltPt[_53, _11]],
                         y_long: Exp[FltPt[_53, _11]],
                         z_alt: Exp[FltPt[_53, _11]])
      extends Op[Waypoint] {
    def mirror(f: Tx) =
      stage(
        NewWaypoint(f(frame),
                    f(command),
                    f(is_current),
                    f(autocontinue),
                    f(param1),
                    f(param2),
                    f(param3),
                    f(param4),
                    f(x_lat),
                    f(y_long),
                    f(z_alt)))(EmptyContext)
  }

  object Waypoint {

    @api
    def apply(frame: FixPt[FALSE, _8, _0],
              command: FixPt[FALSE, _16, _0],
              is_current: Bool,
              autocontinue: Bool,
              param1: FltPt[_24, _8],
              param2: FltPt[_24, _8],
              param3: FltPt[_24, _8],
              param4: FltPt[_24, _8],
              x_lat: FltPt[_53, _11],
              y_long: FltPt[_53, _11],
              z_alt: FltPt[_53, _11]): Waypoint =
      Waypoint(
        stage(
          NewWaypoint(frame.s,
                      command.s,
                      is_current.s,
                      autocontinue.s,
                      param1.s,
                      param2.s,
                      param3.s,
                      param4.s,
                      x_lat.s,
                      y_long.s,
                      z_alt.s))(ctx))

  }

}

trait ScalaGenWaypoint extends ScalaCodegen {
  override def emitFileHeader() = {
//    emit(src"import DataImplicits._")
    super.emitFileHeader()
  }
}
