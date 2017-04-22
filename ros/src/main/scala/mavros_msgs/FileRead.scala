package spatial.ros

import org.virtualized._

trait FileReadApi extends FileReadExp {
self: RosApi =>

  }

trait FileReadExp {
    self: RosExp =>

    @struct case class FileRead(file_path: Text, offset: FixPt[FALSE,_64,_0], size: FixPt[FALSE,_64,_0])
    @struct case class FileReadReply(data: MetaArray[FixPt[FALSE,_8,_0]], success: Bool, r_errno: FixPt[TRUE,_32,_0])
}

object FileRead {
}
