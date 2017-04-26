
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen
import spatial.ros.codegen.scalagen.RosScalaCodegen

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

  implicit object VibrationMsg extends Msg[Vibration]

  case class Vibration(s: Exp[Vibration]) extends MetaAny[Vibration] {

    @api def ===(that: Vibration) = ???
    @api def =!=(that: Vibration) = ???
    @api def toText: Text = textify(this)
  }


  case class NewVibration() extends Op[Vibration] {
    def mirror(f: Tx) = stage(NewVibration())(EmptyContext)
  }

  object Vibration {

  @api def apply(): Vibration = Vibration(stage(NewVibration())(ctx))


  }

}

trait ScalaGenVibration extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {

    case NewVibration() =>
      emit(src"val $lhs = Vibration()")
    case _ => super.emitNode(lhs, rhs)
  }

}


