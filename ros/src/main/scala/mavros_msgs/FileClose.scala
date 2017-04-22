package spatial.ros

import org.virtualized._

trait FileCloseApi extends FileCloseExp {
self: RosApi =>

  }

trait FileCloseExp {
    self: RosExp =>

    case class FileClose(file_path: Text)
    case class FileCloseReply(success: Bool, r_errno: FixPt[TRUE,_32,_0])
}

object FileClose {
}
