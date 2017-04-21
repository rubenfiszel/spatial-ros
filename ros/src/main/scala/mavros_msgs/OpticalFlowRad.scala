package spatial.ros

trait OpticalFlowRadApi extends OpticalFlowRadExp {
    self: RosApi =>

}

trait OpticalFlowRadExp {
    self: RosExp =>

    case class OpticalFlowRad(integration_time_us: FixPt[FALSE,_32,_0], integrated_x: FltPt[_24,_8], integrated_y: FltPt[_24,_8], integrated_xgyro: FltPt[_24,_8], integrated_ygyro: FltPt[_24,_8], integrated_zgyro: FltPt[_24,_8], temperature: FixPt[TRUE,_16,_0], quality: FixPt[FALSE,_8,_0], time_delta_distance_us: FixPt[FALSE,_32,_0], distance: FltPt[_24,_8])
}

object OpticalFlowRad {
}
