package spatial.ros

import org.virtualized._

trait FileCloseApi extends FileCloseExp {
self: RosApi =>

  }

trait FileCloseExp {
    self: RosExp =>

    @struct case class FileClose(file_path: Text)
    @struct case class FileCloseReply(success: Bool, r_errno: FixPt[TRUE,_32,_0])
}

object FileClose {
}
