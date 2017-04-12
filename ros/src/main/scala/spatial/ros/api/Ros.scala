package spatial.ros.api

import argon.core.Staging
import spatial._
import spatial.ros._
import forge._


trait RosStaticApi extends RosStaticExp {
  this: RosExp =>

  @api def init(t: Exp[Text]) = Init(t)
}


trait RosStaticExp extends Staging {
  this: SpatialExp =>


  /** IR Nodes **/
  case class Init(name: Exp[Text]) extends Op[Void] {
    def mirror(f:Tx) = ros_init(name)
  }

  /** Constructors **/
  @api def ros_init(t: Exp[Text]): Sym[Void] = {
    stage(Init(t))(ctx)
  }

}

