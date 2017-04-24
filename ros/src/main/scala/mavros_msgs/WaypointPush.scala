
package spatial.ros

import forge._
import org.virtualized._

trait WaypointPushApi extends WaypointPushExp {
  self: RosApi =>

}

trait WaypointPushExp {
  self: RosExp =>
  
  implicit object WaypointPushType extends Meta[WaypointPush] {
    def wrapped(x: Exp[WaypointPush]) = WaypointPush(x)
    def stagedClass = classOf[WaypointPush]
    def isPrimitive = false
  }

  implicit object WaypointPushRepType extends Meta[WaypointPushRep] {
    def wrapped(x: Exp[WaypointPushRep]) = WaypointPushRep(x)
    def stagedClass = classOf[WaypointPushRep]
    def isPrimitive = false
  }

  case class WaypointPush(s: Exp[WaypointPush]) extends MetaAny[WaypointPush] {
    @api def waypoints: MetaArray[Waypoint] = ???
    @api def response: WaypointPushRep = ???//WaypointPushRep(WaypointPushReply(s))
    @api def ===(that: WaypointPush): Bool = ???
    @api def =!=(that: WaypointPush): Bool = ???
    @api def toText: Text = ???
  }

  case class WaypointPushRep(s: Exp[WaypointPushRep]) extends MetaAny[WaypointPushRep] {
    @api def success: Bool = ???
    @api def wp_transfered: FixPt[FALSE,_32,_0] = ???
    @api def ===(that: WaypointPushRep): Bool = ???
    @api def =!=(that: WaypointPushRep): Bool = ???
    @api def toText: Text = ???
  }

  
case class WaypointPush_waypoints(srv: Exp[WaypointPush]) extends Op[MetaArray[Waypoint]] {
  def mirror(f: Tx) = stage(WaypointPush_waypoints(f(srv)))(EmptyContext)
}

  
case class WaypointPushRep_waypoints(srv: Exp[WaypointPushRep]) extends Op[MetaArray[Waypoint]] {
  def mirror(f: Tx) = stage(WaypointPushRep_waypoints(f(srv)))(EmptyContext)
}

  case class WaypointPushReply(srv: Exp[WaypointPush]) extends Op[WaypointPushRep]{
    def mirror(f: Tx) = stage(WaypointPushReply(f(srv)))(EmptyContext)
  }

  
  object WaypointPush {

  }

  object WaypointPushRep {

  }

}

