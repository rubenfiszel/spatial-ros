
package spatial.ros

import forge._
import org.virtualized._

trait FileMakeDirApi extends FileMakeDirExp {
  self: RosApi =>

}

trait FileMakeDirExp {
  self: RosExp =>
  
  implicit object FileMakeDirType extends Meta[FileMakeDir] {
    def wrapped(x: Exp[FileMakeDir]) = FileMakeDir(x)
    def stagedClass = classOf[FileMakeDir]
    def isPrimitive = false
  }

  implicit object FileMakeDirRepType extends Meta[FileMakeDirRep] {
    def wrapped(x: Exp[FileMakeDirRep]) = FileMakeDirRep(x)
    def stagedClass = classOf[FileMakeDirRep]
    def isPrimitive = false
  }

  case class FileMakeDir(s: Exp[FileMakeDir]) extends MetaAny[FileMakeDir] {
    @api def dir_path: Text = Text(stage(FileMakeDir_dir_path(s))(ctx))
    @api def response: FileMakeDirRep = ???//FileMakeDirRep(FileMakeDirReply(s))
    @api def ===(that: FileMakeDir): Bool = ???
    @api def =!=(that: FileMakeDir): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class FileMakeDirRep(s: Exp[FileMakeDirRep]) extends MetaAny[FileMakeDirRep] {
    @api def success: Bool = Bool(stage(FileMakeDirRep_reply_success(s))(ctx))
    @api def r_errno: FixPt[TRUE,_32,_0] = FixPt(stage(FileMakeDirRep_reply_r_errno(s))(ctx))
    @api def ===(that: FileMakeDirRep): Bool = ???
    @api def =!=(that: FileMakeDirRep): Bool = ???
    @api def toText: Text = textify(this)
  }

  
case class FileMakeDir_dir_path(srv: Exp[FileMakeDir]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileMakeDir_dir_path(f(srv)))(EmptyContext)
}

  
case class FileMakeDirRep_reply_success(srv: Exp[FileMakeDirRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(FileMakeDirRep_reply_success(f(srv)))(EmptyContext)
}

  
case class FileMakeDirRep_reply_r_errno(srv: Exp[FileMakeDirRep]) extends Op[FixPt[TRUE,_32,_0]] {
  def mirror(f: Tx) = stage(FileMakeDirRep_reply_r_errno(f(srv)))(EmptyContext)
}

  case class FileMakeDirReply(srv: Exp[FileMakeDir]) extends Op[FileMakeDirRep]{
    def mirror(f: Tx) = stage(FileMakeDirReply(f(srv)))(EmptyContext)
  }

  
  object FileMakeDir {

  }

  object FileMakeDirRep {

  }

}

