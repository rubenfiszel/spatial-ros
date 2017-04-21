package spatial.ros

trait FileReadApi extends FileReadExp {
self: RosApi =>

  }

trait FileReadExp {
    self: RosExp =>

    case class FileRead(file_path: Text, offset: FixPt[FALSE,_64,_0], size: FixPt[FALSE,_64,_0])
    case class FileReadReply(data: Array[FixPt[FALSE,_8,_0]], success: Bool, r_errno: FixPt[TRUE,_32,_0])
}

object FileRead {
}
