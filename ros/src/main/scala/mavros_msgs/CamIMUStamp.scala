
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait CamIMUStampApi extends CamIMUStampExp {
  self: RosApi =>

}

trait CamIMUStampExp {
  self: RosExp =>

  implicit object CamIMUStampType extends Meta[CamIMUStamp] {
    def wrapped(x: Exp[CamIMUStamp]) = CamIMUStamp(x)
    def stagedClass = classOf[CamIMUStamp]
    def isPrimitive = false
  }

  implicit object CamIMUStampMsg extends Msg[CamIMUStamp]

  case class CamIMUStamp(s: Exp[CamIMUStamp]) extends MetaAny[CamIMUStamp] {

    @api def ===(that: CamIMUStamp) = ???
    @api def =!=(that: CamIMUStamp) = ???
    @api def toText: Text = textify(this)
  }


  case class NewCamIMUStamp() extends Op[CamIMUStamp] {
    def mirror(f: Tx) = stage(NewCamIMUStamp())(EmptyContext)
  }

  object CamIMUStamp {

  @api def apply(): CamIMUStamp = CamIMUStamp(stage(NewCamIMUStamp())(ctx))


  }

}

trait ScalaGenCamIMUStamp extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {

    case NewCamIMUStamp() =>
      emit(src"val $lhs = CamIMUStamp()")
    case _ => super.emitNode(lhs, rhs)
  }

}


