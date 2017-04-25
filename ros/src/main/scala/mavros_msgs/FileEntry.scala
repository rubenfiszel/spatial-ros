package spatial.ros

import argon.codegen.scalagen.ScalaCodegen
import forge._
import org.virtualized._

trait FileEntryApi extends FileEntryExp { self: RosApi =>

}

trait FileEntryExp { self: RosExp =>

  implicit object FileEntryType extends Meta[FileEntry] {
    def wrapped(x: Exp[FileEntry]) = FileEntry(x)
    def stagedClass                = classOf[FileEntry]
    def isPrimitive                = false
  }

  case class FileEntry(s: Exp[FileEntry]) extends MetaAny[FileEntry] {
    @api def name: Text = Text(stage(FileEntry_name(s))(ctx))
    @api def `type`: FixPt[FALSE, _8, _0] =
      FixPt(stage(FileEntry_type(s))(ctx))
    @api def size: FixPt[FALSE, _64, _0] = FixPt(stage(FileEntry_size(s))(ctx))
    @api def ===(that: FileEntry)        = ???
    @api def =!=(that: FileEntry)        = ???
    @api def toText: Text                = textify(this)
  }

  case class FileEntry_name(msg: Exp[FileEntry]) extends Op[Text] {
    def mirror(f: Tx) = stage(FileEntry_name(f(msg)))(EmptyContext)
  }

  case class FileEntry_type(msg: Exp[FileEntry])
      extends Op[FixPt[FALSE, _8, _0]] {
    def mirror(f: Tx) = stage(FileEntry_type(f(msg)))(EmptyContext)
  }

  case class FileEntry_size(msg: Exp[FileEntry])
      extends Op[FixPt[FALSE, _64, _0]] {
    def mirror(f: Tx) = stage(FileEntry_size(f(msg)))(EmptyContext)
  }

  case class NewFileEntry(name: Exp[Text],
                          `type`: Exp[FixPt[FALSE, _8, _0]],
                          size: Exp[FixPt[FALSE, _64, _0]])
      extends Op[FileEntry] {
    def mirror(f: Tx) =
      stage(NewFileEntry(f(name), f(`type`), f(size)))(EmptyContext)
  }

  object FileEntry {

    @api
    def apply(name: Text,
              `type`: FixPt[FALSE, _8, _0],
              size: FixPt[FALSE, _64, _0]): FileEntry =
      FileEntry(stage(NewFileEntry(name.s, `type`.s, size.s))(ctx))

  }

}

trait ScalaGenFileEntry extends ScalaCodegen {
  override def emitFileHeader() = {
//    emit(src"import DataImplicits._")
    super.emitFileHeader()
  }
}
