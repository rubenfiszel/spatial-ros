package spatial.ros

import argon.codegen.scalagen.ScalaCodegen
import forge._
import org.virtualized._

trait FileTruncateApi extends FileTruncateExp { self: RosApi =>

}

trait FileTruncateExp { self: RosExp =>

  implicit object FileTruncateType extends Meta[FileTruncate] {
    def wrapped(x: Exp[FileTruncate]) = FileTruncate(x)
    def stagedClass                   = classOf[FileTruncate]
    def isPrimitive                   = false
  }

  implicit object FileTruncateRepType extends Meta[FileTruncateRep] {
    def wrapped(x: Exp[FileTruncateRep]) = FileTruncateRep(x)
    def stagedClass                      = classOf[FileTruncateRep]
    def isPrimitive                      = false
  }

  case class FileTruncate(s: Exp[FileTruncate]) extends MetaAny[FileTruncate] {
    @api def file_path: Text = Text(stage(FileTruncate_file_path(s))(ctx))
    @api def length: FixPt[FALSE, _64, _0] =
      FixPt(stage(FileTruncate_length(s))(ctx))
    @api def response: FileTruncateRep =
      FileTruncateRep(stage(FileTruncateReply(s))(ctx))
    @api def ===(that: FileTruncate): Bool = ???
    @api def =!=(that: FileTruncate): Bool = ???
    @api def toText: Text                  = textify(this)
  }

  case class FileTruncateRep(s: Exp[FileTruncateRep])
      extends MetaAny[FileTruncateRep] {
    @api def success: Bool = Bool(stage(FileTruncateRep_reply_success(s))(ctx))
    @api def r_errno: FixPt[TRUE, _32, _0] =
      FixPt(stage(FileTruncateRep_reply_r_errno(s))(ctx))
    @api def ===(that: FileTruncateRep): Bool = ???
    @api def =!=(that: FileTruncateRep): Bool = ???
    @api def toText: Text                     = textify(this)
  }

  case class FileTruncate_file_path(srv: Exp[FileTruncate]) extends Op[Text] {
    def mirror(f: Tx) = stage(FileTruncate_file_path(f(srv)))(EmptyContext)
  }

  case class FileTruncate_length(srv: Exp[FileTruncate])
      extends Op[FixPt[FALSE, _64, _0]] {
    def mirror(f: Tx) = stage(FileTruncate_length(f(srv)))(EmptyContext)
  }

  case class FileTruncateRep_reply_success(srv: Exp[FileTruncateRep])
      extends Op[Bool] {
    def mirror(f: Tx) =
      stage(FileTruncateRep_reply_success(f(srv)))(EmptyContext)
  }

  case class FileTruncateRep_reply_r_errno(srv: Exp[FileTruncateRep])
      extends Op[FixPt[TRUE, _32, _0]] {
    def mirror(f: Tx) =
      stage(FileTruncateRep_reply_r_errno(f(srv)))(EmptyContext)
  }

  case class FileTruncateReply(srv: Exp[FileTruncate])
      extends Op[FileTruncateRep] {
    def mirror(f: Tx) = stage(FileTruncateReply(f(srv)))(EmptyContext)
  }
  case class NewFileTruncate(file_path: Exp[Text],
                             length: Exp[FixPt[FALSE, _64, _0]])
      extends Op[FileTruncate] {
    def mirror(f: Tx) =
      stage(NewFileTruncate(f(file_path), f(length)))(EmptyContext)
  }

  object FileTruncate {

    @api
    def apply(file_path: Text, length: FixPt[FALSE, _64, _0]): FileTruncate =
      FileTruncate(stage(NewFileTruncate(file_path.s, length.s))(ctx))
  }

  object FileTruncateRep {}

}

trait ScalaGenFileTruncate extends ScalaCodegen {}
