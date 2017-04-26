
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen
import spatial.ros.codegen.scalagen.RosScalaCodegen

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

  implicit object AltitudeMsg extends Msg[Altitude]

  case class Altitude(s: Exp[Altitude]) extends MetaAny[Altitude] {
    @api def monotonic: FltPt[_24,_8] = FltPt(stage(Altitude_monotonic(s))(ctx))
    @api def amsl: FltPt[_24,_8] = FltPt(stage(Altitude_amsl(s))(ctx))
    @api def local: FltPt[_24,_8] = FltPt(stage(Altitude_local(s))(ctx))
    @api def relative: FltPt[_24,_8] = FltPt(stage(Altitude_relative(s))(ctx))
    @api def terrain: FltPt[_24,_8] = FltPt(stage(Altitude_terrain(s))(ctx))
    @api def bottom_clearance: FltPt[_24,_8] = FltPt(stage(Altitude_bottom_clearance(s))(ctx))
    @api def ===(that: Altitude) = ???
    @api def =!=(that: Altitude) = ???
    @api def toText: Text = textify(this)
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

  case class NewAltitude(monotonic: Exp[FltPt[_24,_8]], amsl: Exp[FltPt[_24,_8]], local: Exp[FltPt[_24,_8]], relative: Exp[FltPt[_24,_8]], terrain: Exp[FltPt[_24,_8]], bottom_clearance: Exp[FltPt[_24,_8]]) extends Op[Altitude] {
    def mirror(f: Tx) = stage(NewAltitude(f(monotonic), f(amsl), f(local), f(relative), f(terrain), f(bottom_clearance)))(EmptyContext)
  }

  object Altitude {

  @api def apply(monotonic: FltPt[_24,_8], amsl: FltPt[_24,_8], local: FltPt[_24,_8], relative: FltPt[_24,_8], terrain: FltPt[_24,_8], bottom_clearance: FltPt[_24,_8]): Altitude = Altitude(stage(NewAltitude(monotonic.s, amsl.s, local.s, relative.s, terrain.s, bottom_clearance.s))(ctx))


  }

}

trait ScalaGenAltitude extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case Altitude_monotonic(msg) => emit(src"val $lhs = $msg.monotonic")
    case Altitude_amsl(msg) => emit(src"val $lhs = $msg.amsl")
    case Altitude_local(msg) => emit(src"val $lhs = $msg.local")
    case Altitude_relative(msg) => emit(src"val $lhs = $msg.relative")
    case Altitude_terrain(msg) => emit(src"val $lhs = $msg.terrain")
    case Altitude_bottom_clearance(msg) => emit(src"val $lhs = $msg.bottom_clearance")
    case NewAltitude(monotonic, amsl, local, relative, terrain, bottom_clearance) =>
      emit(src"val $lhs = Altitude($monotonic, $amsl, $local, $relative, $terrain, $bottom_clearance)")
    case _ => super.emitNode(lhs, rhs)
  }

}


