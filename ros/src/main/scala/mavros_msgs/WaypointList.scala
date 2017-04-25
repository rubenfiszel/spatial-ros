package spatial.ros

import argon.codegen.scalagen.ScalaCodegen
import forge._
import org.virtualized._

trait WaypointListApi extends WaypointListExp { self: RosApi =>

}

trait WaypointListExp { self: RosExp =>

  implicit object WaypointListType extends Meta[WaypointList] {
    def wrapped(x: Exp[WaypointList]) = WaypointList(x)
    def stagedClass                   = classOf[WaypointList]
    def isPrimitive                   = false
  }

  case class WaypointList(s: Exp[WaypointList]) extends MetaAny[WaypointList] {
    @api def waypoints: MetaArray[Waypoint] =
      MetaArray(stage(WaypointList_waypoints(s))(ctx))
    @api def ===(that: WaypointList) = ???
    @api def =!=(that: WaypointList) = ???
    @api def toText: Text            = textify(this)
  }

  case class WaypointList_waypoints(msg: Exp[WaypointList])
      extends Op[MetaArray[Waypoint]] {
    def mirror(f: Tx) = stage(WaypointList_waypoints(f(msg)))(EmptyContext)
  }

  case class NewWaypointList(waypoints: Exp[MetaArray[Waypoint]])
      extends Op[WaypointList] {
    def mirror(f: Tx) = stage(NewWaypointList(f(waypoints)))(EmptyContext)
  }

  object WaypointList {

    @api def apply(waypoints: MetaArray[Waypoint]): WaypointList =
      WaypointList(stage(NewWaypointList(waypoints.s))(ctx))

  }

}

trait ScalaGenWaypointList extends ScalaCodegen {
  override def emitFileHeader() = {
//    emit(src"import DataImplicits._")
    super.emitFileHeader()
  }
}
