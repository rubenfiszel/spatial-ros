
package spatial.ros

import forge._
import org.virtualized._

trait StateApi extends StateExp {
  self: RosApi =>

}

trait StateExp {
  self: RosExp =>
  
  
case class State_connected(msg: Exp[State]) extends Op[Bool] {
  def mirror(f: Tx) = ???//State_connected(f(msg))
}

  
case class State_armed(msg: Exp[State]) extends Op[Bool] {
  def mirror(f: Tx) = ???//State_armed(f(msg))
}

  
case class State_guided(msg: Exp[State]) extends Op[Bool] {
  def mirror(f: Tx) = ???//State_guided(f(msg))
}

  
case class State_mode(msg: Exp[State]) extends Op[Text] {
  def mirror(f: Tx) = ???//State_mode(f(msg))
}


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
  
  object State {

  }

}

