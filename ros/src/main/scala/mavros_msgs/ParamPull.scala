
package spatial.ros

import forge._
import org.virtualized._
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait ParamPullApi extends ParamPullExp {
  self: RosApi =>

}

trait ParamPullExp {
  self: RosExp =>
  
  implicit object ParamPullType extends Meta[ParamPull] {
    def wrapped(x: Exp[ParamPull]) = ParamPull(x)
    def stagedClass = classOf[ParamPull]
    def isPrimitive = false
  }

  implicit object ParamPullSrv extends Srv[ParamPull] {
    type Response = ParamPullRep
    def response(srv: ParamPull) = srv.response
  }

  implicit object ParamPullRepType extends Meta[ParamPullRep] {
    def wrapped(x: Exp[ParamPullRep]) = ParamPullRep(x)
    def stagedClass = classOf[ParamPullRep]
    def isPrimitive = false
  }

  case class ParamPull(s: Exp[ParamPull]) extends MetaAny[ParamPull] {
    @api def force_pull: Bool = Bool(stage(ParamPull_force_pull(s))(ctx))
    @api def response: ParamPullRep = ParamPullRep(stage(ParamPullReply(s))(ctx))
    @api def ===(that: ParamPull): Bool = ???
    @api def =!=(that: ParamPull): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class ParamPullRep(s: Exp[ParamPullRep]) extends MetaAny[ParamPullRep] {
    @api def success: Bool = Bool(stage(ParamPullRep_success(s))(ctx))
    @api def param_received: FixPt[FALSE,_32,_0] = FixPt(stage(ParamPullRep_param_received(s))(ctx))
    @api def ===(that: ParamPullRep): Bool = ???
    @api def =!=(that: ParamPullRep): Bool = ???
    @api def toText: Text = textify(this)
  }

  
case class ParamPull_force_pull(msg: Exp[ParamPull]) extends Op[Bool] {
  def mirror(f: Tx) = stage(ParamPull_force_pull(f(msg)))(EmptyContext)
}

  
case class ParamPullRep_success(srv: Exp[ParamPullRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(ParamPullRep_success(f(srv)))(EmptyContext)
}

  
case class ParamPullRep_param_received(srv: Exp[ParamPullRep]) extends Op[FixPt[FALSE,_32,_0]] {
  def mirror(f: Tx) = stage(ParamPullRep_param_received(f(srv)))(EmptyContext)
}

  case class ParamPullReply(srv: Exp[ParamPull]) extends Op[ParamPullRep]{
    def mirror(f: Tx) = stage(ParamPullReply(f(srv)))(EmptyContext)
  }
  case class NewParamPull(force_pull: Exp[Bool]) extends Op[ParamPull] {
    def mirror(f: Tx) = stage(NewParamPull(f(force_pull)))(EmptyContext)
  }

  
  object ParamPull {

  @api def apply(force_pull: Bool): ParamPull = ParamPull(stage(NewParamPull(force_pull.s))(ctx))
  }

  object ParamPullRep {

  }

}

trait ScalaGenParamPull extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case ParamPull_force_pull(msg) => emit(src"val $lhs = $msg.force_pull")
    case ParamPullRep_success(msg) => emit(src"val $lhs = $msg.success")
    case ParamPullRep_param_received(msg) => emit(src"val $lhs = $msg.param_received")
    case NewParamPull(force_pull) =>
      emit(src"val $lhs = ParamPull($force_pull)")
    case ParamPullReply(srv) =>
      emit(src"val $lhs = $srv.response")
    case _ => super.emitNode(lhs, rhs)
  }

}

