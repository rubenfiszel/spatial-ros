package spatial.ros

import spatial._

trait RosCompiler extends SpatialCompiler with RosApi { self =>
  lazy val rosGenScala = new RosGenScala {
    val IR: self.type = self; override def shouldRun = RosConfig.enableRosSim;
    def localMems     = uctrlAnalyzer.localMems
  }
  lazy val rosGen = new RosGen {
    val IR: self.type = self; override def shouldRun = RosConfig.enableRosSynth
  }

  override def createTraversalSchedule() = {
    super.createTraversalSchedule()

    if (RosConfig.enableRosSim)
      passes += rosGenScala
    if (RosConfig.enableRosSynth)
      passes += rosGen
  }

}
