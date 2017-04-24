
package spatial.ros

import forge._
import org.virtualized._

trait WaypointPullApi extends WaypointPullExp {
  self: RosApi =>

}

trait WaypointPullExp {
  self: RosExp =>
  
  implicit object WaypointPullType extends Meta[WaypointPull] {
    def wrapped(x: Exp[WaypointPull]) = WaypointPull(x)
    def stagedClass = classOf[WaypointPull]
    def isPrimitive = false
  }

  implicit object WaypointPullRepType extends Meta[WaypointPullRep] {
    def wrapped(x: Exp[WaypointPullRep]) = WaypointPullRep(x)
    def stagedClass = classOf[WaypointPullRep]
    def isPrimitive = false
  }

  case class WaypointPull(s: Exp[WaypointPull]) extends MetaAny[WaypointPull] {

    @api def response: WaypointPullRep = ???//WaypointPullRep(WaypointPullReply(s))
    @api def ===(that: WaypointPull): Bool = ???
    @api def =!=(that: WaypointPull): Bool = ???
    @api def toText: Text = ???
  }

  case class WaypointPullRep(s: Exp[WaypointPullRep]) extends MetaAny[WaypointPullRep] {
    @api def success: Bool = ???
    @api def wp_received: FixPt[FALSE,_32,_0] = ???
    @api def ===(that: WaypointPullRep): Bool = ???
    @api def =!=(that: WaypointPullRep): Bool = ???
    @api def toText: Text = ???
  }



  case class WaypointPullReply(srv: Exp[WaypointPull]) extends Op[WaypointPullRep]{
    def mirror(f: Tx) = stage(WaypointPullReply(f(srv)))(EmptyContext)
  }

  
  object WaypointPull {

  }

  object WaypointPullRep {

  }

}

