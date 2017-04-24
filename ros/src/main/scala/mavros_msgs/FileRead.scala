
package spatial.ros

import forge._
import org.virtualized._

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
    @api def file_path: Text = ???
    @api def offset: FixPt[FALSE,_64,_0] = ???
    @api def size: FixPt[FALSE,_64,_0] = ???
    @api def response: FileReadRep = ???//FileReadRep(FileReadReply(s))
    @api def ===(that: FileRead): Bool = ???
    @api def =!=(that: FileRead): Bool = ???
    @api def toText: Text = ???
  }

  case class FileReadRep(s: Exp[FileReadRep]) extends MetaAny[FileReadRep] {
    @api def data: MetaArray[FixPt[FALSE,_8,_0]] = ???
    @api def success: Bool = ???
    @api def r_errno: FixPt[TRUE,_32,_0] = ???
    @api def ===(that: FileReadRep): Bool = ???
    @api def =!=(that: FileReadRep): Bool = ???
    @api def toText: Text = ???
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

  
case class FileReadRep_file_path(srv: Exp[FileReadRep]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileReadRep_file_path(f(srv)))(EmptyContext)
}

  
case class FileReadRep_offset(srv: Exp[FileReadRep]) extends Op[FixPt[FALSE,_64,_0]] {
  def mirror(f: Tx) = stage(FileReadRep_offset(f(srv)))(EmptyContext)
}

  
case class FileReadRep_size(srv: Exp[FileReadRep]) extends Op[FixPt[FALSE,_64,_0]] {
  def mirror(f: Tx) = stage(FileReadRep_size(f(srv)))(EmptyContext)
}

  case class FileReadReply(srv: Exp[FileRead]) extends Op[FileReadRep]{
    def mirror(f: Tx) = stage(FileReadReply(f(srv)))(EmptyContext)
  }

  
  object FileRead {

  }

  object FileReadRep {

  }

}

