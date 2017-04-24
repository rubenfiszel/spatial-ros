
package spatial.ros

import forge._
import org.virtualized._

trait SetModeApi extends SetModeExp {
  self: RosApi =>

}

trait SetModeExp {
  self: RosExp =>
  


  case class SetModeReply(srv: Exp[SetMode]) extends Op[SetModeRep]{
    def mirror(f: Tx) = ???//SetModeReply(f(srv))
  }

  implicit object SetModeType extends Meta[SetMode] {
    def wrapped(x: Exp[SetMode]) = SetMode(x)
    def stagedClass = classOf[SetMode]
    def isPrimitive = false
  }

  implicit object SetModeRepType extends Meta[SetModeRep] {
    def wrapped(x: Exp[SetModeRep]) = SetModeRep(x)
    def stagedClass = classOf[SetModeRep]
    def isPrimitive = false
  }

  case class SetMode(s: Exp[SetMode]) extends MetaAny[SetMode] {

    @api def response: SetModeRep = ???//SetModeRep(SetModeReply(s))
    @api def ===(that: SetMode): Bool = ???
    @api def =!=(that: SetMode): Bool = ???
    @api def toText: Text = ???
  }

  case class SetModeRep(s: Exp[SetModeRep]) extends MetaAny[SetModeRep] {
    @api def success: Bool = ???
    @api def ===(that: SetModeRep): Bool = ???
    @api def =!=(that: SetModeRep): Bool = ???
    @api def toText: Text = ???
  }
  
  object SetMode {

  }

  object SetModeRep {

  }

}

