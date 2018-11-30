lazy val catsVersion = "1.4.0"

lazy val `scala-sandbox` = (project in file(".")).
  settings(
    inThisBuild(Seq(
      organization := "com.github.DmytroOrlov",
      version      := "0.1.0-SNAPSHOT",

      scalaVersion := "2.12.7",
      scalacOptions += "-Ypartial-unification"
    )),
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core" % catsVersion,
      "org.typelevel" %% "cats-macros" % catsVersion,
      "org.typelevel" %% "cats-kernel" % catsVersion,
      "org.typelevel" %% "cats-effect" % "1.0.0",
      "io.monix" %% "monix" % "3.0.0-RC2",
      "io.monix" %% "monix-eval" % "3.0.0-RC2",

      "org.scalatest" %% "scalatest" % "3.0.5" % Test,
      "org.scalacheck" %% "scalacheck" % "1.14.0" % Test
    )
  )
