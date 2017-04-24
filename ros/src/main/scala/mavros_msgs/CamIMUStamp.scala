package spatial.ros

import forge._
import org.virtualized._

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
    case class CamIMUStamp(s: Exp[CamIMUStamp]) extends MetaAny[CamIMUStamp] {

    @api def ===(that: CamIMUStamp) = ??? 
    @api def =!=(that: CamIMUStamp) = ??? 
    @api def toText: Text = ??? 
  }
}

object CamIMUStamp{
}
