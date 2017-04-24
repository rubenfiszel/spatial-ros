
package spatial.ros

import forge._
import org.virtualized._

trait CommandBoolApi extends CommandBoolExp {
  self: RosApi =>

}

trait CommandBoolExp {
  self: RosExp =>
  
  
case class CommandBool_value(srv: Exp[CommandBool]) extends Op[Bool] {
  def mirror(f: Tx) = ???//(CommandBool_value(f(srv)): Exp[Bool])
}

  
case class CommandBoolRep_value(srv: Exp[CommandBoolRep]) extends Op[Bool] {
  def mirror(f: Tx) = ???//CommandBoolRep_value(f(srv))
}

  case class CommandBoolReply(srv: Exp[CommandBool]) extends Op[CommandBoolRep]{
    def mirror(f: Tx) = ???//CommandBoolReply(f(srv))
  }

  implicit object CommandBoolType extends Meta[CommandBool] {
    def wrapped(x: Exp[CommandBool]) = CommandBool(x)
    def stagedClass = classOf[CommandBool]
    def isPrimitive = false
  }

  implicit object CommandBoolRepType extends Meta[CommandBoolRep] {
    def wrapped(x: Exp[CommandBoolRep]) = CommandBoolRep(x)
    def stagedClass = classOf[CommandBoolRep]
    def isPrimitive = false
  }

  case class CommandBool(s: Exp[CommandBool]) extends MetaAny[CommandBool] {
    @api def value: Bool = ???
    @api def response: CommandBoolRep = ???//CommandBoolRep(CommandBoolReply(s))
    @api def ===(that: CommandBool): Bool = ???
    @api def =!=(that: CommandBool): Bool = ???
    @api def toText: Text = ???
  }

  case class CommandBoolRep(s: Exp[CommandBoolRep]) extends MetaAny[CommandBoolRep] {
    @api def success: Bool = ???
    @api def result: FixPt[FALSE,_8,_0] = ???
    @api def ===(that: CommandBoolRep): Bool = ???
    @api def =!=(that: CommandBoolRep): Bool = ???
    @api def toText: Text = ???
  }
  
  object CommandBool {

  }

  object CommandBoolRep {

  }

}

