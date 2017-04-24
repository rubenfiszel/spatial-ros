package spatial.ros

import org.virtualized._

trait FileOpenApi extends FileOpenExp {
self: RosApi =>

  }

trait FileOpenExp {
    self: RosExp =>

    case class FileOpen(file_path: Text, mode: FixPt[FALSE,_8,_0])
    case class FileOpenReply(size: FixPt[FALSE,_32,_0], success: Bool, r_errno: FixPt[TRUE,_32,_0])
}

object FileOpen {
}
