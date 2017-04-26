import org.virtualized._
import spatial.ros._

object HelloSpatial extends RosApp {

  import IR._

  @virtualize
  def main() {

    Accel {}

    Ros.init("offb_node")
    val quat = Quaternion(0.2, 0.3, 0.4, 0.4)
    println("expected: " + quat.x)
  }

}
