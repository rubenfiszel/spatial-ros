package spatial.ros

import argon.codegen.scalagen.ScalaCodegen
import forge._
import org.virtualized._

trait VibrationApi extends VibrationExp { self: RosApi =>

}

trait VibrationExp { self: RosExp =>

  implicit object VibrationType extends Meta[Vibration] {
    def wrapped(x: Exp[Vibration]) = Vibration(x)
    def stagedClass                = classOf[Vibration]
    def isPrimitive                = false
  }

  case class Vibration(s: Exp[Vibration]) extends MetaAny[Vibration] {

    @api def ===(that: Vibration) = ???
    @api def =!=(that: Vibration) = ???
    @api def toText: Text         = textify(this)
  }

  case class NewVibration() extends Op[Vibration] {
    def mirror(f: Tx) = stage(NewVibration())(EmptyContext)
  }

  object Vibration {

    @api def apply(): Vibration = Vibration(stage(NewVibration())(ctx))

  }

}

trait ScalaGenVibration extends ScalaCodegen {
  override def emitFileHeader() = {
//    emit(src"import DataImplicits._")
    super.emitFileHeader()
  }
}
