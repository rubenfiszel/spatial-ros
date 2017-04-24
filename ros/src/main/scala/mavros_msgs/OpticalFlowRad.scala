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
    @api def integration_time_us: FixPt[FALSE,_32,_0] = ???
    @api def integrated_x: FltPt[_24,_8] = ???
    @api def integrated_y: FltPt[_24,_8] = ???
    @api def integrated_xgyro: FltPt[_24,_8] = ???
    @api def integrated_ygyro: FltPt[_24,_8] = ???
    @api def integrated_zgyro: FltPt[_24,_8] = ???
    @api def temperature: FixPt[TRUE,_16,_0] = ???
    @api def quality: FixPt[FALSE,_8,_0] = ???
    @api def time_delta_distance_us: FixPt[FALSE,_32,_0] = ???
    @api def distance: FltPt[_24,_8] = ???

    @api def ===(that: OpticalFlowRad) = ??? 
    @api def =!=(that: OpticalFlowRad) = ??? 
    @api def toText: Text = ??? 
  }
}

object OpticalFlowRad{
}
