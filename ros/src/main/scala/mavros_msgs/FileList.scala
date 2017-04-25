package spatial.ros

import argon.codegen.scalagen.ScalaCodegen
import forge._
import org.virtualized._

trait FileListApi extends FileListExp { self: RosApi =>

}

trait FileListExp { self: RosExp =>

  implicit object FileListType extends Meta[FileList] {
    def wrapped(x: Exp[FileList]) = FileList(x)
    def stagedClass               = classOf[FileList]
    def isPrimitive               = false
  }

  implicit object FileListRepType extends Meta[FileListRep] {
    def wrapped(x: Exp[FileListRep]) = FileListRep(x)
    def stagedClass                  = classOf[FileListRep]
    def isPrimitive                  = false
  }

  case class FileList(s: Exp[FileList]) extends MetaAny[FileList] {
    @api def dir_path: Text            = Text(stage(FileList_dir_path(s))(ctx))
    @api def response: FileListRep     = FileListRep(stage(FileListReply(s))(ctx))
    @api def ===(that: FileList): Bool = ???
    @api def =!=(that: FileList): Bool = ???
    @api def toText: Text              = textify(this)
  }

  case class FileListRep(s: Exp[FileListRep]) extends MetaAny[FileListRep] {
    @api def list: MetaArray[FileEntry] =
      MetaArray(stage(FileListRep_reply_list(s))(ctx))
    @api def success: Bool = Bool(stage(FileListRep_reply_success(s))(ctx))
    @api def r_errno: FixPt[TRUE, _32, _0] =
      FixPt(stage(FileListRep_reply_r_errno(s))(ctx))
    @api def ===(that: FileListRep): Bool = ???
    @api def =!=(that: FileListRep): Bool = ???
    @api def toText: Text                 = textify(this)
  }

  case class FileList_dir_path(srv: Exp[FileList]) extends Op[Text] {
    def mirror(f: Tx) = stage(FileList_dir_path(f(srv)))(EmptyContext)
  }

  case class FileListRep_reply_list(srv: Exp[FileListRep])
      extends Op[MetaArray[FileEntry]] {
    def mirror(f: Tx) = stage(FileListRep_reply_list(f(srv)))(EmptyContext)
  }

  case class FileListRep_reply_success(srv: Exp[FileListRep])
      extends Op[Bool] {
    def mirror(f: Tx) = stage(FileListRep_reply_success(f(srv)))(EmptyContext)
  }

  case class FileListRep_reply_r_errno(srv: Exp[FileListRep])
      extends Op[FixPt[TRUE, _32, _0]] {
    def mirror(f: Tx) = stage(FileListRep_reply_r_errno(f(srv)))(EmptyContext)
  }

  case class FileListReply(srv: Exp[FileList]) extends Op[FileListRep] {
    def mirror(f: Tx) = stage(FileListReply(f(srv)))(EmptyContext)
  }
  case class NewFileList(dir_path: Exp[Text]) extends Op[FileList] {
    def mirror(f: Tx) = stage(NewFileList(f(dir_path)))(EmptyContext)
  }

  object FileList {

    @api def apply(dir_path: Text): FileList =
      FileList(stage(NewFileList(dir_path.s))(ctx))
  }

  object FileListRep {}

}

trait ScalaGenFileList extends ScalaCodegen {}
