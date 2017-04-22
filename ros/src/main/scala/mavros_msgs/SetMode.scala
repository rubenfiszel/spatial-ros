package spatial.ros

import org.virtualized._

trait SetModeApi extends SetModeExp {
self: RosApi =>

  }

trait SetModeExp {
    self: RosExp =>

    case class SetMode()
    case class SetModeReply(success: Bool)
}

object SetMode {
}
