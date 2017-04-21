package spatial.ros

trait FileTruncateApi extends FileTruncateExp {
self: RosApi =>

  }

trait FileTruncateExp {
    self: RosExp =>

    case class FileTruncate(file_path: Text, length: FixPt[FALSE,_64,_0])
    case class FileTruncateReply(success: Bool, r_errno: FixPt[TRUE,_32,_0])
}

object FileTruncate {
}
