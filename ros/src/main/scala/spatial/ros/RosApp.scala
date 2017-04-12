package spatial.ros

import spatial.SpatialApp
import spatial.SpatialConfig

trait RosApp extends SpatialApp{


  override def parseArguments(args: Seq[String]): Unit = {
    val parser = new RosArgParser
    parser.parse(args) match {
      case None =>
        println("Nothing generated")
        sys.exit(0)
      case _ =>
        //println(argon.Config.conf)
        println(SpatialConfig.spatialConf)
        println("Starting generation")
    }
    SpatialConfig.enableSim = false
  }

}
