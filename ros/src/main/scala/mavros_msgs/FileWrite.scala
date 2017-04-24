
package spatial.ros

import forge._
import org.virtualized._

trait FileWriteApi extends FileWriteExp {
  self: RosApi =>

}

trait FileWriteExp {
  self: RosExp =>
  
  
case class FileWrite_file_path(srv: Exp[FileWrite]) extends Op[Text] {
  def mirror(f: Tx) = ???//(FileWrite_file_path(f(srv)): Exp[Text])
}

  
case class FileWrite_offset(srv: Exp[FileWrite]) extends Op[FixPt[FALSE,_64,_0]] {
  def mirror(f: Tx) = ???//(FileWrite_offset(f(srv)): Exp[FixPt[FALSE,_64,_0]])
}

  
case class FileWrite_data(srv: Exp[FileWrite]) extends Op[MetaArray[FixPt[FALSE,_8,_0]]] {
  def mirror(f: Tx) = ???//(FileWrite_data(f(srv)): Exp[MetaArray[FixPt[FALSE,_8,_0]]])
}

  
case class FileWriteRep_file_path(srv: Exp[FileWriteRep]) extends Op[Text] {
  def mirror(f: Tx) = ???//FileWriteRep_file_path(f(srv))
}

  
case class FileWriteRep_offset(srv: Exp[FileWriteRep]) extends Op[FixPt[FALSE,_64,_0]] {
  def mirror(f: Tx) = ???//FileWriteRep_offset(f(srv))
}

  
case class FileWriteRep_data(srv: Exp[FileWriteRep]) extends Op[MetaArray[FixPt[FALSE,_8,_0]]] {
  def mirror(f: Tx) = ???//FileWriteRep_data(f(srv))
}

  case class FileWriteReply(srv: Exp[FileWrite]) extends Op[FileWriteRep]{
    def mirror(f: Tx) = ???//FileWriteReply(f(srv))
  }

  implicit object FileWriteType extends Meta[FileWrite] {
    def wrapped(x: Exp[FileWrite]) = FileWrite(x)
    def stagedClass = classOf[FileWrite]
    def isPrimitive = false
  }

  implicit object FileWriteRepType extends Meta[FileWriteRep] {
    def wrapped(x: Exp[FileWriteRep]) = FileWriteRep(x)
    def stagedClass = classOf[FileWriteRep]
    def isPrimitive = false
  }

  case class FileWrite(s: Exp[FileWrite]) extends MetaAny[FileWrite] {
    @api def file_path: Text = ???
    @api def offset: FixPt[FALSE,_64,_0] = ???
    @api def data: MetaArray[FixPt[FALSE,_8,_0]] = ???
    @api def response: FileWriteRep = ???//FileWriteRep(FileWriteReply(s))
    @api def ===(that: FileWrite): Bool = ???
    @api def =!=(that: FileWrite): Bool = ???
    @api def toText: Text = ???
  }

  case class FileWriteRep(s: Exp[FileWriteRep]) extends MetaAny[FileWriteRep] {
    @api def success: Bool = ???
    @api def r_errno: FixPt[TRUE,_32,_0] = ???
    @api def ===(that: FileWriteRep): Bool = ???
    @api def =!=(that: FileWriteRep): Bool = ???
    @api def toText: Text = ???
  }
  
  object FileWrite {

  }

  object FileWriteRep {

  }

}

