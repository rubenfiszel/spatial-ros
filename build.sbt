scalaVersion in ThisBuild := "2.12.1"

organization := "ppl-stanford"

version := "0.1"

name := "spatial-ros"

val paradiseVersion = "2.1.0"

publishArtifact := false

val commonSettings = Seq(

//paradise
resolvers += Resolver.sonatypeRepo("snapshots"),
resolvers += Resolver.sonatypeRepo("releases"),
  addCompilerPlugin("org.scalamacros" % "paradise" % paradiseVersion cross CrossVersion.full)

)

lazy val ros = project
  .settings(commonSettings)

lazy val apps = project
  .settings(commonSettings)
  .dependsOn(ros)
