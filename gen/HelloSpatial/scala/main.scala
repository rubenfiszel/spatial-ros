import DataImplicits._
object Main {
  def main(args: Array[String]): Unit = {
    val x135 = Array[Number](Number(BigDecimal(0),true,FixedPoint(true,32,0)))
    val x136 = Array[Number](Number(BigDecimal(0),true,FixedPoint(true,32,0)))
    val x0 = args
    val x1 = x0.apply(Number(BigDecimal(0),true,FixedPoint(true,32,0)))
    val x2 = Number(x1, FixedPoint(true,32,0))
    val x137 = x135.update(0, x2)
    /** BEGIN HARDWARE BLOCK x141 **/
    val x141 = {
      val x138 = x135.apply(0)
      val x139 = x138 + Number(BigDecimal(4),true,FixedPoint(true,32,0))
      val x140 = if (TRUE) x136.update(0, x139)
      ()
    }
    /** END HARDWARE BLOCK x141 **/
    val x142 = x136.apply(0)
    val x143 = x142.toString
    val x144 = "Output: " + x143
    val x145 = if (TRUE) System.out.println(x144)
    ()
  }
}
