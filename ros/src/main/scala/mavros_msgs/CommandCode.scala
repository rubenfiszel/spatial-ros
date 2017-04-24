package spatial.ros

import forge._
import org.virtualized._

trait CommandCodeApi extends CommandCodeExp {
    self: RosApi =>

}

trait CommandCodeExp {
    self: RosExp =>

      implicit object CommandCodeType extends Meta[CommandCode] {
    def wrapped(x: Exp[CommandCode]) = CommandCode(x)
    def stagedClass = classOf[CommandCode]
    def isPrimitive = false
  }
    case class CommandCode(s: Exp[CommandCode]) extends MetaAny[CommandCode] {

    @api def ===(that: CommandCode) = ??? 
    @api def =!=(that: CommandCode) = ??? 
    @api def toText: Text = ??? 
  }
}

object CommandCode{
}
