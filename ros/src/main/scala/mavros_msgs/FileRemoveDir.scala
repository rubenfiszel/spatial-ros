
package spatial.ros

import forge._
import org.virtualized._

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

  implicit object FileRemoveDirRepType extends Meta[FileRemoveDirRep] {
    def wrapped(x: Exp[FileRemoveDirRep]) = FileRemoveDirRep(x)
    def stagedClass = classOf[FileRemoveDirRep]
    def isPrimitive = false
  }

  case class FileRemoveDir(s: Exp[FileRemoveDir]) extends MetaAny[FileRemoveDir] {
    @api def dir_path: Text = ???
    @api def response: FileRemoveDirRep = ???//FileRemoveDirRep(FileRemoveDirReply(s))
    @api def ===(that: FileRemoveDir): Bool = ???
    @api def =!=(that: FileRemoveDir): Bool = ???
    @api def toText: Text = ???
  }

  case class FileRemoveDirRep(s: Exp[FileRemoveDirRep]) extends MetaAny[FileRemoveDirRep] {
    @api def success: Bool = ???
    @api def r_errno: FixPt[TRUE,_32,_0] = ???
    @api def ===(that: FileRemoveDirRep): Bool = ???
    @api def =!=(that: FileRemoveDirRep): Bool = ???
    @api def toText: Text = ???
  }

  
case class FileRemoveDir_dir_path(srv: Exp[FileRemoveDir]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileRemoveDir_dir_path(f(srv)))(EmptyContext)
}

  
case class FileRemoveDirRep_dir_path(srv: Exp[FileRemoveDirRep]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileRemoveDirRep_dir_path(f(srv)))(EmptyContext)
}

  case class FileRemoveDirReply(srv: Exp[FileRemoveDir]) extends Op[FileRemoveDirRep]{
    def mirror(f: Tx) = stage(FileRemoveDirReply(f(srv)))(EmptyContext)
  }

  
  object FileRemoveDir {

  }

  object FileRemoveDirRep {

  }

}

