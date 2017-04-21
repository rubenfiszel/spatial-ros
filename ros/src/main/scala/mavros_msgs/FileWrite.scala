case class FileWrite.srv(file_path: string, offset: uint64, data: uint8[])/ncase class FileWrite.srvReply(success: bool, r_errno: int32)/nobject FileWrite.srv {
}
