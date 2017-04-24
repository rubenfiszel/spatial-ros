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
}

object Mavlink{
}
