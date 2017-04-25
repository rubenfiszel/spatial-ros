package spatial.ros.api

import argon.core.Staging
import forge._
import spatial._
import spatial.ros._

trait RosStaticApi extends RosStaticExp { this: RosExp =>

  object Ros {
    @api def init(t: Text) = Void(ros_init(t.s))
  }
}

trait RosStaticExp extends Staging { this: SpatialExp =>

  /** IR Nodes **/
  case class Init(name: Exp[Text]) extends Op[Void] {
    def mirror(f: Tx) = ros_init(f(name))
  }

  /** Constructors **/
  @api protected def ros_init(t: Exp[Text]): Sym[Void] = {
    stageSimple(Init(t))(ctx)
  }

}
