
package spatial.ros

import forge._
import org.virtualized._
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait FileMakeDirApi extends FileMakeDirExp {
  self: RosApi =>

}

trait FileMakeDirExp {
  self: RosExp =>
  
  implicit object FileMakeDirType extends Meta[FileMakeDir] {
    def wrapped(x: Exp[FileMakeDir]) = FileMakeDir(x)
    def stagedClass = classOf[FileMakeDir]
    def isPrimitive = false
  }

  implicit object FileMakeDirSrv extends Srv[FileMakeDir] {
    type Response = FileMakeDirRep
    def response(srv: FileMakeDir) = srv.response
  }

  implicit object FileMakeDirRepType extends Meta[FileMakeDirRep] {
    def wrapped(x: Exp[FileMakeDirRep]) = FileMakeDirRep(x)
    def stagedClass = classOf[FileMakeDirRep]
    def isPrimitive = false
  }

  case class FileMakeDir(s: Exp[FileMakeDir]) extends MetaAny[FileMakeDir] {
    @api def dir_path: Text = Text(stage(FileMakeDir_dir_path(s))(ctx))
    @api def response: FileMakeDirRep = FileMakeDirRep(stage(FileMakeDirReply(s))(ctx))
    @api def ===(that: FileMakeDir): Bool = ???
    @api def =!=(that: FileMakeDir): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class FileMakeDirRep(s: Exp[FileMakeDirRep]) extends MetaAny[FileMakeDirRep] {
    @api def success: Bool = Bool(stage(FileMakeDirRep_success(s))(ctx))
    @api def r_errno: FixPt[TRUE,_32,_0] = FixPt(stage(FileMakeDirRep_r_errno(s))(ctx))
    @api def ===(that: FileMakeDirRep): Bool = ???
    @api def =!=(that: FileMakeDirRep): Bool = ???
    @api def toText: Text = textify(this)
  }

  
case class FileMakeDir_dir_path(msg: Exp[FileMakeDir]) extends Op[Text] {
  def mirror(f: Tx) = stage(FileMakeDir_dir_path(f(msg)))(EmptyContext)
}

  
case class FileMakeDirRep_success(srv: Exp[FileMakeDirRep]) extends Op[Bool] {
  def mirror(f: Tx) = stage(FileMakeDirRep_success(f(srv)))(EmptyContext)
}

  
case class FileMakeDirRep_r_errno(srv: Exp[FileMakeDirRep]) extends Op[FixPt[TRUE,_32,_0]] {
  def mirror(f: Tx) = stage(FileMakeDirRep_r_errno(f(srv)))(EmptyContext)
}

  case class FileMakeDirReply(srv: Exp[FileMakeDir]) extends Op[FileMakeDirRep]{
    def mirror(f: Tx) = stage(FileMakeDirReply(f(srv)))(EmptyContext)
  }
  case class NewFileMakeDir(dir_path: Exp[Text]) extends Op[FileMakeDir] {
    def mirror(f: Tx) = stage(NewFileMakeDir(f(dir_path)))(EmptyContext)
  }

  
  object FileMakeDir {

  @api def apply(dir_path: Text): FileMakeDir = FileMakeDir(stage(NewFileMakeDir(dir_path.s))(ctx))
  }

  object FileMakeDirRep {

  }

}

trait ScalaGenFileMakeDir extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case FileMakeDir_dir_path(msg) => emit(src"val $lhs = $msg.dir_path")
    case FileMakeDirRep_success(msg) => emit(src"val $lhs = $msg.success")
    case FileMakeDirRep_r_errno(msg) => emit(src"val $lhs = $msg.r_errno")
    case NewFileMakeDir(dir_path) =>
      emit(src"val $lhs = FileMakeDir($dir_path)")
    case FileMakeDirReply(srv) =>
      emit(src"val $lhs = $srv.response")
    case _ => super.emitNode(lhs, rhs)
  }

}

