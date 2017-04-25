
package spatial.ros

import forge._
import org.virtualized._
import argon.codegen.scalagen.ScalaCodegen

trait StreamRateApi extends StreamRateExp {
  self: RosApi =>

}

trait StreamRateExp {
  self: RosExp =>
  
  implicit object StreamRateType extends Meta[StreamRate] {
    def wrapped(x: Exp[StreamRate]) = StreamRate(x)
    def stagedClass = classOf[StreamRate]
    def isPrimitive = false
  }

  implicit object StreamRateRepType extends Meta[StreamRateRep] {
    def wrapped(x: Exp[StreamRateRep]) = StreamRateRep(x)
    def stagedClass = classOf[StreamRateRep]
    def isPrimitive = false
  }

  case class StreamRate(s: Exp[StreamRate]) extends MetaAny[StreamRate] {
    @api def stream_id: FixPt[FALSE,_8,_0] = FixPt(stage(StreamRate_stream_id(s))(ctx))
    @api def message_rate: FixPt[FALSE,_16,_0] = FixPt(stage(StreamRate_message_rate(s))(ctx))
    @api def on_off: Bool = Bool(stage(StreamRate_on_off(s))(ctx))
    @api def response: StreamRateRep = StreamRateRep(stage(StreamRateReply(s))(ctx))
    @api def ===(that: StreamRate): Bool = ???
    @api def =!=(that: StreamRate): Bool = ???
    @api def toText: Text = textify(this)
  }

  case class StreamRateRep(s: Exp[StreamRateRep]) extends MetaAny[StreamRateRep] {

    @api def ===(that: StreamRateRep): Bool = ???
    @api def =!=(that: StreamRateRep): Bool = ???
    @api def toText: Text = textify(this)
  }

  
case class StreamRate_stream_id(srv: Exp[StreamRate]) extends Op[FixPt[FALSE,_8,_0]] {
  def mirror(f: Tx) = stage(StreamRate_stream_id(f(srv)))(EmptyContext)
}

  
case class StreamRate_message_rate(srv: Exp[StreamRate]) extends Op[FixPt[FALSE,_16,_0]] {
  def mirror(f: Tx) = stage(StreamRate_message_rate(f(srv)))(EmptyContext)
}

  
case class StreamRate_on_off(srv: Exp[StreamRate]) extends Op[Bool] {
  def mirror(f: Tx) = stage(StreamRate_on_off(f(srv)))(EmptyContext)
}


  case class StreamRateReply(srv: Exp[StreamRate]) extends Op[StreamRateRep]{
    def mirror(f: Tx) = stage(StreamRateReply(f(srv)))(EmptyContext)
  }
  case class NewStreamRate(stream_id: Exp[FixPt[FALSE,_8,_0]], message_rate: Exp[FixPt[FALSE,_16,_0]], on_off: Exp[Bool]) extends Op[StreamRate] {
    def mirror(f: Tx) = stage(NewStreamRate(f(stream_id), f(message_rate), f(on_off)))(EmptyContext)
  }

  
  object StreamRate {

  @api def apply(stream_id: FixPt[FALSE,_8,_0], message_rate: FixPt[FALSE,_16,_0], on_off: Bool): StreamRate = StreamRate(stage(NewStreamRate(stream_id.s, message_rate.s, on_off.s))(ctx))
  }

  object StreamRateRep {

  }

}

trait ScalaGenStreamRate extends ScalaCodegen{
}

