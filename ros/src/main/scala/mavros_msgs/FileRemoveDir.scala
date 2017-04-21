package spatial.ros

trait FileRemoveDirApi extends FileRemoveDirExp {
self: RosApi =>

  }

trait FileRemoveDirExp {
    self: RosExp =>

    case class FileRemoveDir(dir_path: Text)
    case class FileRemoveDirReply(success: Bool, r_errno: FixPt[TRUE,_32,_0])
}

object FileRemoveDir {
}
