package spatial.ros.codegen.scalagen

import argon.codegen
import argon.codegen.scalagen.ScalaCodegen
import spatial.ros.api.RosStaticExp
import spatial.ros.RosExp
import spatial.SpatialExp


trait RosGenScalaRosStatic extends RosScalaCodegen{
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case Init(name) =>
      emit(src"""println("init: " + $name)""")

    case _ => super.emitNode(lhs, rhs)
  }

}
