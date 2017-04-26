
package spatial.ros

import forge._
import org.virtualized._
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait FileCloseApi extends FileCloseExp {
  self: RosApi =>

}

trait FileCloseExp {
  self: RosExp =>
  
  implicit object FileCloseType extends Meta[FileClose] {
    def wrapped(x: Exp[FileClose]) = FileClose(x)
    def stagedClass = classOf[FileClose]
    def isPrimitive = false
  }

  implicit object FileCloseSrv extends Srv[FileClose] {
    type Response = FileCloseRep
    def response(srv: FileClose) = srv.response
  }

  implicit object FileCloseRepType extends Meta[FileCloseRep] {
    def wrapped(x: Exp[FileCloseRep]) = FileCloseRep(x)
    def stagedClass = classOf[FileCloseRep]
    def isPrimitive = false
  }

  case class FileClose(s: Exp[FileClose]) extends MetaAny[FileClose] {
    @api def file_path: Text = Text(stage(FileClose_file_path(s))(ctx))
    @api def response: FileCloseRep = FileCloseRep(stage(FileCloseReply(s))(ctx))
    @api def ===(that: FileClose): Bool = ???
    @api def =!=(that: FileClose): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class FileCloseRep(s: Exp[FileCloseRep]) extends MetaAny[FileCloseRep] {
    @api def success: Bool = Bool(stage(FileCloseRep_success(s))(ctx))
    @api def r_errno: FixPt[TRUE,_32,_0] = FixPt(stage(FileCloseRep_r_errno(s))(ctx))
    @api def ===(that: FileCloseRep): Bool = ???
    @api def =!=(that: FileCloseRep): Bool = ???
    @api def toText: Text = textify(this)
  }

  
case class FileClose_file_path(msg: Exp[FileClose]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileClose_file_path(f(msg)))(EmptyContext)
}

  
case class FileCloseRep_success(srv: Exp[FileCloseRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(FileCloseRep_success(f(srv)))(EmptyContext)
}

  
case class FileCloseRep_r_errno(srv: Exp[FileCloseRep]) extends Op[FixPt[TRUE,_32,_0]] {
  def mirror(f: Tx) = stage(FileCloseRep_r_errno(f(srv)))(EmptyContext)
}

  case class FileCloseReply(srv: Exp[FileClose]) extends Op[FileCloseRep]{
    def mirror(f: Tx) = stage(FileCloseReply(f(srv)))(EmptyContext)
  }
  case class NewFileClose(file_path: Exp[Text]) extends Op[FileClose] {
    def mirror(f: Tx) = stage(NewFileClose(f(file_path)))(EmptyContext)
  }

  
  object FileClose {

  @api def apply(file_path: Text): FileClose = FileClose(stage(NewFileClose(file_path.s))(ctx))
  }

  object FileCloseRep {

  }

}

trait ScalaGenFileClose extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case FileClose_file_path(msg) => emit(src"val $lhs = $msg.file_path")
    case FileCloseRep_success(msg) => emit(src"val $lhs = $msg.success")
    case FileCloseRep_r_errno(msg) => emit(src"val $lhs = $msg.r_errno")
    case NewFileClose(file_path) =>
      emit(src"val $lhs = FileClose($file_path)")
    case FileCloseReply(srv) =>
      emit(src"val $lhs = $srv.response")
    case _ => super.emitNode(lhs, rhs)
  }

}

