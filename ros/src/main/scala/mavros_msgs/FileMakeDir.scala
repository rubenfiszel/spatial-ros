package spatial.ros

trait FileMakeDirApi extends FileMakeDirExp {
self: RosApi =>

  }

trait FileMakeDirExp {
    self: RosExp =>

    case class FileMakeDir(dir_path: Text)
    case class FileMakeDirReply(success: Bool, r_errno: FixPt[TRUE,_32,_0])
}

object FileMakeDir {
}
