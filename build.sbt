import Dependencies._

lazy val `scala-sandbox` = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.github.DmytroOrlov",
      scalaVersion := "2.12.7",
      version      := "0.1.0-SNAPSHOT"
    )),
    libraryDependencies ++= Seq(
      scalaTest % Test,
      scalaCheck % Test
    )
  )
