
package spatial.ros

import forge._
import org.virtualized._
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait CommandTOLApi extends CommandTOLExp {
  self: RosApi =>

}

trait CommandTOLExp {
  self: RosExp =>
  
  implicit object CommandTOLType extends Meta[CommandTOL] {
    def wrapped(x: Exp[CommandTOL]) = CommandTOL(x)
    def stagedClass = classOf[CommandTOL]
    def isPrimitive = false
  }

  implicit object CommandTOLSrv extends Srv[CommandTOL] {
    type Response = CommandTOLRep
    def response(srv: CommandTOL) = srv.response
  }

  implicit object CommandTOLRepType extends Meta[CommandTOLRep] {
    def wrapped(x: Exp[CommandTOLRep]) = CommandTOLRep(x)
    def stagedClass = classOf[CommandTOLRep]
    def isPrimitive = false
  }

  case class CommandTOL(s: Exp[CommandTOL]) extends MetaAny[CommandTOL] {
    @api def yaw: FltPt[_24,_8] = FltPt(stage(CommandTOL_yaw(s))(ctx))
    @api def latitude: FltPt[_24,_8] = FltPt(stage(CommandTOL_latitude(s))(ctx))
    @api def longitude: FltPt[_24,_8] = FltPt(stage(CommandTOL_longitude(s))(ctx))
    @api def altitude: FltPt[_24,_8] = FltPt(stage(CommandTOL_altitude(s))(ctx))
    @api def response: CommandTOLRep = CommandTOLRep(stage(CommandTOLReply(s))(ctx))
    @api def ===(that: CommandTOL): Bool = ???
    @api def =!=(that: CommandTOL): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class CommandTOLRep(s: Exp[CommandTOLRep]) extends MetaAny[CommandTOLRep] {
    @api def success: Bool = Bool(stage(CommandTOLRep_success(s))(ctx))
    @api def result: FixPt[FALSE,_8,_0] = FixPt(stage(CommandTOLRep_result(s))(ctx))
    @api def ===(that: CommandTOLRep): Bool = ???
    @api def =!=(that: CommandTOLRep): Bool = ???
    @api def toText: Text = textify(this)
  }

  
case class CommandTOL_yaw(msg: Exp[CommandTOL]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandTOL_yaw(f(msg)))(EmptyContext)
}

  
case class CommandTOL_latitude(msg: Exp[CommandTOL]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandTOL_latitude(f(msg)))(EmptyContext)
}

  
case class CommandTOL_longitude(msg: Exp[CommandTOL]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandTOL_longitude(f(msg)))(EmptyContext)
}

  
case class CommandTOL_altitude(msg: Exp[CommandTOL]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandTOL_altitude(f(msg)))(EmptyContext)
}

  
case class CommandTOLRep_success(srv: Exp[CommandTOLRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(CommandTOLRep_success(f(srv)))(EmptyContext)
}

  
case class CommandTOLRep_result(srv: Exp[CommandTOLRep]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(CommandTOLRep_result(f(srv)))(EmptyContext)
}

  case class CommandTOLReply(srv: Exp[CommandTOL]) extends Op[CommandTOLRep]{
    def mirror(f: Tx) = stage(CommandTOLReply(f(srv)))(EmptyContext)
  }
  case class NewCommandTOL(yaw: Exp[FltPt[_24,_8]], latitude: Exp[FltPt[_24,_8]], longitude: Exp[FltPt[_24,_8]], altitude: Exp[FltPt[_24,_8]]) extends Op[CommandTOL] {
    def mirror(f: Tx) = stage(NewCommandTOL(f(yaw), f(latitude), f(longitude), f(altitude)))(EmptyContext)
  }

  
  object CommandTOL {

  @api def apply(yaw: FltPt[_24,_8], latitude: FltPt[_24,_8], longitude: FltPt[_24,_8], altitude: FltPt[_24,_8]): CommandTOL = CommandTOL(stage(NewCommandTOL(yaw.s, latitude.s, longitude.s, altitude.s))(ctx))
  }

  object CommandTOLRep {

  }

}

trait ScalaGenCommandTOL extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case CommandTOL_yaw(msg) => emit(src"val $lhs = $msg.yaw")
    case CommandTOL_latitude(msg) => emit(src"val $lhs = $msg.latitude")
    case CommandTOL_longitude(msg) => emit(src"val $lhs = $msg.longitude")
    case CommandTOL_altitude(msg) => emit(src"val $lhs = $msg.altitude")
    case CommandTOLRep_success(msg) => emit(src"val $lhs = $msg.success")
    case CommandTOLRep_result(msg) => emit(src"val $lhs = $msg.result")
    case NewCommandTOL(yaw, latitude, longitude, altitude) =>
      emit(src"val $lhs = CommandTOL($yaw, $latitude, $longitude, $altitude)")
    case CommandTOLReply(srv) =>
      emit(src"val $lhs = $srv.response")
    case _ => super.emitNode(lhs, rhs)
  }

}

