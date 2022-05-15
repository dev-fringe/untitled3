ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.2"

lazy val root = (project in file("."))
  .settings(
    name := "untitled3"
  )
libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot-starter-web" % "1.5.4.RELEASE",
  "org.springframework.boot" % "spring-boot-configuration-processor" % "1.5.4.RELEASE"
)
