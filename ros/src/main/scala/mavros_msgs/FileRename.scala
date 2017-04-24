
package spatial.ros

import forge._
import org.virtualized._

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

  implicit object FileRenameRepType extends Meta[FileRenameRep] {
    def wrapped(x: Exp[FileRenameRep]) = FileRenameRep(x)
    def stagedClass = classOf[FileRenameRep]
    def isPrimitive = false
  }

  case class FileRename(s: Exp[FileRename]) extends MetaAny[FileRename] {
    @api def old_path: Text = ???
    @api def new_path: Text = ???
    @api def response: FileRenameRep = ???//FileRenameRep(FileRenameReply(s))
    @api def ===(that: FileRename): Bool = ???
    @api def =!=(that: FileRename): Bool = ???
    @api def toText: Text = ???
  }

  case class FileRenameRep(s: Exp[FileRenameRep]) extends MetaAny[FileRenameRep] {
    @api def success: Bool = ???
    @api def r_errno: FixPt[TRUE,_32,_0] = ???
    @api def ===(that: FileRenameRep): Bool = ???
    @api def =!=(that: FileRenameRep): Bool = ???
    @api def toText: Text = ???
  }

  
case class FileRename_old_path(srv: Exp[FileRename]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileRename_old_path(f(srv)))(EmptyContext)
}

  
case class FileRename_new_path(srv: Exp[FileRename]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileRename_new_path(f(srv)))(EmptyContext)
}

  
case class FileRenameRep_old_path(srv: Exp[FileRenameRep]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileRenameRep_old_path(f(srv)))(EmptyContext)
}

  
case class FileRenameRep_new_path(srv: Exp[FileRenameRep]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileRenameRep_new_path(f(srv)))(EmptyContext)
}

  case class FileRenameReply(srv: Exp[FileRename]) extends Op[FileRenameRep]{
    def mirror(f: Tx) = stage(FileRenameReply(f(srv)))(EmptyContext)
  }

  
  object FileRename {

  }

  object FileRenameRep {

  }

}

