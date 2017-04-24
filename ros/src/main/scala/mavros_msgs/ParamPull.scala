
package spatial.ros

import forge._
import org.virtualized._

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

  implicit object ParamPullRepType extends Meta[ParamPullRep] {
    def wrapped(x: Exp[ParamPullRep]) = ParamPullRep(x)
    def stagedClass = classOf[ParamPullRep]
    def isPrimitive = false
  }

  case class ParamPull(s: Exp[ParamPull]) extends MetaAny[ParamPull] {
    @api def force_pull: Bool = ???
    @api def response: ParamPullRep = ???//ParamPullRep(ParamPullReply(s))
    @api def ===(that: ParamPull): Bool = ???
    @api def =!=(that: ParamPull): Bool = ???
    @api def toText: Text = ???
  }

  case class ParamPullRep(s: Exp[ParamPullRep]) extends MetaAny[ParamPullRep] {
    @api def success: Bool = ???
    @api def param_received: FixPt[FALSE,_32,_0] = ???
    @api def ===(that: ParamPullRep): Bool = ???
    @api def =!=(that: ParamPullRep): Bool = ???
    @api def toText: Text = ???
  }

  
case class ParamPull_force_pull(srv: Exp[ParamPull]) extends Op[Bool] {
  def mirror(f: Tx) = stage(ParamPull_force_pull(f(srv)))(EmptyContext)
}

  
case class ParamPullRep_force_pull(srv: Exp[ParamPullRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(ParamPullRep_force_pull(f(srv)))(EmptyContext)
}

  case class ParamPullReply(srv: Exp[ParamPull]) extends Op[ParamPullRep]{
    def mirror(f: Tx) = stage(ParamPullReply(f(srv)))(EmptyContext)
  }

  
  object ParamPull {

  }

  object ParamPullRep {

  }

}

