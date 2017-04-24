
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
    @api def x: FltPt[_53,_11] = FltPt(stage(Quaternion_x(s))(ctx))
    @api def y: FltPt[_53,_11] = FltPt(stage(Quaternion_y(s))(ctx))
    @api def z: FltPt[_53,_11] = FltPt(stage(Quaternion_z(s))(ctx))
    @api def w: FltPt[_53,_11] = FltPt(stage(Quaternion_w(s))(ctx))
    @api def ===(that: Quaternion) = ???
    @api def =!=(that: Quaternion) = ???
    @api def toText: Text = textify(this)
  }

  
case class Quaternion_x(msg: Exp[Quaternion]) extends Op[FltPt[_53,_11]] {
  def mirror(f: Tx) = stage(Quaternion_x(f(msg)))(EmptyContext)
}

  
case class Quaternion_y(msg: Exp[Quaternion]) extends Op[FltPt[_53,_11]] {
  def mirror(f: Tx) = stage(Quaternion_y(f(msg)))(EmptyContext)
}

  
case class Quaternion_z(msg: Exp[Quaternion]) extends Op[FltPt[_53,_11]] {
  def mirror(f: Tx) = stage(Quaternion_z(f(msg)))(EmptyContext)
}

  
case class Quaternion_w(msg: Exp[Quaternion]) extends Op[FltPt[_53,_11]] {
  def mirror(f: Tx) = stage(Quaternion_w(f(msg)))(EmptyContext)
}

  
  object Quaternion {

  }

}

