package spatial.ros

import argon.codegen.scalagen.ScalaCodegen
import forge._
import org.virtualized._

trait VFR_HUDApi extends VFR_HUDExp { self: RosApi =>

}

trait VFR_HUDExp { self: RosExp =>

  implicit object VFR_HUDType extends Meta[VFR_HUD] {
    def wrapped(x: Exp[VFR_HUD]) = VFR_HUD(x)
    def stagedClass              = classOf[VFR_HUD]
    def isPrimitive              = false
  }

  case class VFR_HUD(s: Exp[VFR_HUD]) extends MetaAny[VFR_HUD] {

    @api def ===(that: VFR_HUD) = ???
    @api def =!=(that: VFR_HUD) = ???
    @api def toText: Text       = textify(this)
  }

  case class NewVFR_HUD() extends Op[VFR_HUD] {
    def mirror(f: Tx) = stage(NewVFR_HUD())(EmptyContext)
  }

  object VFR_HUD {

    @api def apply(): VFR_HUD = VFR_HUD(stage(NewVFR_HUD())(ctx))

  }

}

trait ScalaGenVFR_HUD extends ScalaCodegen {
  override def emitFileHeader() = {
//    emit(src"import DataImplicits._")
    super.emitFileHeader()
  }
}
