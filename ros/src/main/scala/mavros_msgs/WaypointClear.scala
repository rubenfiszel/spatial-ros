
package spatial.ros

import forge._
import org.virtualized._
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait WaypointClearApi extends WaypointClearExp {
  self: RosApi =>

}

trait WaypointClearExp {
  self: RosExp =>
  
  implicit object WaypointClearType extends Meta[WaypointClear] {
    def wrapped(x: Exp[WaypointClear]) = WaypointClear(x)
    def stagedClass = classOf[WaypointClear]
    def isPrimitive = false
  }

  implicit object WaypointClearSrv extends Srv[WaypointClear] {
    type Response = WaypointClearRep
    def response(srv: WaypointClear) = srv.response
  }

  implicit object WaypointClearRepType extends Meta[WaypointClearRep] {
    def wrapped(x: Exp[WaypointClearRep]) = WaypointClearRep(x)
    def stagedClass = classOf[WaypointClearRep]
    def isPrimitive = false
  }

  case class WaypointClear(s: Exp[WaypointClear]) extends MetaAny[WaypointClear] {

    @api def response: WaypointClearRep = WaypointClearRep(stage(WaypointClearReply(s))(ctx))
    @api def ===(that: WaypointClear): Bool = ???
    @api def =!=(that: WaypointClear): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class WaypointClearRep(s: Exp[WaypointClearRep]) extends MetaAny[WaypointClearRep] {
    @api def success: Bool = Bool(stage(WaypointClearRep_success(s))(ctx))
    @api def ===(that: WaypointClearRep): Bool = ???
    @api def =!=(that: WaypointClearRep): Bool = ???
    @api def toText: Text = textify(this)
  }


  
case class WaypointClearRep_success(srv: Exp[WaypointClearRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(WaypointClearRep_success(f(srv)))(EmptyContext)
}

  case class WaypointClearReply(srv: Exp[WaypointClear]) extends Op[WaypointClearRep]{
    def mirror(f: Tx) = stage(WaypointClearReply(f(srv)))(EmptyContext)
  }
  case class NewWaypointClear() extends Op[WaypointClear] {
    def mirror(f: Tx) = stage(NewWaypointClear())(EmptyContext)
  }

  
  object WaypointClear {

  @api def apply(): WaypointClear = WaypointClear(stage(NewWaypointClear())(ctx))
  }

  object WaypointClearRep {

  }

}

trait ScalaGenWaypointClear extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {

    case WaypointClearRep_success(msg) => emit(src"val $lhs = $msg.success")
    case NewWaypointClear() =>
      emit(src"val $lhs = WaypointClear()")
    case WaypointClearReply(srv) =>
      emit(src"val $lhs = $srv.response")
    case _ => super.emitNode(lhs, rhs)
  }

}

