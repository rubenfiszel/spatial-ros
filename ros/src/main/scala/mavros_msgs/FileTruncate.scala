
package spatial.ros

import forge._
import org.virtualized._

trait FileTruncateApi extends FileTruncateExp {
  self: RosApi =>

}

trait FileTruncateExp {
  self: RosExp =>
  
  implicit object FileTruncateType extends Meta[FileTruncate] {
    def wrapped(x: Exp[FileTruncate]) = FileTruncate(x)
    def stagedClass = classOf[FileTruncate]
    def isPrimitive = false
  }

  implicit object FileTruncateRepType extends Meta[FileTruncateRep] {
    def wrapped(x: Exp[FileTruncateRep]) = FileTruncateRep(x)
    def stagedClass = classOf[FileTruncateRep]
    def isPrimitive = false
  }

  case class FileTruncate(s: Exp[FileTruncate]) extends MetaAny[FileTruncate] {
    @api def file_path: Text = ???
    @api def length: FixPt[FALSE,_64,_0] = ???
    @api def response: FileTruncateRep = ???//FileTruncateRep(FileTruncateReply(s))
    @api def ===(that: FileTruncate): Bool = ???
    @api def =!=(that: FileTruncate): Bool = ???
    @api def toText: Text = ???
  }

  case class FileTruncateRep(s: Exp[FileTruncateRep]) extends MetaAny[FileTruncateRep] {
    @api def success: Bool = ???
    @api def r_errno: FixPt[TRUE,_32,_0] = ???
    @api def ===(that: FileTruncateRep): Bool = ???
    @api def =!=(that: FileTruncateRep): Bool = ???
    @api def toText: Text = ???
  }

  
case class FileTruncate_file_path(srv: Exp[FileTruncate]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileTruncate_file_path(f(srv)))(EmptyContext)
}

  
case class FileTruncate_length(srv: Exp[FileTruncate]) extends Op[FixPt[FALSE,_64,_0]] {
  def mirror(f: Tx) = stage(FileTruncate_length(f(srv)))(EmptyContext)
}

  
case class FileTruncateRep_file_path(srv: Exp[FileTruncateRep]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileTruncateRep_file_path(f(srv)))(EmptyContext)
}

  
case class FileTruncateRep_length(srv: Exp[FileTruncateRep]) extends Op[FixPt[FALSE,_64,_0]] {
  def mirror(f: Tx) = stage(FileTruncateRep_length(f(srv)))(EmptyContext)
}

  case class FileTruncateReply(srv: Exp[FileTruncate]) extends Op[FileTruncateRep]{
    def mirror(f: Tx) = stage(FileTruncateReply(f(srv)))(EmptyContext)
  }

  
  object FileTruncate {

  }

  object FileTruncateRep {

  }

}

