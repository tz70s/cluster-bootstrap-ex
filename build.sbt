name := "cluster-bootstrap-ex"

version := "0.1"

scalaVersion := "2.12.6"

lazy val akkaVersion = "2.5.14"

lazy val dependencies = Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster" % akkaVersion
)

libraryDependencies ++= dependencies
