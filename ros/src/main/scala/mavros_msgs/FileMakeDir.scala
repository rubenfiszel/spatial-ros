package spatial.ros

import org.virtualized._

trait FileMakeDirApi extends FileMakeDirExp {
self: RosApi =>

  }

trait FileMakeDirExp {
    self: RosExp =>

    @struct case class FileMakeDir(dir_path: Text)
    @struct case class FileMakeDirReply(success: Bool, r_errno: FixPt[TRUE,_32,_0])
}

object FileMakeDir {
}
