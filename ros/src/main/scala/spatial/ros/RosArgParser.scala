package spatial.ros

import argon.ArgonArgParser
import spatial.SpatialConfig

class RosArgParser extends ArgonArgParser{

  override def scriptName = "spatial-ros"
  override def description = "CLI for spatial-ros"


  parser.opt[String]("fpga").action( (x,_) =>
    SpatialConfig.targetName = x
  ).text("Set name of FPGA target [Default]")

  parser.opt[Unit]("dse").action( (_,_) =>
    SpatialConfig.enableDSE = true
  ).text("enables design space exploration [false]")

  parser.opt[Unit]("naming").action( (_,_) =>
    SpatialConfig.enableNaming = true
  ).text("generates the debug name for all syms, rather than \"x${s.id}\" only'")

  parser.opt[Unit]("tree").action( (_,_) =>
    SpatialConfig.enableNaming = true
  ).text("enables logging of controller tree for visualizing app structure")

  parser.opt[Unit]("dot").action( (_,_) =>
    SpatialConfig.enableDot = true
  ).text("enables dot generation")

}
