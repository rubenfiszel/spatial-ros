
package spatial.ros

import forge._
import org.virtualized._

trait FileEntryApi extends FileEntryExp {
  self: RosApi =>

}

trait FileEntryExp {
  self: RosExp =>
  
  
case class FileEntry_name(msg: Exp[FileEntry]) extends Op[Text] {
  def mirror(f: Tx) = ???//FileEntry_name(f(msg))
}

  
case class FileEntry_type(msg: Exp[FileEntry]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = ???//FileEntry_type(f(msg))
}

  
case class FileEntry_size(msg: Exp[FileEntry]) extends Op[FixPt[FALSE,_64,_0]] {
  def mirror(f: Tx) = ???//FileEntry_size(f(msg))
}


  implicit object FileEntryType extends Meta[FileEntry] {
    def wrapped(x: Exp[FileEntry]) = FileEntry(x)
    def stagedClass = classOf[FileEntry]
    def isPrimitive = false
  }

  case class FileEntry(s: Exp[FileEntry]) extends MetaAny[FileEntry] {
    @api def name: Text = ???
    @api def `type`: FixPt[FALSE,_8,_0] = ???
    @api def size: FixPt[FALSE,_64,_0] = ???
    @api def ===(that: FileEntry) = ???
    @api def =!=(that: FileEntry) = ???
    @api def toText: Text = ???
  }
  
  object FileEntry {

  }

}

