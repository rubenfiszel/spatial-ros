
package spatial.ros

import forge._
import org.virtualized._
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait FileRenameApi extends FileRenameExp {
  self: RosApi =>

}

trait FileRenameExp {
  self: RosExp =>
  
  implicit object FileRenameType extends Meta[FileRename] {
    def wrapped(x: Exp[FileRename]) = FileRename(x)
    def stagedClass = classOf[FileRename]
    def isPrimitive = false
  }

  implicit object FileRenameSrv extends Srv[FileRename] {
    type Response = FileRenameRep
    def response(srv: FileRename) = srv.response
  }

  implicit object FileRenameRepType extends Meta[FileRenameRep] {
    def wrapped(x: Exp[FileRenameRep]) = FileRenameRep(x)
    def stagedClass = classOf[FileRenameRep]
    def isPrimitive = false
  }

  case class FileRename(s: Exp[FileRename]) extends MetaAny[FileRename] {
    @api def old_path: Text = Text(stage(FileRename_old_path(s))(ctx))
    @api def new_path: Text = Text(stage(FileRename_new_path(s))(ctx))
    @api def response: FileRenameRep = FileRenameRep(stage(FileRenameReply(s))(ctx))
    @api def ===(that: FileRename): Bool = ???
    @api def =!=(that: FileRename): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class FileRenameRep(s: Exp[FileRenameRep]) extends MetaAny[FileRenameRep] {
    @api def success: Bool = Bool(stage(FileRenameRep_success(s))(ctx))
    @api def r_errno: FixPt[TRUE,_32,_0] = FixPt(stage(FileRenameRep_r_errno(s))(ctx))
    @api def ===(that: FileRenameRep): Bool = ???
    @api def =!=(that: FileRenameRep): Bool = ???
    @api def toText: Text = textify(this)
  }

  
case class FileRename_old_path(msg: Exp[FileRename]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileRename_old_path(f(msg)))(EmptyContext)
}

  
case class FileRename_new_path(msg: Exp[FileRename]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileRename_new_path(f(msg)))(EmptyContext)
}

  
case class FileRenameRep_success(srv: Exp[FileRenameRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(FileRenameRep_success(f(srv)))(EmptyContext)
}

  
case class FileRenameRep_r_errno(srv: Exp[FileRenameRep]) extends Op[FixPt[TRUE,_32,_0]] {
  def mirror(f: Tx) = stage(FileRenameRep_r_errno(f(srv)))(EmptyContext)
}

  case class FileRenameReply(srv: Exp[FileRename]) extends Op[FileRenameRep]{
    def mirror(f: Tx) = stage(FileRenameReply(f(srv)))(EmptyContext)
  }
  case class NewFileRename(old_path: Exp[Text], new_path: Exp[Text]) extends Op[FileRename] {
    def mirror(f: Tx) = stage(NewFileRename(f(old_path), f(new_path)))(EmptyContext)
  }

  
  object FileRename {

  @api def apply(old_path: Text, new_path: Text): FileRename = FileRename(stage(NewFileRename(old_path.s, new_path.s))(ctx))
  }

  object FileRenameRep {

  }

}

trait ScalaGenFileRename extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case FileRename_old_path(msg) => emit(src"val $lhs = $msg.old_path")
    case FileRename_new_path(msg) => emit(src"val $lhs = $msg.new_path")
    case FileRenameRep_success(msg) => emit(src"val $lhs = $msg.success")
    case FileRenameRep_r_errno(msg) => emit(src"val $lhs = $msg.r_errno")
    case NewFileRename(old_path, new_path) =>
      emit(src"val $lhs = FileRename($old_path, $new_path)")
    case FileRenameReply(srv) =>
      emit(src"val $lhs = $srv.response")
    case _ => super.emitNode(lhs, rhs)
  }

}

