
package spatial.ros

import forge._
import org.virtualized._

trait WaypointClearApi extends WaypointClearExp {
  self: RosApi =>

}

trait WaypointClearExp {
  self: RosExp =>
  


  case class WaypointClearReply(srv: Exp[WaypointClear]) extends Op[WaypointClearRep]{
    def mirror(f: Tx) = ???//WaypointClearReply(f(srv))
  }

  implicit object WaypointClearType extends Meta[WaypointClear] {
    def wrapped(x: Exp[WaypointClear]) = WaypointClear(x)
    def stagedClass = classOf[WaypointClear]
    def isPrimitive = false
  }

  implicit object WaypointClearRepType extends Meta[WaypointClearRep] {
    def wrapped(x: Exp[WaypointClearRep]) = WaypointClearRep(x)
    def stagedClass = classOf[WaypointClearRep]
    def isPrimitive = false
  }

  case class WaypointClear(s: Exp[WaypointClear]) extends MetaAny[WaypointClear] {

    @api def response: WaypointClearRep = ???//WaypointClearRep(WaypointClearReply(s))
    @api def ===(that: WaypointClear): Bool = ???
    @api def =!=(that: WaypointClear): Bool = ???
    @api def toText: Text = ???
  }

  case class WaypointClearRep(s: Exp[WaypointClearRep]) extends MetaAny[WaypointClearRep] {
    @api def success: Bool = ???
    @api def ===(that: WaypointClearRep): Bool = ???
    @api def =!=(that: WaypointClearRep): Bool = ???
    @api def toText: Text = ???
  }
  
  object WaypointClear {

  }

  object WaypointClearRep {

  }

}

