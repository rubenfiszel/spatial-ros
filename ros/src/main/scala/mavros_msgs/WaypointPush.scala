
package spatial.ros

import forge._
import org.virtualized._
import spatial.ros.codegen.scalagen.RosScalaCodegen

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

  implicit object WaypointPushSrv extends Srv[WaypointPush] {
    type Response = WaypointPushRep
    def response(srv: WaypointPush) = srv.response
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
    @api def success: Bool = Bool(stage(WaypointPushRep_success(s))(ctx))
    @api def wp_transfered: FixPt[FALSE,_32,_0] = FixPt(stage(WaypointPushRep_wp_transfered(s))(ctx))
    @api def ===(that: WaypointPushRep): Bool = ???
    @api def =!=(that: WaypointPushRep): Bool = ???
    @api def toText: Text = textify(this)
  }

  
case class WaypointPush_waypoints(msg: Exp[WaypointPush]) extends Op[MetaArray[Waypoint]] {
  def mirror(f: Tx) = stage(WaypointPush_waypoints(f(msg)))(EmptyContext)
}

  
case class WaypointPushRep_success(srv: Exp[WaypointPushRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(WaypointPushRep_success(f(srv)))(EmptyContext)
}

  
case class WaypointPushRep_wp_transfered(srv: Exp[WaypointPushRep]) extends Op[FixPt[FALSE,_32,_0]] {
  def mirror(f: Tx) = stage(WaypointPushRep_wp_transfered(f(srv)))(EmptyContext)
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

trait ScalaGenWaypointPush extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case WaypointPush_waypoints(msg) => emit(src"val $lhs = $msg.waypoints")
    case WaypointPushRep_success(msg) => emit(src"val $lhs = $msg.success")
    case WaypointPushRep_wp_transfered(msg) => emit(src"val $lhs = $msg.wp_transfered")
    case NewWaypointPush(waypoints) =>
      emit(src"val $lhs = WaypointPush($waypoints)")
    case WaypointPushReply(srv) =>
      emit(src"val $lhs = $srv.response")
    case _ => super.emitNode(lhs, rhs)
  }

}

