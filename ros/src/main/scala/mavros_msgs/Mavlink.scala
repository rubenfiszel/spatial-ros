
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen
import spatial.ros.codegen.scalagen.RosScalaCodegen

trait MavlinkApi extends MavlinkExp {
  self: RosApi =>

}

trait MavlinkExp {
  self: RosExp =>

  implicit object MavlinkType extends Meta[Mavlink] {
    def wrapped(x: Exp[Mavlink]) = Mavlink(x)
    def stagedClass = classOf[Mavlink]
    def isPrimitive = false
  }

  implicit object MavlinkMsg extends Msg[Mavlink]

  case class Mavlink(s: Exp[Mavlink]) extends MetaAny[Mavlink] {
    @api def is_valid: Bool = Bool(stage(Mavlink_is_valid(s))(ctx))
    @api def len: FixPt[FALSE,_8,_0] = FixPt(stage(Mavlink_len(s))(ctx))
    @api def seq: FixPt[FALSE,_8,_0] = FixPt(stage(Mavlink_seq(s))(ctx))
    @api def sysid: FixPt[FALSE,_8,_0] = FixPt(stage(Mavlink_sysid(s))(ctx))
    @api def compid: FixPt[FALSE,_8,_0] = FixPt(stage(Mavlink_compid(s))(ctx))
    @api def msgid: FixPt[FALSE,_8,_0] = FixPt(stage(Mavlink_msgid(s))(ctx))
    @api def checksum: FixPt[FALSE,_16,_0] = FixPt(stage(Mavlink_checksum(s))(ctx))
    @api def payload64: MetaArray[FixPt[FALSE,_64,_0]] = MetaArray(stage(Mavlink_payload64(s))(ctx))
    @api def ===(that: Mavlink) = ???
    @api def =!=(that: Mavlink) = ???
    @api def toText: Text = textify(this)
  }

  
case class Mavlink_is_valid(msg: Exp[Mavlink]) extends Op[Bool] {
  def mirror(f: Tx) = stage(Mavlink_is_valid(f(msg)))(EmptyContext)
}

  
case class Mavlink_len(msg: Exp[Mavlink]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(Mavlink_len(f(msg)))(EmptyContext)
}

  
case class Mavlink_seq(msg: Exp[Mavlink]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(Mavlink_seq(f(msg)))(EmptyContext)
}

  
case class Mavlink_sysid(msg: Exp[Mavlink]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(Mavlink_sysid(f(msg)))(EmptyContext)
}

  
case class Mavlink_compid(msg: Exp[Mavlink]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(Mavlink_compid(f(msg)))(EmptyContext)
}

  
case class Mavlink_msgid(msg: Exp[Mavlink]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(Mavlink_msgid(f(msg)))(EmptyContext)
}

  
case class Mavlink_checksum(msg: Exp[Mavlink]) extends Op[FixPt[FALSE,_16,_0]] {
  def mirror(f: Tx) = stage(Mavlink_checksum(f(msg)))(EmptyContext)
}

  
case class Mavlink_payload64(msg: Exp[Mavlink]) extends Op[MetaArray[FixPt[FALSE,_64,_0]]] {
  def mirror(f: Tx) = stage(Mavlink_payload64(f(msg)))(EmptyContext)
}

  case class NewMavlink(is_valid: Exp[Bool], len: Exp[FixPt[FALSE,_8,_0]], seq: Exp[FixPt[FALSE,_8,_0]], sysid: Exp[FixPt[FALSE,_8,_0]], compid: Exp[FixPt[FALSE,_8,_0]], msgid: Exp[FixPt[FALSE,_8,_0]], checksum: Exp[FixPt[FALSE,_16,_0]], payload64: Exp[MetaArray[FixPt[FALSE,_64,_0]]]) extends Op[Mavlink] {
    def mirror(f: Tx) = stage(NewMavlink(f(is_valid), f(len), f(seq), f(sysid), f(compid), f(msgid), f(checksum), f(payload64)))(EmptyContext)
  }

  object Mavlink {

  @api def apply(is_valid: Bool, len: FixPt[FALSE,_8,_0], seq: FixPt[FALSE,_8,_0], sysid: FixPt[FALSE,_8,_0], compid: FixPt[FALSE,_8,_0], msgid: FixPt[FALSE,_8,_0], checksum: FixPt[FALSE,_16,_0], payload64: MetaArray[FixPt[FALSE,_64,_0]]): Mavlink = Mavlink(stage(NewMavlink(is_valid.s, len.s, seq.s, sysid.s, compid.s, msgid.s, checksum.s, payload64.s))(ctx))


  }

}

trait ScalaGenMavlink extends RosScalaCodegen {
  val IR: RosExp
  import IR._

  override protected def emitNode(lhs: Sym[_], rhs: Op[_]): Unit = rhs match {
    case Mavlink_is_valid(msg) => emit(src"val $lhs = $msg.is_valid")
    case Mavlink_len(msg) => emit(src"val $lhs = $msg.len")
    case Mavlink_seq(msg) => emit(src"val $lhs = $msg.seq")
    case Mavlink_sysid(msg) => emit(src"val $lhs = $msg.sysid")
    case Mavlink_compid(msg) => emit(src"val $lhs = $msg.compid")
    case Mavlink_msgid(msg) => emit(src"val $lhs = $msg.msgid")
    case Mavlink_checksum(msg) => emit(src"val $lhs = $msg.checksum")
    case Mavlink_payload64(msg) => emit(src"val $lhs = $msg.payload64")
    case NewMavlink(is_valid, len, seq, sysid, compid, msgid, checksum, payload64) =>
      emit(src"val $lhs = Mavlink($is_valid, $len, $seq, $sysid, $compid, $msgid, $checksum, $payload64)")
    case _ => super.emitNode(lhs, rhs)
  }

}


