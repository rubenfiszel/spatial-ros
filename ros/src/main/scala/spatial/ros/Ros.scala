package spatial.ros

import argon.codegen.cppgen._
import argon.codegen.scalagen._
import spatial.codegen.cppgen._
import spatial._
import spatial.codegen.scalagen._
import spatial.ros.api._
import spatial.ros.codegen.rosgen._
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait RosExp extends SpatialExp with RosStaticExp with MavrosExp
trait RosApi extends RosExp with  SpatialApi with RosStaticApi with MavrosApi 

trait RosGen extends RosCodegen with RosFileGen
  with CppGenBool with CppGenVoid with CppGenFixPt with CppGenFltPt
  with CppGenCounter with CppGenReg with CppGenSRAM with CppGenFIFO
  with CppGenIfThenElse with CppGenController with CppGenMath with CppGenFringeCopy with CppGenText
  with CppGenDRAM with CppGenHostTransfer with CppGenUnrolled with CppGenVector
  with CppGenArray with CppGenArrayExt with CppGenRange with CppGenAlteraVideo with CppGenStream
  with CppGenHashMap with CppGenStructs with CppGenDebugging with CppGenFileIO{
    override val IR: RosCompiler

}

trait RosGenScala extends RosScalaCodegen with ScalaFileGen
  with ScalaGenArray with ScalaGenSpatialArrayExt with ScalaGenSpatialBool with ScalaGenSpatialFixPt with ScalaGenSpatialFltPt
  with ScalaGenHashMap with ScalaGenIfThenElse with ScalaGenStructs with ScalaGenSpatialStruct
  with ScalaGenText with ScalaGenVoid with ScalaGenFunction with ScalaGenVariables
  with ScalaGenDebugging
  with ScalaGenController with ScalaGenCounter with ScalaGenDRAM with ScalaGenFIFO with ScalaGenHostTransfer with ScalaGenMath
  with ScalaGenRange with ScalaGenReg with ScalaGenSRAM with ScalaGenUnrolled with ScalaGenVector
  with ScalaGenStream
  with ScalaGenLineBuffer with ScalaGenRegFile with ScalaGenStateMachine with ScalaGenFileIO with ScalaGenShiftReg {

    override val IR: RosCompiler

    override def copyDependencies(out: String): Unit = {
        dependencies ::= FileDep("scalagen", "Makefile", "../")
        dependencies ::= FileDep("scalagen", "run.sh", "../")
        dependencies ::= FileDep("scalagen", "build.sbt", "../")
        super.copyDependencies(out)
    }
}