
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait OverrideRCInApi extends OverrideRCInExp {
  self: RosApi =>

}

trait OverrideRCInExp {
  self: RosExp =>

  implicit object OverrideRCInType extends Meta[OverrideRCIn] {
    def wrapped(x: Exp[OverrideRCIn]) = OverrideRCIn(x)
    def stagedClass = classOf[OverrideRCIn]
    def isPrimitive = false
  }

  implicit object OverrideRCInMsg extends Msg[OverrideRCIn]

  case class OverrideRCIn(s: Exp[OverrideRCIn]) extends MetaAny[OverrideRCIn] {
    @api def channels: FixPt[FALSE,_16,_0] = FixPt(stage(OverrideRCIn_channels(s))(ctx))
    @api def ===(that: OverrideRCIn) = ???
    @api def =!=(that: OverrideRCIn) = ???
    @api def toText: Text = textify(this)
  }

  
case class OverrideRCIn_channels(msg: Exp[OverrideRCIn]) extends Op[FixPt[FALSE,_16,_0]] {
  def mirror(f: Tx) = stage(OverrideRCIn_channels(f(msg)))(EmptyContext)
}

  case class NewOverrideRCIn(channels: Exp[FixPt[FALSE,_16,_0]]) extends Op[OverrideRCIn] {
    def mirror(f: Tx) = stage(NewOverrideRCIn(f(channels)))(EmptyContext)
  }

  object OverrideRCIn {

  @api def apply(channels: FixPt[FALSE,_16,_0]): OverrideRCIn = OverrideRCIn(stage(NewOverrideRCIn(channels.s))(ctx))
    val CHAN_RELEASE: FixPt[FALSE,_16,_0] = 0
    val CHAN_NOCHANGE: FixPt[FALSE,_16,_0] = 65535

  }

}

trait ScalaGenOverrideRCIn extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case OverrideRCIn_channels(msg) => emit(src"val $lhs = $msg.channels")
    case NewOverrideRCIn(channels) =>
      emit(src"val $lhs = OverrideRCIn($channels)")
    case _ => super.emitNode(lhs, rhs)
  }

}


