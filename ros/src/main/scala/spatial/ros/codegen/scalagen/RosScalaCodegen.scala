package spatial.ros.codegen.scalagen

import argon.codegen.scalagen.ScalaCodegen

trait RosScalaCodegen extends ScalaCodegen {
  override val name         = "Ros Scala Codegen"
  override val lang: String = "rosscala"
  //override def copyDependencies(out: String): Unit =
}
