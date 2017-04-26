
package spatial.ros

import forge._
import org.virtualized._
import spatial.ros.codegen.scalagen.RosScalaCodegen

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

  implicit object WaypointPullSrv extends Srv[WaypointPull] {
    type Response = WaypointPullRep
    def response(srv: WaypointPull) = srv.response
  }

  implicit object WaypointPullRepType extends Meta[WaypointPullRep] {
    def wrapped(x: Exp[WaypointPullRep]) = WaypointPullRep(x)
    def stagedClass = classOf[WaypointPullRep]
    def isPrimitive = false
  }

  case class WaypointPull(s: Exp[WaypointPull]) extends MetaAny[WaypointPull] {

    @api def response: WaypointPullRep = WaypointPullRep(stage(WaypointPullReply(s))(ctx))
    @api def ===(that: WaypointPull): Bool = ???
    @api def =!=(that: WaypointPull): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class WaypointPullRep(s: Exp[WaypointPullRep]) extends MetaAny[WaypointPullRep] {
    @api def success: Bool = Bool(stage(WaypointPullRep_success(s))(ctx))
    @api def wp_received: FixPt[FALSE,_32,_0] = FixPt(stage(WaypointPullRep_wp_received(s))(ctx))
    @api def ===(that: WaypointPullRep): Bool = ???
    @api def =!=(that: WaypointPullRep): Bool = ???
    @api def toText: Text = textify(this)
  }


  
case class WaypointPullRep_success(srv: Exp[WaypointPullRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(WaypointPullRep_success(f(srv)))(EmptyContext)
}

  
case class WaypointPullRep_wp_received(srv: Exp[WaypointPullRep]) extends Op[FixPt[FALSE,_32,_0]] {
  def mirror(f: Tx) = stage(WaypointPullRep_wp_received(f(srv)))(EmptyContext)
}

  case class WaypointPullReply(srv: Exp[WaypointPull]) extends Op[WaypointPullRep]{
    def mirror(f: Tx) = stage(WaypointPullReply(f(srv)))(EmptyContext)
  }
  case class NewWaypointPull() extends Op[WaypointPull] {
    def mirror(f: Tx) = stage(NewWaypointPull())(EmptyContext)
  }

  
  object WaypointPull {

  @api def apply(): WaypointPull = WaypointPull(stage(NewWaypointPull())(ctx))
  }

  object WaypointPullRep {

  }

}

trait ScalaGenWaypointPull extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {

    case WaypointPullRep_success(msg) => emit(src"val $lhs = $msg.success")
    case WaypointPullRep_wp_received(msg) => emit(src"val $lhs = $msg.wp_received")
    case NewWaypointPull() =>
      emit(src"val $lhs = WaypointPull()")
    case WaypointPullReply(srv) =>
      emit(src"val $lhs = $srv.response")
    case _ => super.emitNode(lhs, rhs)
  }

}

