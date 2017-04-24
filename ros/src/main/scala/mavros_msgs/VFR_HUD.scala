
package spatial.ros

import forge._
import org.virtualized._

trait VFR_HUDApi extends VFR_HUDExp {
  self: RosApi =>

}

trait VFR_HUDExp {
  self: RosExp =>

  implicit object VFR_HUDType extends Meta[VFR_HUD] {
    def wrapped(x: Exp[VFR_HUD]) = VFR_HUD(x)
    def stagedClass = classOf[VFR_HUD]
    def isPrimitive = false
  }

  case class VFR_HUD(s: Exp[VFR_HUD]) extends MetaAny[VFR_HUD] {

    @api def ===(that: VFR_HUD) = ???
    @api def =!=(that: VFR_HUD) = ???
    @api def toText: Text = ???
  }


  
  object VFR_HUD {

  }

}

