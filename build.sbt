scalaVersion in ThisBuild := "2.12.1"

organization in ThisBuild := "ppl-stanford"

version in ThisBuild := "0.1"

isSnapshot := true

retrieveManaged := true

val paradiseVersion = "2.1.0"

publishArtifact := false

val commonSettings = Seq(

resolvers += Resolver.sonatypeRepo("snapshots"),
resolvers += Resolver.sonatypeRepo("releases"),
  addCompilerPlugin("org.scalamacros" % "paradise" % paradiseVersion cross CrossVersion.full)

)

lazy val ros = project
  .settings(commonSettings)

lazy val apps = project
  .settings(commonSettings,
    assemblyJarName in assembly := "spatial.ros-apps.jar")
  .dependsOn(ros)
