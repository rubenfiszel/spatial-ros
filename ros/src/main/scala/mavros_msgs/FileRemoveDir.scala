
package spatial.ros

import forge._
import org.virtualized._
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait FileRemoveDirApi extends FileRemoveDirExp {
  self: RosApi =>

}

trait FileRemoveDirExp {
  self: RosExp =>
  
  implicit object FileRemoveDirType extends Meta[FileRemoveDir] {
    def wrapped(x: Exp[FileRemoveDir]) = FileRemoveDir(x)
    def stagedClass = classOf[FileRemoveDir]
    def isPrimitive = false
  }

  implicit object FileRemoveDirSrv extends Srv[FileRemoveDir] {
    type Response = FileRemoveDirRep
    def response(srv: FileRemoveDir) = srv.response
  }

  implicit object FileRemoveDirRepType extends Meta[FileRemoveDirRep] {
    def wrapped(x: Exp[FileRemoveDirRep]) = FileRemoveDirRep(x)
    def stagedClass = classOf[FileRemoveDirRep]
    def isPrimitive = false
  }

  case class FileRemoveDir(s: Exp[FileRemoveDir]) extends MetaAny[FileRemoveDir] {
    @api def dir_path: Text = Text(stage(FileRemoveDir_dir_path(s))(ctx))
    @api def response: FileRemoveDirRep = FileRemoveDirRep(stage(FileRemoveDirReply(s))(ctx))
    @api def ===(that: FileRemoveDir): Bool = ???
    @api def =!=(that: FileRemoveDir): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class FileRemoveDirRep(s: Exp[FileRemoveDirRep]) extends MetaAny[FileRemoveDirRep] {
    @api def success: Bool = Bool(stage(FileRemoveDirRep_success(s))(ctx))
    @api def r_errno: FixPt[TRUE,_32,_0] = FixPt(stage(FileRemoveDirRep_r_errno(s))(ctx))
    @api def ===(that: FileRemoveDirRep): Bool = ???
    @api def =!=(that: FileRemoveDirRep): Bool = ???
    @api def toText: Text = textify(this)
  }

  
case class FileRemoveDir_dir_path(msg: Exp[FileRemoveDir]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileRemoveDir_dir_path(f(msg)))(EmptyContext)
}

  
case class FileRemoveDirRep_success(srv: Exp[FileRemoveDirRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(FileRemoveDirRep_success(f(srv)))(EmptyContext)
}

  
case class FileRemoveDirRep_r_errno(srv: Exp[FileRemoveDirRep]) extends Op[FixPt[TRUE,_32,_0]] {
  def mirror(f: Tx) = stage(FileRemoveDirRep_r_errno(f(srv)))(EmptyContext)
}

  case class FileRemoveDirReply(srv: Exp[FileRemoveDir]) extends Op[FileRemoveDirRep]{
    def mirror(f: Tx) = stage(FileRemoveDirReply(f(srv)))(EmptyContext)
  }
  case class NewFileRemoveDir(dir_path: Exp[Text]) extends Op[FileRemoveDir] {
    def mirror(f: Tx) = stage(NewFileRemoveDir(f(dir_path)))(EmptyContext)
  }

  
  object FileRemoveDir {

  @api def apply(dir_path: Text): FileRemoveDir = FileRemoveDir(stage(NewFileRemoveDir(dir_path.s))(ctx))
  }

  object FileRemoveDirRep {

  }

}

trait ScalaGenFileRemoveDir extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case FileRemoveDir_dir_path(msg) => emit(src"val $lhs = $msg.dir_path")
    case FileRemoveDirRep_success(msg) => emit(src"val $lhs = $msg.success")
    case FileRemoveDirRep_r_errno(msg) => emit(src"val $lhs = $msg.r_errno")
    case NewFileRemoveDir(dir_path) =>
      emit(src"val $lhs = FileRemoveDir($dir_path)")
    case FileRemoveDirReply(srv) =>
      emit(src"val $lhs = $srv.response")
    case _ => super.emitNode(lhs, rhs)
  }

}

