
package spatial.ros

import forge._
import org.virtualized._

trait QuaternionApi extends QuaternionExp {
  self: RosApi =>

}

trait QuaternionExp {
  self: RosExp =>
  
  
case class Quaternion_x(msg: Exp[Quaternion]) extends Op[FltPt[_53,_11]] {
  def mirror(f: Tx) = ???//Quaternion_x(f(msg))
}

  
case class Quaternion_y(msg: Exp[Quaternion]) extends Op[FltPt[_53,_11]] {
  def mirror(f: Tx) = ???//Quaternion_y(f(msg))
}

  
case class Quaternion_z(msg: Exp[Quaternion]) extends Op[FltPt[_53,_11]] {
  def mirror(f: Tx) = ???//Quaternion_z(f(msg))
}

  
case class Quaternion_w(msg: Exp[Quaternion]) extends Op[FltPt[_53,_11]] {
  def mirror(f: Tx) = ???//Quaternion_w(f(msg))
}


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
  
  object Quaternion {

  }

}

