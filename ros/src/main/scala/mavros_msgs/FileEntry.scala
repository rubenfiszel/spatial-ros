package spatial.ros

trait FileEntryApi extends FileEntryExp {
    self: RosApi =>

}

trait FileEntryExp {
    self: RosExp =>

    case class FileEntry(name: Text, `type`: FixPt[FALSE,_8,_0], size: FixPt[FALSE,_64,_0])
}

object FileEntry {
}