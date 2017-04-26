
package spatial.ros

import forge._
import org.virtualized._
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait FileOpenApi extends FileOpenExp {
  self: RosApi =>

}

trait FileOpenExp {
  self: RosExp =>
  
  implicit object FileOpenType extends Meta[FileOpen] {
    def wrapped(x: Exp[FileOpen]) = FileOpen(x)
    def stagedClass = classOf[FileOpen]
    def isPrimitive = false
  }

  implicit object FileOpenSrv extends Srv[FileOpen] {
    type Response = FileOpenRep
    def response(srv: FileOpen) = srv.response
  }

  implicit object FileOpenRepType extends Meta[FileOpenRep] {
    def wrapped(x: Exp[FileOpenRep]) = FileOpenRep(x)
    def stagedClass = classOf[FileOpenRep]
    def isPrimitive = false
  }

  case class FileOpen(s: Exp[FileOpen]) extends MetaAny[FileOpen] {
    @api def file_path: Text = Text(stage(FileOpen_file_path(s))(ctx))
    @api def mode: FixPt[FALSE,_8,_0] = FixPt(stage(FileOpen_mode(s))(ctx))
    @api def response: FileOpenRep = FileOpenRep(stage(FileOpenReply(s))(ctx))
    @api def ===(that: FileOpen): Bool = ???
    @api def =!=(that: FileOpen): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class FileOpenRep(s: Exp[FileOpenRep]) extends MetaAny[FileOpenRep] {
    @api def size: FixPt[FALSE,_32,_0] = FixPt(stage(FileOpenRep_size(s))(ctx))
    @api def success: Bool = Bool(stage(FileOpenRep_success(s))(ctx))
    @api def r_errno: FixPt[TRUE,_32,_0] = FixPt(stage(FileOpenRep_r_errno(s))(ctx))
    @api def ===(that: FileOpenRep): Bool = ???
    @api def =!=(that: FileOpenRep): Bool = ???
    @api def toText: Text = textify(this)
  }

  
case class FileOpen_file_path(msg: Exp[FileOpen]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileOpen_file_path(f(msg)))(EmptyContext)
}

  
case class FileOpen_mode(msg: Exp[FileOpen]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(FileOpen_mode(f(msg)))(EmptyContext)
}

  
case class FileOpenRep_size(srv: Exp[FileOpenRep]) extends Op[FixPt[FALSE,_32,_0]] {
  def mirror(f: Tx) = stage(FileOpenRep_size(f(srv)))(EmptyContext)
}

  
case class FileOpenRep_success(srv: Exp[FileOpenRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(FileOpenRep_success(f(srv)))(EmptyContext)
}

  
case class FileOpenRep_r_errno(srv: Exp[FileOpenRep]) extends Op[FixPt[TRUE,_32,_0]] {
  def mirror(f: Tx) = stage(FileOpenRep_r_errno(f(srv)))(EmptyContext)
}

  case class FileOpenReply(srv: Exp[FileOpen]) extends Op[FileOpenRep]{
    def mirror(f: Tx) = stage(FileOpenReply(f(srv)))(EmptyContext)
  }
  case class NewFileOpen(file_path: Exp[Text], mode: Exp[FixPt[FALSE,_8,_0]]) extends Op[FileOpen] {
    def mirror(f: Tx) = stage(NewFileOpen(f(file_path), f(mode)))(EmptyContext)
  }

  
  object FileOpen {

  @api def apply(file_path: Text, mode: FixPt[FALSE,_8,_0]): FileOpen = FileOpen(stage(NewFileOpen(file_path.s, mode.s))(ctx))
  }

  object FileOpenRep {

  }

}

trait ScalaGenFileOpen extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case FileOpen_file_path(msg) => emit(src"val $lhs = $msg.file_path")
    case FileOpen_mode(msg) => emit(src"val $lhs = $msg.mode")
    case FileOpenRep_size(msg) => emit(src"val $lhs = $msg.size")
    case FileOpenRep_success(msg) => emit(src"val $lhs = $msg.success")
    case FileOpenRep_r_errno(msg) => emit(src"val $lhs = $msg.r_errno")
    case NewFileOpen(file_path, mode) =>
      emit(src"val $lhs = FileOpen($file_path, $mode)")
    case FileOpenReply(srv) =>
      emit(src"val $lhs = $srv.response")
    case _ => super.emitNode(lhs, rhs)
  }

}

