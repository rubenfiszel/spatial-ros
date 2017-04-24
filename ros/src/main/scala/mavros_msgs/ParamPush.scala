
package spatial.ros

import forge._
import org.virtualized._

trait ParamPushApi extends ParamPushExp {
  self: RosApi =>

}

trait ParamPushExp {
  self: RosExp =>
  


  case class ParamPushReply(srv: Exp[ParamPush]) extends Op[ParamPushRep]{
    def mirror(f: Tx) = ???//ParamPushReply(f(srv))
  }

  implicit object ParamPushType extends Meta[ParamPush] {
    def wrapped(x: Exp[ParamPush]) = ParamPush(x)
    def stagedClass = classOf[ParamPush]
    def isPrimitive = false
  }

  implicit object ParamPushRepType extends Meta[ParamPushRep] {
    def wrapped(x: Exp[ParamPushRep]) = ParamPushRep(x)
    def stagedClass = classOf[ParamPushRep]
    def isPrimitive = false
  }

  case class ParamPush(s: Exp[ParamPush]) extends MetaAny[ParamPush] {

    @api def response: ParamPushRep = ???//ParamPushRep(ParamPushReply(s))
    @api def ===(that: ParamPush): Bool = ???
    @api def =!=(that: ParamPush): Bool = ???
    @api def toText: Text = ???
  }

  case class ParamPushRep(s: Exp[ParamPushRep]) extends MetaAny[ParamPushRep] {
    @api def success: Bool = ???
    @api def param_transfered: FixPt[FALSE,_32,_0] = ???
    @api def ===(that: ParamPushRep): Bool = ???
    @api def =!=(that: ParamPushRep): Bool = ???
    @api def toText: Text = ???
  }
  
  object ParamPush {

  }

  object ParamPushRep {

  }

}

