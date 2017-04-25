import spatial.ros._
import org.virtualized._
import argon.ops._

object HelloSpatial extends RosApp {

  import IR._


  @virtualize
  def main() {

    Accel {
    }

    Ros.init("offb_node")
    //val quat = Quaternion(0.2, 0.3, 0.4)
//    println("expected: " + quat)
  }

}
