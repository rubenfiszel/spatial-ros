package spatial.ros.api

import spatial.ros._

trait RosSrvApi extends RosSrvExp {
  self: RosApi =>
}

trait RosSrvExp {
  self: RosExp =>

  trait Srv[T] {
    type Response
    def response(srv: T): Response
  }
}
