
package spatial.ros

import forge._
import org.virtualized._

trait WaypointClearApi extends WaypointClearExp {
  self: RosApi =>

}

trait WaypointClearExp {
  self: RosExp =>
  
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

    @api def response: WaypointClearRep = WaypointClearRep(stage(WaypointClearReply(s))(ctx))
    @api def ===(that: WaypointClear): Bool = ???
    @api def =!=(that: WaypointClear): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class WaypointClearRep(s: Exp[WaypointClearRep]) extends MetaAny[WaypointClearRep] {
    @api def success: Bool = Bool(stage(WaypointClearRep_reply_success(s))(ctx))
    @api def ===(that: WaypointClearRep): Bool = ???
    @api def =!=(that: WaypointClearRep): Bool = ???
    @api def toText: Text = textify(this)
  }


  
case class WaypointClearRep_reply_success(srv: Exp[WaypointClearRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(WaypointClearRep_reply_success(f(srv)))(EmptyContext)
}

  case class WaypointClearReply(srv: Exp[WaypointClear]) extends Op[WaypointClearRep]{
    def mirror(f: Tx) = stage(WaypointClearReply(f(srv)))(EmptyContext)
  }

  
  object WaypointClear {

  }

  object WaypointClearRep {

  }

}

