package spatial.ros

import forge._
import org.virtualized._

trait Vec3Api extends Vec3Exp {
    self: RosApi =>

}

trait Vec3Exp {
    self: RosExp =>

      implicit object Vec3Type extends Meta[Vec3] {
    def wrapped(x: Exp[Vec3]) = Vec3(x)
    def stagedClass = classOf[Vec3]
    def isPrimitive = false
  }
    case class Vec3(s: Exp[Vec3]) extends MetaAny[Vec3] {
    @api def x: FltPt[_53,_11] = ???
    @api def y: FltPt[_53,_11] = ???
    @api def z: FltPt[_53,_11] = ???

    @api def ===(that: Vec3) = ??? 
    @api def =!=(that: Vec3) = ??? 
    @api def toText: Text = ??? 
  }
}

object Vec3{
}
