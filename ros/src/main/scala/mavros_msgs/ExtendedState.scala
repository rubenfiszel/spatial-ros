
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen
import spatial.ros.codegen.scalagen.RosScalaCodegen

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

  implicit object ExtendedStateMsg extends Msg[ExtendedState]

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

  case class NewExtendedState(vtol_state: Exp[FixPt[FALSE,_8,_0]], landed_state: Exp[FixPt[FALSE,_8,_0]]) extends Op[ExtendedState] {
    def mirror(f: Tx) = stage(NewExtendedState(f(vtol_state), f(landed_state)))(EmptyContext)
  }

  object ExtendedState {

  @api def apply(vtol_state: FixPt[FALSE,_8,_0], landed_state: FixPt[FALSE,_8,_0]): ExtendedState = ExtendedState(stage(NewExtendedState(vtol_state.s, landed_state.s))(ctx))


  }

}

trait ScalaGenExtendedState extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case ExtendedState_vtol_state(msg) => emit(src"val $lhs = $msg.vtol_state")
    case ExtendedState_landed_state(msg) => emit(src"val $lhs = $msg.landed_state")
    case NewExtendedState(vtol_state, landed_state) =>
      emit(src"val $lhs = ExtendedState($vtol_state, $landed_state)")
    case _ => super.emitNode(lhs, rhs)
  }

}


