package spatial.ros

trait FileListApi extends FileListExp {
self: RosApi =>

  }

trait FileListExp {
    self: RosExp =>

    case class FileList(dir_path: Text)
    case class FileListReply(list: Array[FileEntry], success: Bool, r_errno: FixPt[TRUE,_32,_0])
}

object FileList {
}
