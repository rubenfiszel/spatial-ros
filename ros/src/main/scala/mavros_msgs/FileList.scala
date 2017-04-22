package spatial.ros

import org.virtualized._

trait FileListApi extends FileListExp {
self: RosApi =>

  }

trait FileListExp {
    self: RosExp =>

    @struct case class FileList(dir_path: Text)
    @struct case class FileListReply(list: MetaArray[FileEntry], success: Bool, r_errno: FixPt[TRUE,_32,_0])
}

object FileList {
}
