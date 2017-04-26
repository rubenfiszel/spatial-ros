
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait ActuatorControlApi extends ActuatorControlExp {
  self: RosApi =>

}

trait ActuatorControlExp {
  self: RosExp =>

  implicit object ActuatorControlType extends Meta[ActuatorControl] {
    def wrapped(x: Exp[ActuatorControl]) = ActuatorControl(x)
    def stagedClass = classOf[ActuatorControl]
    def isPrimitive = false
  }

  implicit object ActuatorControlMsg extends Msg[ActuatorControl]

  case class ActuatorControl(s: Exp[ActuatorControl]) extends MetaAny[ActuatorControl] {
    @api def group_mix: FixPt[FALSE,_8,_0] = FixPt(stage(ActuatorControl_group_mix(s))(ctx))
    @api def controls: FltPt[_24,_8] = FltPt(stage(ActuatorControl_controls(s))(ctx))
    @api def ===(that: ActuatorControl) = ???
    @api def =!=(that: ActuatorControl) = ???
    @api def toText: Text = textify(this)
  }

  
case class ActuatorControl_group_mix(msg: Exp[ActuatorControl]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(ActuatorControl_group_mix(f(msg)))(EmptyContext)
}

  
case class ActuatorControl_controls(msg: Exp[ActuatorControl]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(ActuatorControl_controls(f(msg)))(EmptyContext)
}

  case class NewActuatorControl(group_mix: Exp[FixPt[FALSE,_8,_0]], controls: Exp[FltPt[_24,_8]]) extends Op[ActuatorControl] {
    def mirror(f: Tx) = stage(NewActuatorControl(f(group_mix), f(controls)))(EmptyContext)
  }

  object ActuatorControl {

  @api def apply(group_mix: FixPt[FALSE,_8,_0], controls: FltPt[_24,_8]): ActuatorControl = ActuatorControl(stage(NewActuatorControl(group_mix.s, controls.s))(ctx))


  }

}

trait ScalaGenActuatorControl extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case ActuatorControl_group_mix(msg) => emit(src"val $lhs = $msg.group_mix")
    case ActuatorControl_controls(msg) => emit(src"val $lhs = $msg.controls")
    case NewActuatorControl(group_mix, controls) =>
      emit(src"val $lhs = ActuatorControl($group_mix, $controls)")
    case _ => super.emitNode(lhs, rhs)
  }

}


