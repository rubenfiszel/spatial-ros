
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

  
case class Altitude_monotonic(msg: Exp[Altitude]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(Altitude_monotonic(f(msg)))(EmptyContext)
}

  
case class Altitude_amsl(msg: Exp[Altitude]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(Altitude_amsl(f(msg)))(EmptyContext)
}

  
case class Altitude_local(msg: Exp[Altitude]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(Altitude_local(f(msg)))(EmptyContext)
}

  
case class Altitude_relative(msg: Exp[Altitude]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(Altitude_relative(f(msg)))(EmptyContext)
}

  
case class Altitude_terrain(msg: Exp[Altitude]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(Altitude_terrain(f(msg)))(EmptyContext)
}

  
case class Altitude_bottom_clearance(msg: Exp[Altitude]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(Altitude_bottom_clearance(f(msg)))(EmptyContext)
}

  
  object Altitude {

  }

}

