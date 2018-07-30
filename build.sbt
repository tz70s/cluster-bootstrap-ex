name := "cluster-bootstrap-ex"

version := "0.1"

scalaVersion := "2.12.6"

lazy val akkaVersion = "2.5.14"
lazy val akkaManagementVersion = "0.17.0"

lazy val dependencies = Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster" % akkaVersion,
  "com.lightbend.akka.management" %% "akka-management" % akkaManagementVersion,
  "com.lightbend.akka.management" %% "akka-management-cluster-http" % akkaManagementVersion,
  "com.lightbend.akka.management" %% "akka-management-cluster-bootstrap" % akkaManagementVersion,
  "com.lightbend.akka.discovery" %% "akka-discovery-config" % akkaManagementVersion
)

libraryDependencies ++= dependencies
