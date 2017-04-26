package spatial.ros.api

import spatial.ros._

trait RosMsgApi extends RosMsgExp {
  self: RosApi =>
}

trait RosMsgExp {
  self: RosExp =>

  trait Msg[T]
}
