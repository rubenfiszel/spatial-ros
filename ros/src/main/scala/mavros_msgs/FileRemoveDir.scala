package spatial.ros

import org.virtualized._

trait FileRemoveDirApi extends FileRemoveDirExp {
self: RosApi =>

  }

trait FileRemoveDirExp {
    self: RosExp =>

    @struct case class FileRemoveDir(dir_path: Text)
    @struct case class FileRemoveDirReply(success: Bool, r_errno: FixPt[TRUE,_32,_0])
}

object FileRemoveDir {
}
