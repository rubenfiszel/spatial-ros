case class FileOpen.srv(file_path: string, mode: uint8)/ncase class FileOpen.srvReply(size: uint32, success: bool, r_errno: int32)/nobject FileOpen.srv {
}
