package spatial.ros

import argon.codegen.scalagen.ScalaCodegen
import forge._
import org.virtualized._

trait FileRemoveDirApi extends FileRemoveDirExp { self: RosApi =>

}

trait FileRemoveDirExp { self: RosExp =>

  implicit object FileRemoveDirType extends Meta[FileRemoveDir] {
    def wrapped(x: Exp[FileRemoveDir]) = FileRemoveDir(x)
    def stagedClass                    = classOf[FileRemoveDir]
    def isPrimitive                    = false
  }

  implicit object FileRemoveDirRepType extends Meta[FileRemoveDirRep] {
    def wrapped(x: Exp[FileRemoveDirRep]) = FileRemoveDirRep(x)
    def stagedClass                       = classOf[FileRemoveDirRep]
    def isPrimitive                       = false
  }

  case class FileRemoveDir(s: Exp[FileRemoveDir])
      extends MetaAny[FileRemoveDir] {
    @api def dir_path: Text = Text(stage(FileRemoveDir_dir_path(s))(ctx))
    @api def response: FileRemoveDirRep =
      FileRemoveDirRep(stage(FileRemoveDirReply(s))(ctx))
    @api def ===(that: FileRemoveDir): Bool = ???
    @api def =!=(that: FileRemoveDir): Bool = ???
    @api def toText: Text                   = textify(this)
  }

  case class FileRemoveDirRep(s: Exp[FileRemoveDirRep])
      extends MetaAny[FileRemoveDirRep] {
    @api def success: Bool =
      Bool(stage(FileRemoveDirRep_reply_success(s))(ctx))
    @api def r_errno: FixPt[TRUE, _32, _0] =
      FixPt(stage(FileRemoveDirRep_reply_r_errno(s))(ctx))
    @api def ===(that: FileRemoveDirRep): Bool = ???
    @api def =!=(that: FileRemoveDirRep): Bool = ???
    @api def toText: Text                      = textify(this)
  }

  case class FileRemoveDir_dir_path(srv: Exp[FileRemoveDir]) extends Op[Text] {
    def mirror(f: Tx) = stage(FileRemoveDir_dir_path(f(srv)))(EmptyContext)
  }

  case class FileRemoveDirRep_reply_success(srv: Exp[FileRemoveDirRep])
      extends Op[Bool] {
    def mirror(f: Tx) =
      stage(FileRemoveDirRep_reply_success(f(srv)))(EmptyContext)
  }

  case class FileRemoveDirRep_reply_r_errno(srv: Exp[FileRemoveDirRep])
      extends Op[FixPt[TRUE, _32, _0]] {
    def mirror(f: Tx) =
      stage(FileRemoveDirRep_reply_r_errno(f(srv)))(EmptyContext)
  }

  case class FileRemoveDirReply(srv: Exp[FileRemoveDir])
      extends Op[FileRemoveDirRep] {
    def mirror(f: Tx) = stage(FileRemoveDirReply(f(srv)))(EmptyContext)
  }
  case class NewFileRemoveDir(dir_path: Exp[Text]) extends Op[FileRemoveDir] {
    def mirror(f: Tx) = stage(NewFileRemoveDir(f(dir_path)))(EmptyContext)
  }

  object FileRemoveDir {

    @api def apply(dir_path: Text): FileRemoveDir =
      FileRemoveDir(stage(NewFileRemoveDir(dir_path.s))(ctx))
  }

  object FileRemoveDirRep {}

}

trait ScalaGenFileRemoveDir extends ScalaCodegen {}
