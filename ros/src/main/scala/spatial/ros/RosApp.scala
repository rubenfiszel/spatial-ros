package spatial.ros

import spatial.{SpatialApp, SpatialConfig, SpatialIR}

trait RosIR extends RosCompiler with SpatialIR
trait RosApp extends SpatialApp {

  override val IR = new RosIR { def target = RosApp.this.target }

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
    SpatialConfig.enableSynth = false
  }

}
