package spatial.ros

import spatial.SpatialCompiler

trait RosCompiler extends SpatialCompiler { self =>
    lazy val rosgen = new RosGenSpatial { val IR: self.type = self; override def shouldRun = true}
    override def createTraversalSchedule() = {
      super.createTraversalSchedule()
      passes += rosgen
    }

}
