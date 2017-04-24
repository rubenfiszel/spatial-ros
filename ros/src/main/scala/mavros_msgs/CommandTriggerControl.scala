
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
    @api def toText: Text = ???
  }

  case class CommandTriggerControlRep(s: Exp[CommandTriggerControlRep]) extends MetaAny[CommandTriggerControlRep] {
    @api def success: Bool = ???
    @api def result: FixPt[FALSE,_8,_0] = ???
    @api def ===(that: CommandTriggerControlRep): Bool = ???
    @api def =!=(that: CommandTriggerControlRep): Bool = ???
    @api def toText: Text = ???
  }



  case class CommandTriggerControlReply(srv: Exp[CommandTriggerControl]) extends Op[CommandTriggerControlRep]{
    def mirror(f: Tx) = stage(CommandTriggerControlReply(f(srv)))(EmptyContext)
  }

  
  object CommandTriggerControl {

  }

  object CommandTriggerControlRep {

  }

}

