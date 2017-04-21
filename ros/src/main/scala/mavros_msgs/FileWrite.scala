package spatial.ros

trait FileWriteApi extends FileWriteExp {
self: RosApi =>

  }

trait FileWriteExp {
    self: RosExp =>

    case class FileWrite(file_path: Text, offset: FixPt[FALSE,_64,_0], data: Array[FixPt[FALSE,_8,_0]])
    case class FileWriteReply(success: Bool, r_errno: FixPt[TRUE,_32,_0])
}

object FileWrite {
}
