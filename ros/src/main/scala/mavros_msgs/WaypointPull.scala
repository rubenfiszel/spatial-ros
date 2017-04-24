
package spatial.ros

import forge._
import org.virtualized._

trait WaypointPullApi extends WaypointPullExp {
  self: RosApi =>

}

trait WaypointPullExp {
  self: RosExp =>
  
  implicit object WaypointPullType extends Meta[WaypointPull] {
    def wrapped(x: Exp[WaypointPull]) = WaypointPull(x)
    def stagedClass = classOf[WaypointPull]
    def isPrimitive = false
  }

  implicit object WaypointPullRepType extends Meta[WaypointPullRep] {
    def wrapped(x: Exp[WaypointPullRep]) = WaypointPullRep(x)
    def stagedClass = classOf[WaypointPullRep]
    def isPrimitive = false
  }

  case class WaypointPull(s: Exp[WaypointPull]) extends MetaAny[WaypointPull] {

    @api def response: WaypointPullRep = ???//WaypointPullRep(WaypointPullReply(s))
    @api def ===(that: WaypointPull): Bool = ???
    @api def =!=(that: WaypointPull): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class WaypointPullRep(s: Exp[WaypointPullRep]) extends MetaAny[WaypointPullRep] {
    @api def success: Bool = Bool(stage(WaypointPullRep_reply_success(s))(ctx))
    @api def wp_received: FixPt[FALSE,_32,_0] = FixPt(stage(WaypointPullRep_reply_wp_received(s))(ctx))
    @api def ===(that: WaypointPullRep): Bool = ???
    @api def =!=(that: WaypointPullRep): Bool = ???
    @api def toText: Text = textify(this)
  }


  
case class WaypointPullRep_reply_success(srv: Exp[WaypointPullRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(WaypointPullRep_reply_success(f(srv)))(EmptyContext)
}

  
case class WaypointPullRep_reply_wp_received(srv: Exp[WaypointPullRep]) extends Op[FixPt[FALSE,_32,_0]] {
  def mirror(f: Tx) = stage(WaypointPullRep_reply_wp_received(f(srv)))(EmptyContext)
}

  case class WaypointPullReply(srv: Exp[WaypointPull]) extends Op[WaypointPullRep]{
    def mirror(f: Tx) = stage(WaypointPullReply(f(srv)))(EmptyContext)
  }

  
  object WaypointPull {

  }

  object WaypointPullRep {

  }

}

