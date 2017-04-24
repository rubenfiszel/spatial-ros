
package spatial.ros

import forge._
import org.virtualized._

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

  implicit object FileOpenRepType extends Meta[FileOpenRep] {
    def wrapped(x: Exp[FileOpenRep]) = FileOpenRep(x)
    def stagedClass = classOf[FileOpenRep]
    def isPrimitive = false
  }

  case class FileOpen(s: Exp[FileOpen]) extends MetaAny[FileOpen] {
    @api def file_path: Text = ???
    @api def mode: FixPt[FALSE,_8,_0] = ???
    @api def response: FileOpenRep = ???//FileOpenRep(FileOpenReply(s))
    @api def ===(that: FileOpen): Bool = ???
    @api def =!=(that: FileOpen): Bool = ???
    @api def toText: Text = ???
  }

  case class FileOpenRep(s: Exp[FileOpenRep]) extends MetaAny[FileOpenRep] {
    @api def size: FixPt[FALSE,_32,_0] = ???
    @api def success: Bool = ???
    @api def r_errno: FixPt[TRUE,_32,_0] = ???
    @api def ===(that: FileOpenRep): Bool = ???
    @api def =!=(that: FileOpenRep): Bool = ???
    @api def toText: Text = ???
  }

  
case class FileOpen_file_path(srv: Exp[FileOpen]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileOpen_file_path(f(srv)))(EmptyContext)
}

  
case class FileOpen_mode(srv: Exp[FileOpen]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(FileOpen_mode(f(srv)))(EmptyContext)
}

  
case class FileOpenRep_file_path(srv: Exp[FileOpenRep]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileOpenRep_file_path(f(srv)))(EmptyContext)
}

  
case class FileOpenRep_mode(srv: Exp[FileOpenRep]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(FileOpenRep_mode(f(srv)))(EmptyContext)
}

  case class FileOpenReply(srv: Exp[FileOpen]) extends Op[FileOpenRep]{
    def mirror(f: Tx) = stage(FileOpenReply(f(srv)))(EmptyContext)
  }

  
  object FileOpen {

  }

  object FileOpenRep {

  }

}

