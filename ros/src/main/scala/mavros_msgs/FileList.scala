
package spatial.ros

import forge._
import org.virtualized._

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

  implicit object FileListRepType extends Meta[FileListRep] {
    def wrapped(x: Exp[FileListRep]) = FileListRep(x)
    def stagedClass = classOf[FileListRep]
    def isPrimitive = false
  }

  case class FileList(s: Exp[FileList]) extends MetaAny[FileList] {
    @api def dir_path: Text = ???
    @api def response: FileListRep = ???//FileListRep(FileListReply(s))
    @api def ===(that: FileList): Bool = ???
    @api def =!=(that: FileList): Bool = ???
    @api def toText: Text = ???
  }

  case class FileListRep(s: Exp[FileListRep]) extends MetaAny[FileListRep] {
    @api def list: MetaArray[FileEntry] = ???
    @api def success: Bool = ???
    @api def r_errno: FixPt[TRUE,_32,_0] = ???
    @api def ===(that: FileListRep): Bool = ???
    @api def =!=(that: FileListRep): Bool = ???
    @api def toText: Text = ???
  }

  
case class FileList_dir_path(srv: Exp[FileList]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileList_dir_path(f(srv)))(EmptyContext)
}

  
case class FileListRep_dir_path(srv: Exp[FileListRep]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileListRep_dir_path(f(srv)))(EmptyContext)
}

  case class FileListReply(srv: Exp[FileList]) extends Op[FileListRep]{
    def mirror(f: Tx) = stage(FileListReply(f(srv)))(EmptyContext)
  }

  
  object FileList {

  }

  object FileListRep {

  }

}

