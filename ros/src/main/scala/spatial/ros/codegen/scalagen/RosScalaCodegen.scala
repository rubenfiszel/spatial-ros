package spatial.ros.codegen.scalagen

import argon.codegen.scalagen.ScalaCodegen


trait RosScalaCodegen extends ScalaCodegen{
  import IR._
  override val name = "Ros Scala Codegen"
  //override def copyDependencies(out: String): Unit =
}
