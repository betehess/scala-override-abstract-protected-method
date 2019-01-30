version in ThisBuild := "0.0.1"

scalaVersion in ThisBuild := "2.12.8"

lazy val root = project
  .in(file("."))
  .settings(
    libraryDependencies += "org.kohsuke" % "github-api" % "1.95"
  )
