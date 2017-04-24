
package spatial.ros

import forge._
import org.virtualized._

trait WaypointSetCurrentApi extends WaypointSetCurrentExp {
  self: RosApi =>

}

trait WaypointSetCurrentExp {
  self: RosExp =>
  
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
    @api def wp_seq: FixPt[FALSE,_16,_0] = FixPt(stage(WaypointSetCurrent_wp_seq(s))(ctx))
    @api def response: WaypointSetCurrentRep = WaypointSetCurrentRep(stage(WaypointSetCurrentReply(s))(ctx))
    @api def ===(that: WaypointSetCurrent): Bool = ???
    @api def =!=(that: WaypointSetCurrent): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class WaypointSetCurrentRep(s: Exp[WaypointSetCurrentRep]) extends MetaAny[WaypointSetCurrentRep] {
    @api def success: Bool = Bool(stage(WaypointSetCurrentRep_reply_success(s))(ctx))
    @api def ===(that: WaypointSetCurrentRep): Bool = ???
    @api def =!=(that: WaypointSetCurrentRep): Bool = ???
    @api def toText: Text = textify(this)
  }

  
case class WaypointSetCurrent_wp_seq(srv: Exp[WaypointSetCurrent]) extends Op[FixPt[FALSE,_16,_0]] {
  def mirror(f: Tx) = stage(WaypointSetCurrent_wp_seq(f(srv)))(EmptyContext)
}

  
case class WaypointSetCurrentRep_reply_success(srv: Exp[WaypointSetCurrentRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(WaypointSetCurrentRep_reply_success(f(srv)))(EmptyContext)
}

  case class WaypointSetCurrentReply(srv: Exp[WaypointSetCurrent]) extends Op[WaypointSetCurrentRep]{
    def mirror(f: Tx) = stage(WaypointSetCurrentReply(f(srv)))(EmptyContext)
  }

  
  object WaypointSetCurrent {

  }

  object WaypointSetCurrentRep {

  }

}

