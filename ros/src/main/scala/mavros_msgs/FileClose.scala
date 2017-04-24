
package spatial.ros

import forge._
import org.virtualized._

trait FileCloseApi extends FileCloseExp {
  self: RosApi =>

}

trait FileCloseExp {
  self: RosExp =>
  
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
    @api def file_path: Text = Text(stage(FileClose_file_path(s))(ctx))
    @api def response: FileCloseRep = ???//FileCloseRep(FileCloseReply(s))
    @api def ===(that: FileClose): Bool = ???
    @api def =!=(that: FileClose): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class FileCloseRep(s: Exp[FileCloseRep]) extends MetaAny[FileCloseRep] {
    @api def success: Bool = Bool(stage(FileCloseRep_reply_success(s))(ctx))
    @api def r_errno: FixPt[TRUE,_32,_0] = FixPt(stage(FileCloseRep_reply_r_errno(s))(ctx))
    @api def ===(that: FileCloseRep): Bool = ???
    @api def =!=(that: FileCloseRep): Bool = ???
    @api def toText: Text = textify(this)
  }

  
case class FileClose_file_path(srv: Exp[FileClose]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileClose_file_path(f(srv)))(EmptyContext)
}

  
case class FileCloseRep_reply_success(srv: Exp[FileCloseRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(FileCloseRep_reply_success(f(srv)))(EmptyContext)
}

  
case class FileCloseRep_reply_r_errno(srv: Exp[FileCloseRep]) extends Op[FixPt[TRUE,_32,_0]] {
  def mirror(f: Tx) = stage(FileCloseRep_reply_r_errno(f(srv)))(EmptyContext)
}

  case class FileCloseReply(srv: Exp[FileClose]) extends Op[FileCloseRep]{
    def mirror(f: Tx) = stage(FileCloseReply(f(srv)))(EmptyContext)
  }

  
  object FileClose {

  }

  object FileCloseRep {

  }

}

