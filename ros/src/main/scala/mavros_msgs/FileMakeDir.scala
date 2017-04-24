
package spatial.ros

import forge._
import org.virtualized._

trait FileMakeDirApi extends FileMakeDirExp {
  self: RosApi =>

}

trait FileMakeDirExp {
  self: RosExp =>
  
  
case class FileMakeDir_dir_path(srv: Exp[FileMakeDir]) extends Op[Text] {
  def mirror(f: Tx) = ???//(FileMakeDir_dir_path(f(srv)): Exp[Text])
}

  
case class FileMakeDirRep_dir_path(srv: Exp[FileMakeDirRep]) extends Op[Text] {
  def mirror(f: Tx) = ???//FileMakeDirRep_dir_path(f(srv))
}

  case class FileMakeDirReply(srv: Exp[FileMakeDir]) extends Op[FileMakeDirRep]{
    def mirror(f: Tx) = ???//FileMakeDirReply(f(srv))
  }

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
    @api def dir_path: Text = ???
    @api def response: FileMakeDirRep = ???//FileMakeDirRep(FileMakeDirReply(s))
    @api def ===(that: FileMakeDir): Bool = ???
    @api def =!=(that: FileMakeDir): Bool = ???
    @api def toText: Text = ???
  }

  case class FileMakeDirRep(s: Exp[FileMakeDirRep]) extends MetaAny[FileMakeDirRep] {
    @api def success: Bool = ???
    @api def r_errno: FixPt[TRUE,_32,_0] = ???
    @api def ===(that: FileMakeDirRep): Bool = ???
    @api def =!=(that: FileMakeDirRep): Bool = ???
    @api def toText: Text = ???
  }
  
  object FileMakeDir {

  }

  object FileMakeDirRep {

  }

}

