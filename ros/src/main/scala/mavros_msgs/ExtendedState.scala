
package spatial.ros

import forge._
import org.virtualized._

trait ExtendedStateApi extends ExtendedStateExp {
  self: RosApi =>

}

trait ExtendedStateExp {
  self: RosExp =>

  implicit object ExtendedStateType extends Meta[ExtendedState] {
    def wrapped(x: Exp[ExtendedState]) = ExtendedState(x)
    def stagedClass = classOf[ExtendedState]
    def isPrimitive = false
  }

  case class ExtendedState(s: Exp[ExtendedState]) extends MetaAny[ExtendedState] {
    @api def vtol_state: FixPt[FALSE,_8,_0] = FixPt(stage(ExtendedState_vtol_state(s))(ctx))
    @api def landed_state: FixPt[FALSE,_8,_0] = FixPt(stage(ExtendedState_landed_state(s))(ctx))
    @api def ===(that: ExtendedState) = ???
    @api def =!=(that: ExtendedState) = ???
    @api def toText: Text = textify(this)
  }

  
case class ExtendedState_vtol_state(msg: Exp[ExtendedState]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(ExtendedState_vtol_state(f(msg)))(EmptyContext)
}

  
case class ExtendedState_landed_state(msg: Exp[ExtendedState]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(ExtendedState_landed_state(f(msg)))(EmptyContext)
}

  
  object ExtendedState {

  }

}

