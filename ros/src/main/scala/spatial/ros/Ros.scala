package spatial.ros

import argon.codegen.cppgen._
import spatial.codegen.cppgen._
import spatial._
import spatial.ros._
import spatial.ros.api.RosStaticExp
import spatial.ros.codegen.rosgen.RosCodegen

trait RosExp extends SpatialExp with RosStaticExp

trait RosGenSpatial extends RosCodegen with RosFileGen
  with CppGenBool with CppGenVoid with CppGenFixPt with CppGenFltPt
  with CppGenCounter with CppGenReg with CppGenSRAM with CppGenFIFO
  with CppGenIfThenElse with CppGenController with CppGenMath with CppGenFringeCopy with CppGenText
  with CppGenDRAM with CppGenHostTransfer with CppGenUnrolled with CppGenVector
  with CppGenArray with CppGenArrayExt with CppGenRange with CppGenAlteraVideo with CppGenStream
  with CppGenHashMap with CppGenStructs with CppGenDebugging with CppGenFileIO{
    override val IR: SpatialCompiler

}