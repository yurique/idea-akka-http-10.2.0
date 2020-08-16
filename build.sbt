lazy val akkaHttpVersion = "10.2.0"
lazy val akkaVersion    = "2.6.8"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization    := "idea.test",
      scalaVersion    := "2.13.3"
    )),
    name := "idea-akka-http-10.2.0",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http"                % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-actor-typed"         % akkaVersion,
    )
  )
