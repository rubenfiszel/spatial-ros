
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen

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
    @api def data: MetaArray[FixPt[FALSE,_8,_0]] = MetaArray(stage(FileReadRep_reply_data(s))(ctx))
    @api def success: Bool = Bool(stage(FileReadRep_reply_success(s))(ctx))
    @api def r_errno: FixPt[TRUE,_32,_0] = FixPt(stage(FileReadRep_reply_r_errno(s))(ctx))
    @api def ===(that: FileReadRep): Bool = ???
    @api def =!=(that: FileReadRep): Bool = ???
    @api def toText: Text = textify(this)
  }

  
case class FileRead_file_path(srv: Exp[FileRead]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileRead_file_path(f(srv)))(EmptyContext)
}

  
case class FileRead_offset(srv: Exp[FileRead]) extends Op[FixPt[FALSE,_64,_0]] {
  def mirror(f: Tx) = stage(FileRead_offset(f(srv)))(EmptyContext)
}

  
case class FileRead_size(srv: Exp[FileRead]) extends Op[FixPt[FALSE,_64,_0]] {
  def mirror(f: Tx) = stage(FileRead_size(f(srv)))(EmptyContext)
}

  
case class FileReadRep_reply_data(srv: Exp[FileReadRep]) extends Op[MetaArray[FixPt[FALSE,_8,_0]]] {
  def mirror(f: Tx) = stage(FileReadRep_reply_data(f(srv)))(EmptyContext)
}

  
case class FileReadRep_reply_success(srv: Exp[FileReadRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(FileReadRep_reply_success(f(srv)))(EmptyContext)
}

  
case class FileReadRep_reply_r_errno(srv: Exp[FileReadRep]) extends Op[FixPt[TRUE,_32,_0]] {
  def mirror(f: Tx) = stage(FileReadRep_reply_r_errno(f(srv)))(EmptyContext)
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

trait ScalaGenFileRead extends ScalaCodegen{
}

