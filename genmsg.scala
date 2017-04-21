#!/usr/bin/env scala

import java.io._

val mav = "mavros_msgs"
val msgs = new File(mav + "/" + "msg/").listFiles.toList
val srvs = new File(mav + "/" + "srv/").listFiles.toList

val constant = raw"(\S+)\s(\S+)=(\S+)$$".r
val data = raw"(\S+)\s(\S+)$$".r

for (msg <- msgs) {
  
  val str = msgToScala(msg)
  writeFile(msg, str)
}

for (srv <- srvs) {
  
  val str = srvToScala(srv)
  writeFile(srv, str)
}

def remap(tp: String) =
  tp

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
    case data(a, b) if !a.contains("Header") =>
      b + ": " + remap(a)
  }

  cc += datas.mkString(", ")
  cc += ")"

  o += constants.mkString("/n")
  o += "\n}"

  cc + "\n" + o
}

def srvToScala(f: File) = {
  val lines = io.Source.fromFile(f).getLines.filterNot(_.startsWith("#")).toList
  val (req, repP) = lines.splitAt(lines.indexOf("---"))
  val rep = repP.drop(1)
  val name = f.getName

  var response = false  
  var ccReq = "case class " + name+ "("
  var ccRep = "case class " + name+ "Reply("
  var o = "object " +name + " {"

  val constantsReq = req collect {
    case constant(a,b,c) =>
      "val " + b + " = " + c
  }
  val datasReq = req collect {
    case data(a, b) if !a.contains("Header") =>
      b + ": " + remap(a)
  }


  val constantsRep = rep collect {
    case constant(a,b,c) =>
      "val " + b + " = " + c
  }
  val datasRep = rep collect {
    case data(a, b) if !a.contains("Header") =>
      b + ": " + remap(a)
  }

  ccReq += datasReq.mkString(", ")
  ccReq += ")"

  ccRep += datasRep.mkString(", ")
  ccRep += ")"

  o += constantsReq.mkString("/n")
  o += constantsRep.mkString("/n")  
  o += "\n}"

  ccReq + "/n" + ccRep + "/n" + o

}
def writeFile(f: File, s: String) = {
  val out = new File("ros/src/main/scala/mavros_msgs/"+(f.getName.split('.')(0))+".scala")
  out.mkdirs()
  if (out.exists)
    out.delete()
  out.createNewFile
  val pw = new PrintWriter(out)
  pw.println(s)
  pw.close()
}

