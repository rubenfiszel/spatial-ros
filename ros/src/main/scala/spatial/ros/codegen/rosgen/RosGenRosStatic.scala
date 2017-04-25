package spatial.ros.codegen.rosgen

import argon.codegen.cppgen.CppCodegen
import spatial.ros.api.RosStaticExp
import spatial.ros.RosExp
import spatial.SpatialExp


trait RosGenRosStatic extends RosCodegen{
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case Init(name) =>
      emit(src"""spatial.ros::init(argc, argv, "offb_node");"// axi_master_slave""")

    case _ => super.emitNode(lhs, rhs)
  }

}
