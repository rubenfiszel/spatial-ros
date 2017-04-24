package spatial.ros

import forge._
import org.virtualized._

trait StateApi extends StateExp {
    self: RosApi =>

}

trait StateExp {
    self: RosExp =>

      implicit object StateType extends Meta[State] {
    def wrapped(x: Exp[State]) = State(x)
    def stagedClass = classOf[State]
    def isPrimitive = false
  }
    case class State(s: Exp[State]) extends MetaAny[State] {
    @api def connected: Bool = ???
    @api def armed: Bool = ???
    @api def guided: Bool = ???
    @api def mode: Text = ???

    @api def ===(that: State) = ??? 
    @api def =!=(that: State) = ??? 
    @api def toText: Text = ??? 
  }
}

object State{
}
