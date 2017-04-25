package spatial.ros.codegen.scalagen

import spatial.ros.RosExp

trait RosGenScalaRosStatic extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case Init(name) =>
      emit(src"""println("init: " + $name)""")

    case _ => super.emitNode(lhs, rhs)
  }

}
