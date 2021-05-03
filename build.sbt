name := "Common"

version := "0.1"

scalaVersion := "2.13.5"


libraryDependencies += "org.scalactic" %% "scalactic" % "3.3.0-SNAP3"

libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.4.0-M7"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test

libraryDependencies += "org.mockito" %% "mockito-scala" % "1.16.37" % Test

lazy val rest = project.in(file("rest"))
  .settings{
    libraryDependencies += "com.typesafe.play" %% "play-akka-http-server" % "2.8.8"

    libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.6.14"

    libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.6.14"

    libraryDependencies += "org.json4s" %% "json4s-native" % "3.7.0-M16"

    libraryDependencies += "com.typesafe.akka" %% "akka-stream-testkit" % "2.6.14" % Test

    libraryDependencies += "com.typesafe.akka" %% "akka-http-testkit" % "10.2.4" % Test

    libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.6.14" % Test

  }


lazy val root = project.in(file(".")).aggregate(rest)
