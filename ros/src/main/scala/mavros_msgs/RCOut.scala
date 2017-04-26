
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait RCOutApi extends RCOutExp {
  self: RosApi =>

}

trait RCOutExp {
  self: RosExp =>

  implicit object RCOutType extends Meta[RCOut] {
    def wrapped(x: Exp[RCOut]) = RCOut(x)
    def stagedClass = classOf[RCOut]
    def isPrimitive = false
  }

  implicit object RCOutMsg extends Msg[RCOut]

  case class RCOut(s: Exp[RCOut]) extends MetaAny[RCOut] {
    @api def channels: MetaArray[FixPt[FALSE,_16,_0]] = MetaArray(stage(RCOut_channels(s))(ctx))
    @api def ===(that: RCOut) = ???
    @api def =!=(that: RCOut) = ???
    @api def toText: Text = textify(this)
  }

  
case class RCOut_channels(msg: Exp[RCOut]) extends Op[MetaArray[FixPt[FALSE,_16,_0]]] {
  def mirror(f: Tx) = stage(RCOut_channels(f(msg)))(EmptyContext)
}

  case class NewRCOut(channels: Exp[MetaArray[FixPt[FALSE,_16,_0]]]) extends Op[RCOut] {
    def mirror(f: Tx) = stage(NewRCOut(f(channels)))(EmptyContext)
  }

  object RCOut {

  @api def apply(channels: MetaArray[FixPt[FALSE,_16,_0]]): RCOut = RCOut(stage(NewRCOut(channels.s))(ctx))


  }

}

trait ScalaGenRCOut extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case RCOut_channels(msg) => emit(src"val $lhs = $msg.channels")
    case NewRCOut(channels) =>
      emit(src"val $lhs = RCOut($channels)")
    case _ => super.emitNode(lhs, rhs)
  }

}


