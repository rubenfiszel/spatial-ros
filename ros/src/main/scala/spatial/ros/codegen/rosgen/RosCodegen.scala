package spatial.ros.codegen.rosgen

import argon.codegen.Codegen
import argon.Config
import argon.codegen.FileDependencies
import argon.codegen.cppgen.CppCodegen

import sys.process._
import scala.language.postfixOps

trait RosCodegen extends CppCodegen{
  import IR._
}
