
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen
import spatial.ros.codegen.scalagen.RosScalaCodegen

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

  implicit object StateMsg extends Msg[State]

  case class State(s: Exp[State]) extends MetaAny[State] {
    @api def connected: Bool = Bool(stage(State_connected(s))(ctx))
    @api def armed: Bool = Bool(stage(State_armed(s))(ctx))
    @api def guided: Bool = Bool(stage(State_guided(s))(ctx))
    @api def mode: Text = Text(stage(State_mode(s))(ctx))
    @api def ===(that: State) = ???
    @api def =!=(that: State) = ???
    @api def toText: Text = textify(this)
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

  case class NewState(connected: Exp[Bool], armed: Exp[Bool], guided: Exp[Bool], mode: Exp[Text]) extends Op[State] {
    def mirror(f: Tx) = stage(NewState(f(connected), f(armed), f(guided), f(mode)))(EmptyContext)
  }

  object State {

  @api def apply(connected: Bool, armed: Bool, guided: Bool, mode: Text): State = State(stage(NewState(connected.s, armed.s, guided.s, mode.s))(ctx))


  }

}

trait ScalaGenState extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case State_connected(msg) => emit(src"val $lhs = $msg.connected")
    case State_armed(msg) => emit(src"val $lhs = $msg.armed")
    case State_guided(msg) => emit(src"val $lhs = $msg.guided")
    case State_mode(msg) => emit(src"val $lhs = $msg.mode")
    case NewState(connected, armed, guided, mode) =>
      emit(src"val $lhs = State($connected, $armed, $guided, $mode)")
    case _ => super.emitNode(lhs, rhs)
  }

}


