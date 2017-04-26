
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen
import spatial.ros.codegen.scalagen.RosScalaCodegen

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

  implicit object CommandCodeMsg extends Msg[CommandCode]

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

trait ScalaGenCommandCode extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {

    case NewCommandCode() =>
      emit(src"val $lhs = CommandCode()")
    case _ => super.emitNode(lhs, rhs)
  }

}


