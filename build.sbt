name :="hello"
version :="1.0.0"
scalaVersion :="2.12.6"



import sbt._
import Keys._

lazy val common = project.in(file(".")).aggregate(welcome_impl,utils)

lazy val utils=project

lazy val welcome_impl=project.settings(name:="welcome_impl",
			libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.2" % Test)
			.dependsOn(utils)



