
package spatial.ros

import forge._
import org.virtualized._

trait OpticalFlowRadApi extends OpticalFlowRadExp {
  self: RosApi =>

}

trait OpticalFlowRadExp {
  self: RosExp =>

  implicit object OpticalFlowRadType extends Meta[OpticalFlowRad] {
    def wrapped(x: Exp[OpticalFlowRad]) = OpticalFlowRad(x)
    def stagedClass = classOf[OpticalFlowRad]
    def isPrimitive = false
  }

  case class OpticalFlowRad(s: Exp[OpticalFlowRad]) extends MetaAny[OpticalFlowRad] {
    @api def integration_time_us: FixPt[FALSE,_32,_0] = FixPt(stage(OpticalFlowRad_integration_time_us(s))(ctx))
    @api def integrated_x: FltPt[_24,_8] = FltPt(stage(OpticalFlowRad_integrated_x(s))(ctx))
    @api def integrated_y: FltPt[_24,_8] = FltPt(stage(OpticalFlowRad_integrated_y(s))(ctx))
    @api def integrated_xgyro: FltPt[_24,_8] = FltPt(stage(OpticalFlowRad_integrated_xgyro(s))(ctx))
    @api def integrated_ygyro: FltPt[_24,_8] = FltPt(stage(OpticalFlowRad_integrated_ygyro(s))(ctx))
    @api def integrated_zgyro: FltPt[_24,_8] = FltPt(stage(OpticalFlowRad_integrated_zgyro(s))(ctx))
    @api def temperature: FixPt[TRUE,_16,_0] = FixPt(stage(OpticalFlowRad_temperature(s))(ctx))
    @api def quality: FixPt[FALSE,_8,_0] = FixPt(stage(OpticalFlowRad_quality(s))(ctx))
    @api def time_delta_distance_us: FixPt[FALSE,_32,_0] = FixPt(stage(OpticalFlowRad_time_delta_distance_us(s))(ctx))
    @api def distance: FltPt[_24,_8] = FltPt(stage(OpticalFlowRad_distance(s))(ctx))
    @api def ===(that: OpticalFlowRad) = ???
    @api def =!=(that: OpticalFlowRad) = ???
    @api def toText: Text = textify(this)
  }

  
case class OpticalFlowRad_integration_time_us(msg: Exp[OpticalFlowRad]) extends Op[FixPt[FALSE,_32,_0]] {
  def mirror(f: Tx) = stage(OpticalFlowRad_integration_time_us(f(msg)))(EmptyContext)
}

  
case class OpticalFlowRad_integrated_x(msg: Exp[OpticalFlowRad]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(OpticalFlowRad_integrated_x(f(msg)))(EmptyContext)
}

  
case class OpticalFlowRad_integrated_y(msg: Exp[OpticalFlowRad]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(OpticalFlowRad_integrated_y(f(msg)))(EmptyContext)
}

  
case class OpticalFlowRad_integrated_xgyro(msg: Exp[OpticalFlowRad]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(OpticalFlowRad_integrated_xgyro(f(msg)))(EmptyContext)
}

  
case class OpticalFlowRad_integrated_ygyro(msg: Exp[OpticalFlowRad]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(OpticalFlowRad_integrated_ygyro(f(msg)))(EmptyContext)
}

  
case class OpticalFlowRad_integrated_zgyro(msg: Exp[OpticalFlowRad]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(OpticalFlowRad_integrated_zgyro(f(msg)))(EmptyContext)
}

  
case class OpticalFlowRad_temperature(msg: Exp[OpticalFlowRad]) extends Op[FixPt[TRUE,_16,_0]] {
  def mirror(f: Tx) = stage(OpticalFlowRad_temperature(f(msg)))(EmptyContext)
}

  
case class OpticalFlowRad_quality(msg: Exp[OpticalFlowRad]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(OpticalFlowRad_quality(f(msg)))(EmptyContext)
}

  
case class OpticalFlowRad_time_delta_distance_us(msg: Exp[OpticalFlowRad]) extends Op[FixPt[FALSE,_32,_0]] {
  def mirror(f: Tx) = stage(OpticalFlowRad_time_delta_distance_us(f(msg)))(EmptyContext)
}

  
case class OpticalFlowRad_distance(msg: Exp[OpticalFlowRad]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(OpticalFlowRad_distance(f(msg)))(EmptyContext)
}

  
  object OpticalFlowRad {

  }

}

