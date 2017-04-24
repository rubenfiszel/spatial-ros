package spatial.ros

import forge._
import org.virtualized._

trait AltitudeApi extends AltitudeExp {
    self: RosApi =>

}

trait AltitudeExp {
    self: RosExp =>

      implicit object AltitudeType extends Meta[Altitude] {
    def wrapped(x: Exp[Altitude]) = Altitude(x)
    def stagedClass = classOf[Altitude]
    def isPrimitive = false
  }
    case class Altitude(s: Exp[Altitude]) extends MetaAny[Altitude] {
    @api def monotonic: FltPt[_24,_8] = ???
    @api def amsl: FltPt[_24,_8] = ???
    @api def local: FltPt[_24,_8] = ???
    @api def relative: FltPt[_24,_8] = ???
    @api def terrain: FltPt[_24,_8] = ???
    @api def bottom_clearance: FltPt[_24,_8] = ???

    @api def ===(that: Altitude) = ??? 
    @api def =!=(that: Altitude) = ??? 
    @api def toText: Text = ??? 
  }
}

object Altitude{
}
