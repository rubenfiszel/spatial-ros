package spatial.ros

import argon.codegen.scalagen.ScalaCodegen
import forge._
import org.virtualized._

trait FileWriteApi extends FileWriteExp { self: RosApi =>

}

trait FileWriteExp { self: RosExp =>

  implicit object FileWriteType extends Meta[FileWrite] {
    def wrapped(x: Exp[FileWrite]) = FileWrite(x)
    def stagedClass                = classOf[FileWrite]
    def isPrimitive                = false
  }

  implicit object FileWriteRepType extends Meta[FileWriteRep] {
    def wrapped(x: Exp[FileWriteRep]) = FileWriteRep(x)
    def stagedClass                   = classOf[FileWriteRep]
    def isPrimitive                   = false
  }

  case class FileWrite(s: Exp[FileWrite]) extends MetaAny[FileWrite] {
    @api def file_path: Text = Text(stage(FileWrite_file_path(s))(ctx))
    @api def offset: FixPt[FALSE, _64, _0] =
      FixPt(stage(FileWrite_offset(s))(ctx))
    @api def data: MetaArray[FixPt[FALSE, _8, _0]] =
      MetaArray(stage(FileWrite_data(s))(ctx))
    @api def response: FileWriteRep =
      FileWriteRep(stage(FileWriteReply(s))(ctx))
    @api def ===(that: FileWrite): Bool = ???
    @api def =!=(that: FileWrite): Bool = ???
    @api def toText: Text               = textify(this)
  }

  case class FileWriteRep(s: Exp[FileWriteRep]) extends MetaAny[FileWriteRep] {
    @api def success: Bool = Bool(stage(FileWriteRep_reply_success(s))(ctx))
    @api def r_errno: FixPt[TRUE, _32, _0] =
      FixPt(stage(FileWriteRep_reply_r_errno(s))(ctx))
    @api def ===(that: FileWriteRep): Bool = ???
    @api def =!=(that: FileWriteRep): Bool = ???
    @api def toText: Text                  = textify(this)
  }

  case class FileWrite_file_path(srv: Exp[FileWrite]) extends Op[Text] {
    def mirror(f: Tx) = stage(FileWrite_file_path(f(srv)))(EmptyContext)
  }

  case class FileWrite_offset(srv: Exp[FileWrite])
      extends Op[FixPt[FALSE, _64, _0]] {
    def mirror(f: Tx) = stage(FileWrite_offset(f(srv)))(EmptyContext)
  }

  case class FileWrite_data(srv: Exp[FileWrite])
      extends Op[MetaArray[FixPt[FALSE, _8, _0]]] {
    def mirror(f: Tx) = stage(FileWrite_data(f(srv)))(EmptyContext)
  }

  case class FileWriteRep_reply_success(srv: Exp[FileWriteRep])
      extends Op[Bool] {
    def mirror(f: Tx) = stage(FileWriteRep_reply_success(f(srv)))(EmptyContext)
  }

  case class FileWriteRep_reply_r_errno(srv: Exp[FileWriteRep])
      extends Op[FixPt[TRUE, _32, _0]] {
    def mirror(f: Tx) = stage(FileWriteRep_reply_r_errno(f(srv)))(EmptyContext)
  }

  case class FileWriteReply(srv: Exp[FileWrite]) extends Op[FileWriteRep] {
    def mirror(f: Tx) = stage(FileWriteReply(f(srv)))(EmptyContext)
  }
  case class NewFileWrite(file_path: Exp[Text],
                          offset: Exp[FixPt[FALSE, _64, _0]],
                          data: Exp[MetaArray[FixPt[FALSE, _8, _0]]])
      extends Op[FileWrite] {
    def mirror(f: Tx) =
      stage(NewFileWrite(f(file_path), f(offset), f(data)))(EmptyContext)
  }

  object FileWrite {

    @api
    def apply(file_path: Text,
              offset: FixPt[FALSE, _64, _0],
              data: MetaArray[FixPt[FALSE, _8, _0]]): FileWrite =
      FileWrite(stage(NewFileWrite(file_path.s, offset.s, data.s))(ctx))
  }

  object FileWriteRep {}

}

trait ScalaGenFileWrite extends ScalaCodegen {}
