case class FileRead.srv(file_path: string, offset: uint64, size: uint64)/ncase class FileRead.srvReply(data: uint8[], success: bool, r_errno: int32)/nobject FileRead.srv {
}
