
package spatial.ros

import forge._
import org.virtualized._
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait FileRemoveApi extends FileRemoveExp {
  self: RosApi =>

}

trait FileRemoveExp {
  self: RosExp =>
  
  implicit object FileRemoveType extends Meta[FileRemove] {
    def wrapped(x: Exp[FileRemove]) = FileRemove(x)
    def stagedClass = classOf[FileRemove]
    def isPrimitive = false
  }

  implicit object FileRemoveSrv extends Srv[FileRemove] {
    type Response = FileRemoveRep
    def response(srv: FileRemove) = srv.response
  }

  implicit object FileRemoveRepType extends Meta[FileRemoveRep] {
    def wrapped(x: Exp[FileRemoveRep]) = FileRemoveRep(x)
    def stagedClass = classOf[FileRemoveRep]
    def isPrimitive = false
  }

  case class FileRemove(s: Exp[FileRemove]) extends MetaAny[FileRemove] {
    @api def file_path: Text = Text(stage(FileRemove_file_path(s))(ctx))
    @api def response: FileRemoveRep = FileRemoveRep(stage(FileRemoveReply(s))(ctx))
    @api def ===(that: FileRemove): Bool = ???
    @api def =!=(that: FileRemove): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class FileRemoveRep(s: Exp[FileRemoveRep]) extends MetaAny[FileRemoveRep] {
    @api def success: Bool = Bool(stage(FileRemoveRep_success(s))(ctx))
    @api def r_errno: FixPt[TRUE,_32,_0] = FixPt(stage(FileRemoveRep_r_errno(s))(ctx))
    @api def ===(that: FileRemoveRep): Bool = ???
    @api def =!=(that: FileRemoveRep): Bool = ???
    @api def toText: Text = textify(this)
  }

  
case class FileRemove_file_path(msg: Exp[FileRemove]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileRemove_file_path(f(msg)))(EmptyContext)
}

  
case class FileRemoveRep_success(srv: Exp[FileRemoveRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(FileRemoveRep_success(f(srv)))(EmptyContext)
}

  
case class FileRemoveRep_r_errno(srv: Exp[FileRemoveRep]) extends Op[FixPt[TRUE,_32,_0]] {
  def mirror(f: Tx) = stage(FileRemoveRep_r_errno(f(srv)))(EmptyContext)
}

  case class FileRemoveReply(srv: Exp[FileRemove]) extends Op[FileRemoveRep]{
    def mirror(f: Tx) = stage(FileRemoveReply(f(srv)))(EmptyContext)
  }
  case class NewFileRemove(file_path: Exp[Text]) extends Op[FileRemove] {
    def mirror(f: Tx) = stage(NewFileRemove(f(file_path)))(EmptyContext)
  }

  
  object FileRemove {

  @api def apply(file_path: Text): FileRemove = FileRemove(stage(NewFileRemove(file_path.s))(ctx))
  }

  object FileRemoveRep {

  }

}

trait ScalaGenFileRemove extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case FileRemove_file_path(msg) => emit(src"val $lhs = $msg.file_path")
    case FileRemoveRep_success(msg) => emit(src"val $lhs = $msg.success")
    case FileRemoveRep_r_errno(msg) => emit(src"val $lhs = $msg.r_errno")
    case NewFileRemove(file_path) =>
      emit(src"val $lhs = FileRemove($file_path)")
    case FileRemoveReply(srv) =>
      emit(src"val $lhs = $srv.response")
    case _ => super.emitNode(lhs, rhs)
  }

}

