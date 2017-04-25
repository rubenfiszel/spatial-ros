package spatial.ros

import argon.codegen.scalagen.ScalaCodegen
import forge._
import org.virtualized._

trait OpticalFlowRadApi extends OpticalFlowRadExp { self: RosApi =>

}

trait OpticalFlowRadExp { self: RosExp =>

  implicit object OpticalFlowRadType extends Meta[OpticalFlowRad] {
    def wrapped(x: Exp[OpticalFlowRad]) = OpticalFlowRad(x)
    def stagedClass                     = classOf[OpticalFlowRad]
    def isPrimitive                     = false
  }

  case class OpticalFlowRad(s: Exp[OpticalFlowRad])
      extends MetaAny[OpticalFlowRad] {
    @api def integration_time_us: FixPt[FALSE, _32, _0] =
      FixPt(stage(OpticalFlowRad_integration_time_us(s))(ctx))
    @api def integrated_x: FltPt[_24, _8] =
      FltPt(stage(OpticalFlowRad_integrated_x(s))(ctx))
    @api def integrated_y: FltPt[_24, _8] =
      FltPt(stage(OpticalFlowRad_integrated_y(s))(ctx))
    @api def integrated_xgyro: FltPt[_24, _8] =
      FltPt(stage(OpticalFlowRad_integrated_xgyro(s))(ctx))
    @api def integrated_ygyro: FltPt[_24, _8] =
      FltPt(stage(OpticalFlowRad_integrated_ygyro(s))(ctx))
    @api def integrated_zgyro: FltPt[_24, _8] =
      FltPt(stage(OpticalFlowRad_integrated_zgyro(s))(ctx))
    @api def temperature: FixPt[TRUE, _16, _0] =
      FixPt(stage(OpticalFlowRad_temperature(s))(ctx))
    @api def quality: FixPt[FALSE, _8, _0] =
      FixPt(stage(OpticalFlowRad_quality(s))(ctx))
    @api def time_delta_distance_us: FixPt[FALSE, _32, _0] =
      FixPt(stage(OpticalFlowRad_time_delta_distance_us(s))(ctx))
    @api def distance: FltPt[_24, _8] =
      FltPt(stage(OpticalFlowRad_distance(s))(ctx))
    @api def ===(that: OpticalFlowRad) = ???
    @api def =!=(that: OpticalFlowRad) = ???
    @api def toText: Text              = textify(this)
  }

  case class OpticalFlowRad_integration_time_us(msg: Exp[OpticalFlowRad])
      extends Op[FixPt[FALSE, _32, _0]] {
    def mirror(f: Tx) =
      stage(OpticalFlowRad_integration_time_us(f(msg)))(EmptyContext)
  }

  case class OpticalFlowRad_integrated_x(msg: Exp[OpticalFlowRad])
      extends Op[FltPt[_24, _8]] {
    def mirror(f: Tx) =
      stage(OpticalFlowRad_integrated_x(f(msg)))(EmptyContext)
  }

  case class OpticalFlowRad_integrated_y(msg: Exp[OpticalFlowRad])
      extends Op[FltPt[_24, _8]] {
    def mirror(f: Tx) =
      stage(OpticalFlowRad_integrated_y(f(msg)))(EmptyContext)
  }

  case class OpticalFlowRad_integrated_xgyro(msg: Exp[OpticalFlowRad])
      extends Op[FltPt[_24, _8]] {
    def mirror(f: Tx) =
      stage(OpticalFlowRad_integrated_xgyro(f(msg)))(EmptyContext)
  }

  case class OpticalFlowRad_integrated_ygyro(msg: Exp[OpticalFlowRad])
      extends Op[FltPt[_24, _8]] {
    def mirror(f: Tx) =
      stage(OpticalFlowRad_integrated_ygyro(f(msg)))(EmptyContext)
  }

  case class OpticalFlowRad_integrated_zgyro(msg: Exp[OpticalFlowRad])
      extends Op[FltPt[_24, _8]] {
    def mirror(f: Tx) =
      stage(OpticalFlowRad_integrated_zgyro(f(msg)))(EmptyContext)
  }

  case class OpticalFlowRad_temperature(msg: Exp[OpticalFlowRad])
      extends Op[FixPt[TRUE, _16, _0]] {
    def mirror(f: Tx) = stage(OpticalFlowRad_temperature(f(msg)))(EmptyContext)
  }

  case class OpticalFlowRad_quality(msg: Exp[OpticalFlowRad])
      extends Op[FixPt[FALSE, _8, _0]] {
    def mirror(f: Tx) = stage(OpticalFlowRad_quality(f(msg)))(EmptyContext)
  }

  case class OpticalFlowRad_time_delta_distance_us(msg: Exp[OpticalFlowRad])
      extends Op[FixPt[FALSE, _32, _0]] {
    def mirror(f: Tx) =
      stage(OpticalFlowRad_time_delta_distance_us(f(msg)))(EmptyContext)
  }

  case class OpticalFlowRad_distance(msg: Exp[OpticalFlowRad])
      extends Op[FltPt[_24, _8]] {
    def mirror(f: Tx) = stage(OpticalFlowRad_distance(f(msg)))(EmptyContext)
  }

  case class NewOpticalFlowRad(
      integration_time_us: Exp[FixPt[FALSE, _32, _0]],
      integrated_x: Exp[FltPt[_24, _8]],
      integrated_y: Exp[FltPt[_24, _8]],
      integrated_xgyro: Exp[FltPt[_24, _8]],
      integrated_ygyro: Exp[FltPt[_24, _8]],
      integrated_zgyro: Exp[FltPt[_24, _8]],
      temperature: Exp[FixPt[TRUE, _16, _0]],
      quality: Exp[FixPt[FALSE, _8, _0]],
      time_delta_distance_us: Exp[FixPt[FALSE, _32, _0]],
      distance: Exp[FltPt[_24, _8]])
      extends Op[OpticalFlowRad] {
    def mirror(f: Tx) =
      stage(
        NewOpticalFlowRad(
          f(integration_time_us),
          f(integrated_x),
          f(integrated_y),
          f(integrated_xgyro),
          f(integrated_ygyro),
          f(integrated_zgyro),
          f(temperature),
          f(quality),
          f(time_delta_distance_us),
          f(distance)
        ))(EmptyContext)
  }

  object OpticalFlowRad {

    @api
    def apply(integration_time_us: FixPt[FALSE, _32, _0],
              integrated_x: FltPt[_24, _8],
              integrated_y: FltPt[_24, _8],
              integrated_xgyro: FltPt[_24, _8],
              integrated_ygyro: FltPt[_24, _8],
              integrated_zgyro: FltPt[_24, _8],
              temperature: FixPt[TRUE, _16, _0],
              quality: FixPt[FALSE, _8, _0],
              time_delta_distance_us: FixPt[FALSE, _32, _0],
              distance: FltPt[_24, _8]): OpticalFlowRad =
      OpticalFlowRad(
        stage(NewOpticalFlowRad(
          integration_time_us.s,
          integrated_x.s,
          integrated_y.s,
          integrated_xgyro.s,
          integrated_ygyro.s,
          integrated_zgyro.s,
          temperature.s,
          quality.s,
          time_delta_distance_us.s,
          distance.s
        ))(ctx))

  }

}

trait ScalaGenOpticalFlowRad extends ScalaCodegen {
  override def emitFileHeader() = {
//    emit(src"import DataImplicits._")
    super.emitFileHeader()
  }
}
