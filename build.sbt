scalaVersion := "2.13.12"

name := "genbc"
organization := "com.pigumer"
version := "1.0"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-parser-combinators" % "2.3.0",
  "com.google.zxing" % "javase" % "3.5.0"
)

