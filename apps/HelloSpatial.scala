import spatial._
import org.virtualized._

object HelloSpatial extends SpatialApp {
  import IR._

  @virtualize
  def main() {
    val input = args(0).to[Int]
    val in  = ArgIn[Int]
    val out = ArgOut[Int]
    setArg(in, input)
    Accel {
      out := in + 4
    }
    println("Output: " + getArg(out))
  }
}
