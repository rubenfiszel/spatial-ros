
package spatial.ros

import forge._
import org.virtualized._

trait FileCloseApi extends FileCloseExp {
  self: RosApi =>

}

trait FileCloseExp {
  self: RosExp =>
  
  
case class FileClose_file_path(srv: Exp[FileClose]) extends Op[Text] {
  def mirror(f: Tx) = ???//(FileClose_file_path(f(srv)): Exp[Text])
}

  
case class FileCloseRep_file_path(srv: Exp[FileCloseRep]) extends Op[Text] {
  def mirror(f: Tx) = ???//FileCloseRep_file_path(f(srv))
}

  case class FileCloseReply(srv: Exp[FileClose]) extends Op[FileCloseRep]{
    def mirror(f: Tx) = ???//FileCloseReply(f(srv))
  }

  implicit object FileCloseType extends Meta[FileClose] {
    def wrapped(x: Exp[FileClose]) = FileClose(x)
    def stagedClass = classOf[FileClose]
    def isPrimitive = false
  }

  implicit object FileCloseRepType extends Meta[FileCloseRep] {
    def wrapped(x: Exp[FileCloseRep]) = FileCloseRep(x)
    def stagedClass = classOf[FileCloseRep]
    def isPrimitive = false
  }

  case class FileClose(s: Exp[FileClose]) extends MetaAny[FileClose] {
    @api def file_path: Text = ???
    @api def response: FileCloseRep = ???//FileCloseRep(FileCloseReply(s))
    @api def ===(that: FileClose): Bool = ???
    @api def =!=(that: FileClose): Bool = ???
    @api def toText: Text = ???
  }

  case class FileCloseRep(s: Exp[FileCloseRep]) extends MetaAny[FileCloseRep] {
    @api def success: Bool = ???
    @api def r_errno: FixPt[TRUE,_32,_0] = ???
    @api def ===(that: FileCloseRep): Bool = ???
    @api def =!=(that: FileCloseRep): Bool = ???
    @api def toText: Text = ???
  }
  
  object FileClose {

  }

  object FileCloseRep {

  }

}

