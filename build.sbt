
resolvers += Resolver.sonatypeRepo("snapshots")

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "dev.odealva",
      scalaVersion := "2.13.3"
    )),
    name := "openjdk-test"
  )
  .aggregate(docker)

import com.typesafe.sbt.packager.docker._

lazy val docker = (project in file("."))
  .enablePlugins(DockerPlugin)
  .enablePlugins(AshScriptPlugin)
  .settings(
    name := "openjdk-test",
    packageName in Docker := "openjdk-test",
    Defaults.itSettings,
    dockerBaseImage := "adoptopenjdk:11-jre-hotspot-bionic",
    dockerUpdateLatest := true
  )