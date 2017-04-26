
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait FileEntryApi extends FileEntryExp {
  self: RosApi =>

}

trait FileEntryExp {
  self: RosExp =>

  implicit object FileEntryType extends Meta[FileEntry] {
    def wrapped(x: Exp[FileEntry]) = FileEntry(x)
    def stagedClass = classOf[FileEntry]
    def isPrimitive = false
  }

  implicit object FileEntryMsg extends Msg[FileEntry]

  case class FileEntry(s: Exp[FileEntry]) extends MetaAny[FileEntry] {
    @api def name: Text = Text(stage(FileEntry_name(s))(ctx))
    @api def typ: FixPt[FALSE,_8,_0] = FixPt(stage(FileEntry_type(s))(ctx))
    @api def size: FixPt[FALSE,_64,_0] = FixPt(stage(FileEntry_size(s))(ctx))
    @api def ===(that: FileEntry) = ???
    @api def =!=(that: FileEntry) = ???
    @api def toText: Text = textify(this)
  }

  
case class FileEntry_name(msg: Exp[FileEntry]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileEntry_name(f(msg)))(EmptyContext)
}

  
case class FileEntry_type(msg: Exp[FileEntry]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(FileEntry_type(f(msg)))(EmptyContext)
}

  
case class FileEntry_size(msg: Exp[FileEntry]) extends Op[FixPt[FALSE,_64,_0]] {
  def mirror(f: Tx) = stage(FileEntry_size(f(msg)))(EmptyContext)
}

  case class NewFileEntry(name: Exp[Text], typ: Exp[FixPt[FALSE,_8,_0]], size: Exp[FixPt[FALSE,_64,_0]]) extends Op[FileEntry] {
    def mirror(f: Tx) = stage(NewFileEntry(f(name), f(typ), f(size)))(EmptyContext)
  }

  object FileEntry {

  @api def apply(name: Text, typ: FixPt[FALSE,_8,_0], size: FixPt[FALSE,_64,_0]): FileEntry = FileEntry(stage(NewFileEntry(name.s, typ.s, size.s))(ctx))


  }

}

trait ScalaGenFileEntry extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case FileEntry_name(msg) => emit(src"val $lhs = $msg.name")
    case FileEntry_type(msg) => emit(src"val $lhs = $msg.type")
    case FileEntry_size(msg) => emit(src"val $lhs = $msg.size")
    case NewFileEntry(name, typ, size) =>
      emit(src"val $lhs = FileEntry($name, $typ, $size)")
    case _ => super.emitNode(lhs, rhs)
  }

}


