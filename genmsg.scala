#!/usr/bin/env scala

import java.io.File


val mav = "mavros_msgs"
val msgs = new File(mav + "/" + "msg/").listFiles.toList
val srvs = new File(mav + "/" + "srv/").listFiles.toList

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
  val lines = io.Source.fromFile(f).getLines.filterNot(_.startsWith("#")).toList
  val name = f.getName

  var cc = "case class " + name + "("
  var o = "object " +name + " {"

  val constants = lines collect {
    case constant(a,b,c) =>
      "val " + b + " = " + c
  }
  val datas = lines collect {
    case data(a, b) =>
      b + ": " + a
  }

  cc += datas.mkString(",")
  cc += ")"

  o += constants.mkString("/n")
  o += "\n}"

  cc + "\n" + o
}

def srvToScala(f: File) = {
  val lines = io.Source.fromFile(f).getLines.filterNot(_.startsWith("#")).toList
  val (req, rep) = lines.splitAt(lines.indexOf("---"))
  val name = f.getName

  var response = false  
  var cc = "case class " + name+ "("
  var o = "object " +name + " {"

  val constantsReq = req collect {
    case constant(a,b,c) =>
      "val " + b + " = " + c
  }
  val datasReq = req collect {
    case data(a, b) =>
      b + ": " + a
  }


  val constantsRep = rep collect {
    case constant(a,b,c) =>
      "val " + b + " = " + c
  }
  val datasRep = rep collect {
    case data(a, b) =>
      b + ": " + a
  }

  cc += datasReq.mkString(",")
  cc += ")"

  o += constantsReq.mkString("/n")
  o += "\n}"

}
def writeFile(f: File, c: String) = {
  println(f.getName)
  val out = new File("ros/src/main/scala/mavros_msgs/"+f.getName)
  out.mkdirs()
  if (out.exists)
    out.delete()
  out.createNewFile
}

