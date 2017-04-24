
package spatial.ros

import forge._
import org.virtualized._

trait WaypointSetCurrentApi extends WaypointSetCurrentExp {
  self: RosApi =>

}

trait WaypointSetCurrentExp {
  self: RosExp =>
  
  
case class WaypointSetCurrent_wp_seq(srv: Exp[WaypointSetCurrent]) extends Op[FixPt[FALSE,_16,_0]] {
  def mirror(f: Tx) = ???//(WaypointSetCurrent_wp_seq(f(srv)): Exp[FixPt[FALSE,_16,_0]])
}

  
case class WaypointSetCurrentRep_wp_seq(srv: Exp[WaypointSetCurrentRep]) extends Op[FixPt[FALSE,_16,_0]] {
  def mirror(f: Tx) = ???//WaypointSetCurrentRep_wp_seq(f(srv))
}

  case class WaypointSetCurrentReply(srv: Exp[WaypointSetCurrent]) extends Op[WaypointSetCurrentRep]{
    def mirror(f: Tx) = ???//WaypointSetCurrentReply(f(srv))
  }

  implicit object WaypointSetCurrentType extends Meta[WaypointSetCurrent] {
    def wrapped(x: Exp[WaypointSetCurrent]) = WaypointSetCurrent(x)
    def stagedClass = classOf[WaypointSetCurrent]
    def isPrimitive = false
  }

  implicit object WaypointSetCurrentRepType extends Meta[WaypointSetCurrentRep] {
    def wrapped(x: Exp[WaypointSetCurrentRep]) = WaypointSetCurrentRep(x)
    def stagedClass = classOf[WaypointSetCurrentRep]
    def isPrimitive = false
  }

  case class WaypointSetCurrent(s: Exp[WaypointSetCurrent]) extends MetaAny[WaypointSetCurrent] {
    @api def wp_seq: FixPt[FALSE,_16,_0] = ???
    @api def response: WaypointSetCurrentRep = ???//WaypointSetCurrentRep(WaypointSetCurrentReply(s))
    @api def ===(that: WaypointSetCurrent): Bool = ???
    @api def =!=(that: WaypointSetCurrent): Bool = ???
    @api def toText: Text = ???
  }

  case class WaypointSetCurrentRep(s: Exp[WaypointSetCurrentRep]) extends MetaAny[WaypointSetCurrentRep] {
    @api def success: Bool = ???
    @api def ===(that: WaypointSetCurrentRep): Bool = ???
    @api def =!=(that: WaypointSetCurrentRep): Bool = ???
    @api def toText: Text = ???
  }
  
  object WaypointSetCurrent {

  }

  object WaypointSetCurrentRep {

  }

}

