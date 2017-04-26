
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait ManualControlApi extends ManualControlExp {
  self: RosApi =>

}

trait ManualControlExp {
  self: RosExp =>

  implicit object ManualControlType extends Meta[ManualControl] {
    def wrapped(x: Exp[ManualControl]) = ManualControl(x)
    def stagedClass = classOf[ManualControl]
    def isPrimitive = false
  }

  implicit object ManualControlMsg extends Msg[ManualControl]

  case class ManualControl(s: Exp[ManualControl]) extends MetaAny[ManualControl] {
    @api def x: FltPt[_24,_8] = FltPt(stage(ManualControl_x(s))(ctx))
    @api def y: FltPt[_24,_8] = FltPt(stage(ManualControl_y(s))(ctx))
    @api def z: FltPt[_24,_8] = FltPt(stage(ManualControl_z(s))(ctx))
    @api def r: FltPt[_24,_8] = FltPt(stage(ManualControl_r(s))(ctx))
    @api def buttons: FixPt[FALSE,_16,_0] = FixPt(stage(ManualControl_buttons(s))(ctx))
    @api def ===(that: ManualControl) = ???
    @api def =!=(that: ManualControl) = ???
    @api def toText: Text = textify(this)
  }

  
case class ManualControl_x(msg: Exp[ManualControl]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(ManualControl_x(f(msg)))(EmptyContext)
}

  
case class ManualControl_y(msg: Exp[ManualControl]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(ManualControl_y(f(msg)))(EmptyContext)
}

  
case class ManualControl_z(msg: Exp[ManualControl]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(ManualControl_z(f(msg)))(EmptyContext)
}

  
case class ManualControl_r(msg: Exp[ManualControl]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(ManualControl_r(f(msg)))(EmptyContext)
}

  
case class ManualControl_buttons(msg: Exp[ManualControl]) extends Op[FixPt[FALSE,_16,_0]] {
  def mirror(f: Tx) = stage(ManualControl_buttons(f(msg)))(EmptyContext)
}

  case class NewManualControl(x: Exp[FltPt[_24,_8]], y: Exp[FltPt[_24,_8]], z: Exp[FltPt[_24,_8]], r: Exp[FltPt[_24,_8]], buttons: Exp[FixPt[FALSE,_16,_0]]) extends Op[ManualControl] {
    def mirror(f: Tx) = stage(NewManualControl(f(x), f(y), f(z), f(r), f(buttons)))(EmptyContext)
  }

  object ManualControl {

  @api def apply(x: FltPt[_24,_8], y: FltPt[_24,_8], z: FltPt[_24,_8], r: FltPt[_24,_8], buttons: FixPt[FALSE,_16,_0]): ManualControl = ManualControl(stage(NewManualControl(x.s, y.s, z.s, r.s, buttons.s))(ctx))


  }

}

trait ScalaGenManualControl extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case ManualControl_x(msg) => emit(src"val $lhs = $msg.x")
    case ManualControl_y(msg) => emit(src"val $lhs = $msg.y")
    case ManualControl_z(msg) => emit(src"val $lhs = $msg.z")
    case ManualControl_r(msg) => emit(src"val $lhs = $msg.r")
    case ManualControl_buttons(msg) => emit(src"val $lhs = $msg.buttons")
    case NewManualControl(x, y, z, r, buttons) =>
      emit(src"val $lhs = ManualControl($x, $y, $z, $r, $buttons)")
    case _ => super.emitNode(lhs, rhs)
  }

}


