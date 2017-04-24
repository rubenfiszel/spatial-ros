
package spatial.ros

import forge._
import org.virtualized._

trait VibrationApi extends VibrationExp {
  self: RosApi =>

}

trait VibrationExp {
  self: RosExp =>
  


  implicit object VibrationType extends Meta[Vibration] {
    def wrapped(x: Exp[Vibration]) = Vibration(x)
    def stagedClass = classOf[Vibration]
    def isPrimitive = false
  }

  case class Vibration(s: Exp[Vibration]) extends MetaAny[Vibration] {

    @api def ===(that: Vibration) = ???
    @api def =!=(that: Vibration) = ???
    @api def toText: Text = ???
  }
  
  object Vibration {

  }

}

