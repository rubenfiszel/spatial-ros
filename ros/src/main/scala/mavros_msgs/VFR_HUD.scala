
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen
import spatial.ros.codegen.scalagen.RosScalaCodegen

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

  implicit object VFR_HUDMsg extends Msg[VFR_HUD]

  case class VFR_HUD(s: Exp[VFR_HUD]) extends MetaAny[VFR_HUD] {

    @api def ===(that: VFR_HUD) = ???
    @api def =!=(that: VFR_HUD) = ???
    @api def toText: Text = textify(this)
  }


  case class NewVFR_HUD() extends Op[VFR_HUD] {
    def mirror(f: Tx) = stage(NewVFR_HUD())(EmptyContext)
  }

  object VFR_HUD {

  @api def apply(): VFR_HUD = VFR_HUD(stage(NewVFR_HUD())(ctx))


  }

}

trait ScalaGenVFR_HUD extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {

    case NewVFR_HUD() =>
      emit(src"val $lhs = VFR_HUD()")
    case _ => super.emitNode(lhs, rhs)
  }

}


