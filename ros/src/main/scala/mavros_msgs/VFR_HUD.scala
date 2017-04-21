package spatial.ros

trait VFR_HUDApi extends VFR_HUDExp {
    self: RosApi =>

}

trait VFR_HUDExp {
    self: RosExp =>

    case class VFR_HUD()
}

object VFR_HUD {
}
