package spatial.ros

import argon.codegen.scalagen.ScalaCodegen
import forge._
import org.virtualized._

trait FileChecksumApi extends FileChecksumExp { self: RosApi =>

}

trait FileChecksumExp { self: RosExp =>

  implicit object FileChecksumType extends Meta[FileChecksum] {
    def wrapped(x: Exp[FileChecksum]) = FileChecksum(x)
    def stagedClass                   = classOf[FileChecksum]
    def isPrimitive                   = false
  }

  implicit object FileChecksumRepType extends Meta[FileChecksumRep] {
    def wrapped(x: Exp[FileChecksumRep]) = FileChecksumRep(x)
    def stagedClass                      = classOf[FileChecksumRep]
    def isPrimitive                      = false
  }

  case class FileChecksum(s: Exp[FileChecksum]) extends MetaAny[FileChecksum] {
    @api def file_path: Text = Text(stage(FileChecksum_file_path(s))(ctx))
    @api def response: FileChecksumRep =
      FileChecksumRep(stage(FileChecksumReply(s))(ctx))
    @api def ===(that: FileChecksum): Bool = ???
    @api def =!=(that: FileChecksum): Bool = ???
    @api def toText: Text                  = textify(this)
  }

  case class FileChecksumRep(s: Exp[FileChecksumRep])
      extends MetaAny[FileChecksumRep] {
    @api def crc32: FixPt[FALSE, _32, _0] =
      FixPt(stage(FileChecksumRep_reply_crc32(s))(ctx))
    @api def success: Bool = Bool(stage(FileChecksumRep_reply_success(s))(ctx))
    @api def r_errno: FixPt[TRUE, _32, _0] =
      FixPt(stage(FileChecksumRep_reply_r_errno(s))(ctx))
    @api def ===(that: FileChecksumRep): Bool = ???
    @api def =!=(that: FileChecksumRep): Bool = ???
    @api def toText: Text                     = textify(this)
  }

  case class FileChecksum_file_path(srv: Exp[FileChecksum]) extends Op[Text] {
    def mirror(f: Tx) = stage(FileChecksum_file_path(f(srv)))(EmptyContext)
  }

  case class FileChecksumRep_reply_crc32(srv: Exp[FileChecksumRep])
      extends Op[FixPt[FALSE, _32, _0]] {
    def mirror(f: Tx) =
      stage(FileChecksumRep_reply_crc32(f(srv)))(EmptyContext)
  }

  case class FileChecksumRep_reply_success(srv: Exp[FileChecksumRep])
      extends Op[Bool] {
    def mirror(f: Tx) =
      stage(FileChecksumRep_reply_success(f(srv)))(EmptyContext)
  }

  case class FileChecksumRep_reply_r_errno(srv: Exp[FileChecksumRep])
      extends Op[FixPt[TRUE, _32, _0]] {
    def mirror(f: Tx) =
      stage(FileChecksumRep_reply_r_errno(f(srv)))(EmptyContext)
  }

  case class FileChecksumReply(srv: Exp[FileChecksum])
      extends Op[FileChecksumRep] {
    def mirror(f: Tx) = stage(FileChecksumReply(f(srv)))(EmptyContext)
  }
  case class NewFileChecksum(file_path: Exp[Text]) extends Op[FileChecksum] {
    def mirror(f: Tx) = stage(NewFileChecksum(f(file_path)))(EmptyContext)
  }

  object FileChecksum {

    @api def apply(file_path: Text): FileChecksum =
      FileChecksum(stage(NewFileChecksum(file_path.s))(ctx))
  }

  object FileChecksumRep {}

}

trait ScalaGenFileChecksum extends ScalaCodegen {}
