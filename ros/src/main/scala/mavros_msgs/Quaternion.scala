package spatial.ros

import forge._
import org.virtualized._

trait QuaternionApi extends QuaternionExp {
    self: RosApi =>

}

trait QuaternionExp {
    self: RosExp =>

      implicit object QuaternionType extends Meta[Quaternion] {
    def wrapped(x: Exp[Quaternion]) = Quaternion(x)
    def stagedClass = classOf[Quaternion]
    def isPrimitive = false
  }
    case class Quaternion(s: Exp[Quaternion]) extends MetaAny[Quaternion] {
    @api def x: FltPt[_53,_11] = ???
    @api def y: FltPt[_53,_11] = ???
    @api def z: FltPt[_53,_11] = ???
    @api def w: FltPt[_53,_11] = ???

    @api def ===(that: Quaternion) = ??? 
    @api def =!=(that: Quaternion) = ??? 
    @api def toText: Text = ??? 
  }
}

object Quaternion{
}
