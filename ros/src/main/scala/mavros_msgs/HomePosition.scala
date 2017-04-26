
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait HomePositionApi extends HomePositionExp {
  self: RosApi =>

}

trait HomePositionExp {
  self: RosExp =>

  implicit object HomePositionType extends Meta[HomePosition] {
    def wrapped(x: Exp[HomePosition]) = HomePosition(x)
    def stagedClass = classOf[HomePosition]
    def isPrimitive = false
  }

  implicit object HomePositionMsg extends Msg[HomePosition]

  case class HomePosition(s: Exp[HomePosition]) extends MetaAny[HomePosition] {
    @api def longitude: FltPt[_53,_11] = FltPt(stage(HomePosition_longitude(s))(ctx))
    @api def ===(that: HomePosition) = ???
    @api def =!=(that: HomePosition) = ???
    @api def toText: Text = textify(this)
  }

  
case class HomePosition_longitude(msg: Exp[HomePosition]) extends Op[FltPt[_53,_11]] {
  def mirror(f: Tx) = stage(HomePosition_longitude(f(msg)))(EmptyContext)
}

  case class NewHomePosition(longitude: Exp[FltPt[_53,_11]]) extends Op[HomePosition] {
    def mirror(f: Tx) = stage(NewHomePosition(f(longitude)))(EmptyContext)
  }

  object HomePosition {

  @api def apply(longitude: FltPt[_53,_11]): HomePosition = HomePosition(stage(NewHomePosition(longitude.s))(ctx))


  }

}

trait ScalaGenHomePosition extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case HomePosition_longitude(msg) => emit(src"val $lhs = $msg.longitude")
    case NewHomePosition(longitude) =>
      emit(src"val $lhs = HomePosition($longitude)")
    case _ => super.emitNode(lhs, rhs)
  }

}


