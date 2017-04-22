package spatial.ros

import spatial._

trait RosCompiler extends SpatialCompiler { self =>
  lazy val rosGenScala = new RosGenScala { val IR: self.type = self; override def shouldRun = RosConfig.enableRosSim}
  lazy val rosGen = new RosGen { val IR: self.type = self; override def shouldRun = RosConfig.enableRosSynth}

  override def createTraversalSchedule() = {
    super.createTraversalSchedule()

    if (RosConfig.enableRosSim)
      passes += rosGenScala
    if (RosConfig.enableRosSynth)
      passes += rosGen
  }

}
