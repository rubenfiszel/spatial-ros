package spatial.ros

trait FileRemoveApi extends FileRemoveExp {
self: RosApi =>

  }

trait FileRemoveExp {
    self: RosExp =>

    case class FileRemove(file_path: Text)
    case class FileRemoveReply(success: Bool, r_errno: FixPt[TRUE,_32,_0])
}

object FileRemove {
}
