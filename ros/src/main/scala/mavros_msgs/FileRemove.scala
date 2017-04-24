
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
    @api def file_path: Text = Text(stage(FileRemove_file_path(s))(ctx))
    @api def response: FileRemoveRep = ???//FileRemoveRep(FileRemoveReply(s))
    @api def ===(that: FileRemove): Bool = ???
    @api def =!=(that: FileRemove): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class FileRemoveRep(s: Exp[FileRemoveRep]) extends MetaAny[FileRemoveRep] {
    @api def success: Bool = Bool(stage(FileRemoveRep_reply_success(s))(ctx))
    @api def r_errno: FixPt[TRUE,_32,_0] = FixPt(stage(FileRemoveRep_reply_r_errno(s))(ctx))
    @api def ===(that: FileRemoveRep): Bool = ???
    @api def =!=(that: FileRemoveRep): Bool = ???
    @api def toText: Text = textify(this)
  }

  
case class FileRemove_file_path(srv: Exp[FileRemove]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileRemove_file_path(f(srv)))(EmptyContext)
}

  
case class FileRemoveRep_reply_success(srv: Exp[FileRemoveRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(FileRemoveRep_reply_success(f(srv)))(EmptyContext)
}

  
case class FileRemoveRep_reply_r_errno(srv: Exp[FileRemoveRep]) extends Op[FixPt[TRUE,_32,_0]] {
  def mirror(f: Tx) = stage(FileRemoveRep_reply_r_errno(f(srv)))(EmptyContext)
}

  case class FileRemoveReply(srv: Exp[FileRemove]) extends Op[FileRemoveRep]{
    def mirror(f: Tx) = stage(FileRemoveReply(f(srv)))(EmptyContext)
  }

  
  object FileRemove {

  }

  object FileRemoveRep {

  }

}

