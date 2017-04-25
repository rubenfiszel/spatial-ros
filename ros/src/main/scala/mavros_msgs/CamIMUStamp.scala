package spatial.ros

import argon.codegen.scalagen.ScalaCodegen
import forge._
import org.virtualized._

trait CamIMUStampApi extends CamIMUStampExp { self: RosApi =>

}

trait CamIMUStampExp { self: RosExp =>

  implicit object CamIMUStampType extends Meta[CamIMUStamp] {
    def wrapped(x: Exp[CamIMUStamp]) = CamIMUStamp(x)
    def stagedClass                  = classOf[CamIMUStamp]
    def isPrimitive                  = false
  }

  case class CamIMUStamp(s: Exp[CamIMUStamp]) extends MetaAny[CamIMUStamp] {

    @api def ===(that: CamIMUStamp) = ???
    @api def =!=(that: CamIMUStamp) = ???
    @api def toText: Text           = textify(this)
  }

  case class NewCamIMUStamp() extends Op[CamIMUStamp] {
    def mirror(f: Tx) = stage(NewCamIMUStamp())(EmptyContext)
  }

  object CamIMUStamp {

    @api def apply(): CamIMUStamp = CamIMUStamp(stage(NewCamIMUStamp())(ctx))

  }

}

trait ScalaGenCamIMUStamp extends ScalaCodegen {
  override def emitFileHeader() = {
//    emit(src"import DataImplicits._")
    super.emitFileHeader()
  }
}
