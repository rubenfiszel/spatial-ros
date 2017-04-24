
package spatial.ros

import forge._
import org.virtualized._

trait CommandTriggerControlApi extends CommandTriggerControlExp {
  self: RosApi =>

}

trait CommandTriggerControlExp {
  self: RosExp =>
  
  implicit object CommandTriggerControlType extends Meta[CommandTriggerControl] {
    def wrapped(x: Exp[CommandTriggerControl]) = CommandTriggerControl(x)
    def stagedClass = classOf[CommandTriggerControl]
    def isPrimitive = false
  }

  implicit object CommandTriggerControlRepType extends Meta[CommandTriggerControlRep] {
    def wrapped(x: Exp[CommandTriggerControlRep]) = CommandTriggerControlRep(x)
    def stagedClass = classOf[CommandTriggerControlRep]
    def isPrimitive = false
  }

  case class CommandTriggerControl(s: Exp[CommandTriggerControl]) extends MetaAny[CommandTriggerControl] {

    @api def response: CommandTriggerControlRep = ???//CommandTriggerControlRep(CommandTriggerControlReply(s))
    @api def ===(that: CommandTriggerControl): Bool = ???
    @api def =!=(that: CommandTriggerControl): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class CommandTriggerControlRep(s: Exp[CommandTriggerControlRep]) extends MetaAny[CommandTriggerControlRep] {
    @api def success: Bool = Bool(stage(CommandTriggerControlRep_reply_success(s))(ctx))
    @api def result: FixPt[FALSE,_8,_0] = FixPt(stage(CommandTriggerControlRep_reply_result(s))(ctx))
    @api def ===(that: CommandTriggerControlRep): Bool = ???
    @api def =!=(that: CommandTriggerControlRep): Bool = ???
    @api def toText: Text = textify(this)
  }


  
case class CommandTriggerControlRep_reply_success(srv: Exp[CommandTriggerControlRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(CommandTriggerControlRep_reply_success(f(srv)))(EmptyContext)
}

  
case class CommandTriggerControlRep_reply_result(srv: Exp[CommandTriggerControlRep]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(CommandTriggerControlRep_reply_result(f(srv)))(EmptyContext)
}

  case class CommandTriggerControlReply(srv: Exp[CommandTriggerControl]) extends Op[CommandTriggerControlRep]{
    def mirror(f: Tx) = stage(CommandTriggerControlReply(f(srv)))(EmptyContext)
  }

  
  object CommandTriggerControl {

  }

  object CommandTriggerControlRep {

  }

}

