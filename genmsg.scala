#!/usr/bin/env scala

import java.io.File


val mav = "mavros_msgs"
val msgs = new File(mav + "/" + "msg/").listFiles.toList
val srvs = new File(mav + "/" + "msg/").listFiles.toList

val constant = raw"(\S+)\s(\S+)=(\S+)$$".r
val data = raw"(\S+)\s(\S+)$$".r

for (msg <- msgs) {
  
  val str = msgToScala(msg)
  //writeFile(msg, str)
}

for (srv <- srvs) {
  
  val str = srvToScala(srv)
  //writeFile(msg, str)
}

def msgToScala(f: File) = {
  val lines = io.Source.fromFile(f).getLines.filterNot(_.startsWith("#"))
  println(f.getName)
  lines foreach { _ match {
    case constant(a,b,c) => println(a, b, c)
    case data(a, b) => println(a, b)
    case _ => ()
  }}
  println()
}

def srvToScala(f: File) = {
  val lines = io.Source.fromFile(f).getLines.filterNot(_.startsWith("#"))
}
def writeFile(f: File, c: String) = {
  println(f.getName)
  val out = new File("ros/src/main/scala/mavros_msgs/"+f.getName)
  if (out.exists)
    out.delete()
  out.createNewFile
}

