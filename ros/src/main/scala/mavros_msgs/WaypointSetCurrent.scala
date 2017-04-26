
package spatial.ros

import forge._
import org.virtualized._
import spatial.ros.codegen.scalagen.RosScalaCodegen

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

  implicit object WaypointSetCurrentSrv extends Srv[WaypointSetCurrent] {
    type Response = WaypointSetCurrentRep
    def response(srv: WaypointSetCurrent) = srv.response
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
    @api def success: Bool = Bool(stage(WaypointSetCurrentRep_success(s))(ctx))
    @api def ===(that: WaypointSetCurrentRep): Bool = ???
    @api def =!=(that: WaypointSetCurrentRep): Bool = ???
    @api def toText: Text = textify(this)
  }

  
case class WaypointSetCurrent_wp_seq(msg: Exp[WaypointSetCurrent]) extends Op[FixPt[FALSE,_16,_0]] {
  def mirror(f: Tx) = stage(WaypointSetCurrent_wp_seq(f(msg)))(EmptyContext)
}

  
case class WaypointSetCurrentRep_success(srv: Exp[WaypointSetCurrentRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(WaypointSetCurrentRep_success(f(srv)))(EmptyContext)
}

  case class WaypointSetCurrentReply(srv: Exp[WaypointSetCurrent]) extends Op[WaypointSetCurrentRep]{
    def mirror(f: Tx) = stage(WaypointSetCurrentReply(f(srv)))(EmptyContext)
  }
  case class NewWaypointSetCurrent(wp_seq: Exp[FixPt[FALSE,_16,_0]]) extends Op[WaypointSetCurrent] {
    def mirror(f: Tx) = stage(NewWaypointSetCurrent(f(wp_seq)))(EmptyContext)
  }

  
  object WaypointSetCurrent {

  @api def apply(wp_seq: FixPt[FALSE,_16,_0]): WaypointSetCurrent = WaypointSetCurrent(stage(NewWaypointSetCurrent(wp_seq.s))(ctx))
  }

  object WaypointSetCurrentRep {

  }

}

trait ScalaGenWaypointSetCurrent extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case WaypointSetCurrent_wp_seq(msg) => emit(src"val $lhs = $msg.wp_seq")
    case WaypointSetCurrentRep_success(msg) => emit(src"val $lhs = $msg.success")
    case NewWaypointSetCurrent(wp_seq) =>
      emit(src"val $lhs = WaypointSetCurrent($wp_seq)")
    case WaypointSetCurrentReply(srv) =>
      emit(src"val $lhs = $srv.response")
    case _ => super.emitNode(lhs, rhs)
  }

}

