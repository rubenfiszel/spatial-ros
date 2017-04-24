package spatial.ros

import forge._
import org.virtualized._

trait HilControlsApi extends HilControlsExp {
    self: RosApi =>

}

trait HilControlsExp {
    self: RosExp =>

      implicit object HilControlsType extends Meta[HilControls] {
    def wrapped(x: Exp[HilControls]) = HilControls(x)
    def stagedClass = classOf[HilControls]
    def isPrimitive = false
  }
    case class HilControls(s: Exp[HilControls]) extends MetaAny[HilControls] {
    @api def roll_ailerons: FltPt[_24,_8] = ???
    @api def pitch_elevator: FltPt[_24,_8] = ???
    @api def yaw_rudder: FltPt[_24,_8] = ???
    @api def throttle: FltPt[_24,_8] = ???
    @api def aux1: FltPt[_24,_8] = ???
    @api def aux2: FltPt[_24,_8] = ???
    @api def aux3: FltPt[_24,_8] = ???
    @api def aux4: FltPt[_24,_8] = ???
    @api def mode: FixPt[FALSE,_8,_0] = ???
    @api def nav_mode: FixPt[FALSE,_8,_0] = ???

    @api def ===(that: HilControls) = ??? 
    @api def =!=(that: HilControls) = ??? 
    @api def toText: Text = ??? 
  }
}

object HilControls{
}
