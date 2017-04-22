package spatial.ros

import org.virtualized._

trait FileWriteApi extends FileWriteExp {
self: RosApi =>

  }

trait FileWriteExp {
    self: RosExp =>

    @struct case class FileWrite(file_path: Text, offset: FixPt[FALSE,_64,_0], data: MetaArray[FixPt[FALSE,_8,_0]])
    @struct case class FileWriteReply(success: Bool, r_errno: FixPt[TRUE,_32,_0])
}

object FileWrite {
}
