
package spatial.ros

import forge._
import org.virtualized._
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait FileReadApi extends FileReadExp {
  self: RosApi =>

}

trait FileReadExp {
  self: RosExp =>
  
  implicit object FileReadType extends Meta[FileRead] {
    def wrapped(x: Exp[FileRead]) = FileRead(x)
    def stagedClass = classOf[FileRead]
    def isPrimitive = false
  }

  implicit object FileReadSrv extends Srv[FileRead] {
    type Response = FileReadRep
    def response(srv: FileRead) = srv.response
  }

  implicit object FileReadRepType extends Meta[FileReadRep] {
    def wrapped(x: Exp[FileReadRep]) = FileReadRep(x)
    def stagedClass = classOf[FileReadRep]
    def isPrimitive = false
  }

  case class FileRead(s: Exp[FileRead]) extends MetaAny[FileRead] {
    @api def file_path: Text = Text(stage(FileRead_file_path(s))(ctx))
    @api def offset: FixPt[FALSE,_64,_0] = FixPt(stage(FileRead_offset(s))(ctx))
    @api def size: FixPt[FALSE,_64,_0] = FixPt(stage(FileRead_size(s))(ctx))
    @api def response: FileReadRep = FileReadRep(stage(FileReadReply(s))(ctx))
    @api def ===(that: FileRead): Bool = ???
    @api def =!=(that: FileRead): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class FileReadRep(s: Exp[FileReadRep]) extends MetaAny[FileReadRep] {
    @api def data: MetaArray[FixPt[FALSE,_8,_0]] = MetaArray(stage(FileReadRep_data(s))(ctx))
    @api def success: Bool = Bool(stage(FileReadRep_success(s))(ctx))
    @api def r_errno: FixPt[TRUE,_32,_0] = FixPt(stage(FileReadRep_r_errno(s))(ctx))
    @api def ===(that: FileReadRep): Bool = ???
    @api def =!=(that: FileReadRep): Bool = ???
    @api def toText: Text = textify(this)
  }

  
case class FileRead_file_path(msg: Exp[FileRead]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileRead_file_path(f(msg)))(EmptyContext)
}

  
case class FileRead_offset(msg: Exp[FileRead]) extends Op[FixPt[FALSE,_64,_0]] {
  def mirror(f: Tx) = stage(FileRead_offset(f(msg)))(EmptyContext)
}

  
case class FileRead_size(msg: Exp[FileRead]) extends Op[FixPt[FALSE,_64,_0]] {
  def mirror(f: Tx) = stage(FileRead_size(f(msg)))(EmptyContext)
}

  
case class FileReadRep_data(srv: Exp[FileReadRep]) extends Op[MetaArray[FixPt[FALSE,_8,_0]]] {
  def mirror(f: Tx) = stage(FileReadRep_data(f(srv)))(EmptyContext)
}

  
case class FileReadRep_success(srv: Exp[FileReadRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(FileReadRep_success(f(srv)))(EmptyContext)
}

  
case class FileReadRep_r_errno(srv: Exp[FileReadRep]) extends Op[FixPt[TRUE,_32,_0]] {
  def mirror(f: Tx) = stage(FileReadRep_r_errno(f(srv)))(EmptyContext)
}

  case class FileReadReply(srv: Exp[FileRead]) extends Op[FileReadRep]{
    def mirror(f: Tx) = stage(FileReadReply(f(srv)))(EmptyContext)
  }
  case class NewFileRead(file_path: Exp[Text], offset: Exp[FixPt[FALSE,_64,_0]], size: Exp[FixPt[FALSE,_64,_0]]) extends Op[FileRead] {
    def mirror(f: Tx) = stage(NewFileRead(f(file_path), f(offset), f(size)))(EmptyContext)
  }

  
  object FileRead {

  @api def apply(file_path: Text, offset: FixPt[FALSE,_64,_0], size: FixPt[FALSE,_64,_0]): FileRead = FileRead(stage(NewFileRead(file_path.s, offset.s, size.s))(ctx))
  }

  object FileReadRep {

  }

}

trait ScalaGenFileRead extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case FileRead_file_path(msg) => emit(src"val $lhs = $msg.file_path")
    case FileRead_offset(msg) => emit(src"val $lhs = $msg.offset")
    case FileRead_size(msg) => emit(src"val $lhs = $msg.size")
    case FileReadRep_data(msg) => emit(src"val $lhs = $msg.data")
    case FileReadRep_success(msg) => emit(src"val $lhs = $msg.success")
    case FileReadRep_r_errno(msg) => emit(src"val $lhs = $msg.r_errno")
    case NewFileRead(file_path, offset, size) =>
      emit(src"val $lhs = FileRead($file_path, $offset, $size)")
    case FileReadReply(srv) =>
      emit(src"val $lhs = $srv.response")
    case _ => super.emitNode(lhs, rhs)
  }

}

