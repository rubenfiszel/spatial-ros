
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen

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
    @api def toText: Text = textify(this)
  }


  case class NewCommandCode() extends Op[CommandCode] {
    def mirror(f: Tx) = stage(NewCommandCode())(EmptyContext)
  }

  object CommandCode {

  @api def apply(): CommandCode = CommandCode(stage(NewCommandCode())(ctx))


  }

}

trait ScalaGenCommandCode extends ScalaCodegen{
  override def emitFileHeader() = {
//    emit(src"import DataImplicits._")
    super.emitFileHeader()
  }
}

