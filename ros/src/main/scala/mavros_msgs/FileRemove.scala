package spatial.ros

import org.virtualized._

trait FileRemoveApi extends FileRemoveExp {
self: RosApi =>

  }

trait FileRemoveExp {
    self: RosExp =>

    @struct case class FileRemove(file_path: Text)
    @struct case class FileRemoveReply(success: Bool, r_errno: FixPt[TRUE,_32,_0])
}

object FileRemove {
}
