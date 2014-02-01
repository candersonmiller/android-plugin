name := "sbt-android"

organization := "org.scala-sbt"

version := "0.7.1-SNAPSHOT"

scalaVersion := "2.9.2"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-Xcheckinit", "-Xfatal-warnings")

publishMavenStyle := false

publishTo := Some(Resolver.file("file", new File( Path.userHome+"/.ivy2/local/")) )

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

libraryDependencies ++= Seq(
  "com.google.android.tools" % "ddmlib" % "r10",
  "net.sf.proguard" % "proguard-base" % "4.8"
)

sbtPlugin := true

commands += Status.stampVersion
