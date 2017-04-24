
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

  
case class State_connected(msg: Exp[State]) extends Op[Bool] {
  def mirror(f: Tx) = stage(State_connected(f(msg)))(EmptyContext)
}

  
case class State_armed(msg: Exp[State]) extends Op[Bool] {
  def mirror(f: Tx) = stage(State_armed(f(msg)))(EmptyContext)
}

  
case class State_guided(msg: Exp[State]) extends Op[Bool] {
  def mirror(f: Tx) = stage(State_guided(f(msg)))(EmptyContext)
}

  
case class State_mode(msg: Exp[State]) extends Op[Text] {
  def mirror(f: Tx) = stage(State_mode(f(msg)))(EmptyContext)
}

  
  object State {

  }

}

