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
    @api def vtol_state: FixPt[FALSE,_8,_0] = ???
    @api def landed_state: FixPt[FALSE,_8,_0] = ???

    @api def ===(that: ExtendedState) = ??? 
    @api def =!=(that: ExtendedState) = ??? 
    @api def toText: Text = ??? 
  }
}

object ExtendedState{
}
