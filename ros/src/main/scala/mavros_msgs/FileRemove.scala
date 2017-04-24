
package spatial.ros

import forge._
import org.virtualized._

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

  implicit object FileRemoveRepType extends Meta[FileRemoveRep] {
    def wrapped(x: Exp[FileRemoveRep]) = FileRemoveRep(x)
    def stagedClass = classOf[FileRemoveRep]
    def isPrimitive = false
  }

  case class FileRemove(s: Exp[FileRemove]) extends MetaAny[FileRemove] {
    @api def file_path: Text = ???
    @api def response: FileRemoveRep = ???//FileRemoveRep(FileRemoveReply(s))
    @api def ===(that: FileRemove): Bool = ???
    @api def =!=(that: FileRemove): Bool = ???
    @api def toText: Text = ???
  }

  case class FileRemoveRep(s: Exp[FileRemoveRep]) extends MetaAny[FileRemoveRep] {
    @api def success: Bool = ???
    @api def r_errno: FixPt[TRUE,_32,_0] = ???
    @api def ===(that: FileRemoveRep): Bool = ???
    @api def =!=(that: FileRemoveRep): Bool = ???
    @api def toText: Text = ???
  }

  
case class FileRemove_file_path(srv: Exp[FileRemove]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileRemove_file_path(f(srv)))(EmptyContext)
}

  
case class FileRemoveRep_file_path(srv: Exp[FileRemoveRep]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileRemoveRep_file_path(f(srv)))(EmptyContext)
}

  case class FileRemoveReply(srv: Exp[FileRemove]) extends Op[FileRemoveRep]{
    def mirror(f: Tx) = stage(FileRemoveReply(f(srv)))(EmptyContext)
  }

  
  object FileRemove {

  }

  object FileRemoveRep {

  }

}

