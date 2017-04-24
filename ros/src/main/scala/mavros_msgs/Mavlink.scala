
package spatial.ros

import forge._
import org.virtualized._

trait MavlinkApi extends MavlinkExp {
  self: RosApi =>

}

trait MavlinkExp {
  self: RosExp =>

  implicit object MavlinkType extends Meta[Mavlink] {
    def wrapped(x: Exp[Mavlink]) = Mavlink(x)
    def stagedClass = classOf[Mavlink]
    def isPrimitive = false
  }

  case class Mavlink(s: Exp[Mavlink]) extends MetaAny[Mavlink] {
    @api def is_valid: Bool = ???
    @api def len: FixPt[FALSE,_8,_0] = ???
    @api def seq: FixPt[FALSE,_8,_0] = ???
    @api def sysid: FixPt[FALSE,_8,_0] = ???
    @api def compid: FixPt[FALSE,_8,_0] = ???
    @api def msgid: FixPt[FALSE,_8,_0] = ???
    @api def checksum: FixPt[FALSE,_16,_0] = ???
    @api def payload64: MetaArray[FixPt[FALSE,_64,_0]] = ???
    @api def ===(that: Mavlink) = ???
    @api def =!=(that: Mavlink) = ???
    @api def toText: Text = ???
  }

  
case class Mavlink_is_valid(msg: Exp[Mavlink]) extends Op[Bool] {
  def mirror(f: Tx) = stage(Mavlink_is_valid(f(msg)))(EmptyContext)
}

  
case class Mavlink_len(msg: Exp[Mavlink]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(Mavlink_len(f(msg)))(EmptyContext)
}

  
case class Mavlink_seq(msg: Exp[Mavlink]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(Mavlink_seq(f(msg)))(EmptyContext)
}

  
case class Mavlink_sysid(msg: Exp[Mavlink]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(Mavlink_sysid(f(msg)))(EmptyContext)
}

  
case class Mavlink_compid(msg: Exp[Mavlink]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(Mavlink_compid(f(msg)))(EmptyContext)
}

  
case class Mavlink_msgid(msg: Exp[Mavlink]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(Mavlink_msgid(f(msg)))(EmptyContext)
}

  
case class Mavlink_checksum(msg: Exp[Mavlink]) extends Op[FixPt[FALSE,_16,_0]] {
  def mirror(f: Tx) = stage(Mavlink_checksum(f(msg)))(EmptyContext)
}

  
case class Mavlink_payload64(msg: Exp[Mavlink]) extends Op[MetaArray[FixPt[FALSE,_64,_0]]] {
  def mirror(f: Tx) = stage(Mavlink_payload64(f(msg)))(EmptyContext)
}

  
  object Mavlink {

  }

}

