
package spatial.ros

import forge._
import org.virtualized._

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
    @api def success: Bool = Bool(stage(CommandTOLRep_reply_success(s))(ctx))
    @api def result: FixPt[FALSE,_8,_0] = FixPt(stage(CommandTOLRep_reply_result(s))(ctx))
    @api def ===(that: CommandTOLRep): Bool = ???
    @api def =!=(that: CommandTOLRep): Bool = ???
    @api def toText: Text = textify(this)
  }

  
case class CommandTOL_yaw(srv: Exp[CommandTOL]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandTOL_yaw(f(srv)))(EmptyContext)
}

  
case class CommandTOL_latitude(srv: Exp[CommandTOL]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandTOL_latitude(f(srv)))(EmptyContext)
}

  
case class CommandTOL_longitude(srv: Exp[CommandTOL]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandTOL_longitude(f(srv)))(EmptyContext)
}

  
case class CommandTOL_altitude(srv: Exp[CommandTOL]) extends Op[FltPt[_24,_8]] {
  def mirror(f: Tx) = stage(CommandTOL_altitude(f(srv)))(EmptyContext)
}

  
case class CommandTOLRep_reply_success(srv: Exp[CommandTOLRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(CommandTOLRep_reply_success(f(srv)))(EmptyContext)
}

  
case class CommandTOLRep_reply_result(srv: Exp[CommandTOLRep]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(CommandTOLRep_reply_result(f(srv)))(EmptyContext)
}

  case class CommandTOLReply(srv: Exp[CommandTOL]) extends Op[CommandTOLRep]{
    def mirror(f: Tx) = stage(CommandTOLReply(f(srv)))(EmptyContext)
  }

  
  object CommandTOL {

  }

  object CommandTOLRep {

  }

}

