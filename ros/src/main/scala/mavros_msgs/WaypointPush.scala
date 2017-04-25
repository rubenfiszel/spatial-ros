
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen

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
    @api def waypoints: MetaArray[Waypoint] = MetaArray(stage(WaypointPush_waypoints(s))(ctx))
    @api def response: WaypointPushRep = WaypointPushRep(stage(WaypointPushReply(s))(ctx))
    @api def ===(that: WaypointPush): Bool = ???
    @api def =!=(that: WaypointPush): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class WaypointPushRep(s: Exp[WaypointPushRep]) extends MetaAny[WaypointPushRep] {
    @api def success: Bool = Bool(stage(WaypointPushRep_reply_success(s))(ctx))
    @api def wp_transfered: FixPt[FALSE,_32,_0] = FixPt(stage(WaypointPushRep_reply_wp_transfered(s))(ctx))
    @api def ===(that: WaypointPushRep): Bool = ???
    @api def =!=(that: WaypointPushRep): Bool = ???
    @api def toText: Text = textify(this)
  }

  
case class WaypointPush_waypoints(srv: Exp[WaypointPush]) extends Op[MetaArray[Waypoint]] {
  def mirror(f: Tx) = stage(WaypointPush_waypoints(f(srv)))(EmptyContext)
}

  
case class WaypointPushRep_reply_success(srv: Exp[WaypointPushRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(WaypointPushRep_reply_success(f(srv)))(EmptyContext)
}

  
case class WaypointPushRep_reply_wp_transfered(srv: Exp[WaypointPushRep]) extends Op[FixPt[FALSE,_32,_0]] {
  def mirror(f: Tx) = stage(WaypointPushRep_reply_wp_transfered(f(srv)))(EmptyContext)
}

  case class WaypointPushReply(srv: Exp[WaypointPush]) extends Op[WaypointPushRep]{
    def mirror(f: Tx) = stage(WaypointPushReply(f(srv)))(EmptyContext)
  }
  case class NewWaypointPush(waypoints: Exp[MetaArray[Waypoint]]) extends Op[WaypointPush] {
    def mirror(f: Tx) = stage(NewWaypointPush(f(waypoints)))(EmptyContext)
  }

  
  object WaypointPush {

  @api def apply(waypoints: MetaArray[Waypoint]): WaypointPush = WaypointPush(stage(NewWaypointPush(waypoints.s))(ctx))
  }

  object WaypointPushRep {

  }

}

trait ScalaGenWaypointPush extends ScalaCodegen{
}

