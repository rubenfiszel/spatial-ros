
package spatial.ros

import forge._
import org.virtualized._

trait FileChecksumApi extends FileChecksumExp {
  self: RosApi =>

}

trait FileChecksumExp {
  self: RosExp =>
  
  implicit object FileChecksumType extends Meta[FileChecksum] {
    def wrapped(x: Exp[FileChecksum]) = FileChecksum(x)
    def stagedClass = classOf[FileChecksum]
    def isPrimitive = false
  }

  implicit object FileChecksumRepType extends Meta[FileChecksumRep] {
    def wrapped(x: Exp[FileChecksumRep]) = FileChecksumRep(x)
    def stagedClass = classOf[FileChecksumRep]
    def isPrimitive = false
  }

  case class FileChecksum(s: Exp[FileChecksum]) extends MetaAny[FileChecksum] {
    @api def file_path: Text = ???
    @api def response: FileChecksumRep = ???//FileChecksumRep(FileChecksumReply(s))
    @api def ===(that: FileChecksum): Bool = ???
    @api def =!=(that: FileChecksum): Bool = ???
    @api def toText: Text = ???
  }

  case class FileChecksumRep(s: Exp[FileChecksumRep]) extends MetaAny[FileChecksumRep] {
    @api def crc32: FixPt[FALSE,_32,_0] = ???
    @api def success: Bool = ???
    @api def r_errno: FixPt[TRUE,_32,_0] = ???
    @api def ===(that: FileChecksumRep): Bool = ???
    @api def =!=(that: FileChecksumRep): Bool = ???
    @api def toText: Text = ???
  }

  
case class FileChecksum_file_path(srv: Exp[FileChecksum]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileChecksum_file_path(f(srv)))(EmptyContext)
}

  
case class FileChecksumRep_file_path(srv: Exp[FileChecksumRep]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileChecksumRep_file_path(f(srv)))(EmptyContext)
}

  case class FileChecksumReply(srv: Exp[FileChecksum]) extends Op[FileChecksumRep]{
    def mirror(f: Tx) = stage(FileChecksumReply(f(srv)))(EmptyContext)
  }

  
  object FileChecksum {

  }

  object FileChecksumRep {

  }

}

