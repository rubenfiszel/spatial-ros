package spatial.ros

import org.virtualized._

trait FileChecksumApi extends FileChecksumExp {
self: RosApi =>

  }

trait FileChecksumExp {
    self: RosExp =>

    @struct case class FileChecksum(file_path: Text)
    @struct case class FileChecksumReply(crc32: FixPt[FALSE,_32,_0], success: Bool, r_errno: FixPt[TRUE,_32,_0])
}

object FileChecksum {
}
