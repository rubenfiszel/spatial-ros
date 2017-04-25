package spatial.ros.codegen.rosgen

import argon.codegen.cppgen.CppCodegen

import scala.language.postfixOps

trait RosCodegen extends CppCodegen {
  override val name         = "Ros Codegen"
  override val lang: String = "roscpp"
  //override def copyDependencies(out: String): Unit =
}
