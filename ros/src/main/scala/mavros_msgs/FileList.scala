
package spatial.ros

import forge._
import org.virtualized._
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait FileListApi extends FileListExp {
  self: RosApi =>

}

trait FileListExp {
  self: RosExp =>
  
  implicit object FileListType extends Meta[FileList] {
    def wrapped(x: Exp[FileList]) = FileList(x)
    def stagedClass = classOf[FileList]
    def isPrimitive = false
  }

  implicit object FileListSrv extends Srv[FileList] {
    type Response = FileListRep
    def response(srv: FileList) = srv.response
  }

  implicit object FileListRepType extends Meta[FileListRep] {
    def wrapped(x: Exp[FileListRep]) = FileListRep(x)
    def stagedClass = classOf[FileListRep]
    def isPrimitive = false
  }

  case class FileList(s: Exp[FileList]) extends MetaAny[FileList] {
    @api def dir_path: Text = Text(stage(FileList_dir_path(s))(ctx))
    @api def response: FileListRep = FileListRep(stage(FileListReply(s))(ctx))
    @api def ===(that: FileList): Bool = ???
    @api def =!=(that: FileList): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class FileListRep(s: Exp[FileListRep]) extends MetaAny[FileListRep] {
    @api def list: MetaArray[FileEntry] = MetaArray(stage(FileListRep_list(s))(ctx))
    @api def success: Bool = Bool(stage(FileListRep_success(s))(ctx))
    @api def r_errno: FixPt[TRUE,_32,_0] = FixPt(stage(FileListRep_r_errno(s))(ctx))
    @api def ===(that: FileListRep): Bool = ???
    @api def =!=(that: FileListRep): Bool = ???
    @api def toText: Text = textify(this)
  }

  
case class FileList_dir_path(msg: Exp[FileList]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileList_dir_path(f(msg)))(EmptyContext)
}

  
case class FileListRep_list(srv: Exp[FileListRep]) extends Op[MetaArray[FileEntry]] {
  def mirror(f: Tx) = stage(FileListRep_list(f(srv)))(EmptyContext)
}

  
case class FileListRep_success(srv: Exp[FileListRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(FileListRep_success(f(srv)))(EmptyContext)
}

  
case class FileListRep_r_errno(srv: Exp[FileListRep]) extends Op[FixPt[TRUE,_32,_0]] {
  def mirror(f: Tx) = stage(FileListRep_r_errno(f(srv)))(EmptyContext)
}

  case class FileListReply(srv: Exp[FileList]) extends Op[FileListRep]{
    def mirror(f: Tx) = stage(FileListReply(f(srv)))(EmptyContext)
  }
  case class NewFileList(dir_path: Exp[Text]) extends Op[FileList] {
    def mirror(f: Tx) = stage(NewFileList(f(dir_path)))(EmptyContext)
  }

  
  object FileList {

  @api def apply(dir_path: Text): FileList = FileList(stage(NewFileList(dir_path.s))(ctx))
  }

  object FileListRep {

  }

}

trait ScalaGenFileList extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case FileList_dir_path(msg) => emit(src"val $lhs = $msg.dir_path")
    case FileListRep_list(msg) => emit(src"val $lhs = $msg.list")
    case FileListRep_success(msg) => emit(src"val $lhs = $msg.success")
    case FileListRep_r_errno(msg) => emit(src"val $lhs = $msg.r_errno")
    case NewFileList(dir_path) =>
      emit(src"val $lhs = FileList($dir_path)")
    case FileListReply(srv) =>
      emit(src"val $lhs = $srv.response")
    case _ => super.emitNode(lhs, rhs)
  }

}

