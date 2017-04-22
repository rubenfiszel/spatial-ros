package spatial.ros

import org.virtualized._

trait FileRenameApi extends FileRenameExp {
self: RosApi =>

  }

trait FileRenameExp {
    self: RosExp =>

    @struct case class FileRename(old_path: Text, new_path: Text)
    @struct case class FileRenameReply(success: Bool, r_errno: FixPt[TRUE,_32,_0])
}

object FileRename {
}
