
name := "dispatch-twitter-bug"

version := "0.8.7"

scalaVersion := "2.9.1"

libraryDependencies ~= { seq =>
  val vers = "0.8.7"
  seq ++ Seq(
    "net.databinder" %% "dispatch-core" % vers,
    "net.databinder" %% "dispatch-oauth" % vers,
    "net.databinder" %% "dispatch-nio" % vers
  )
}

initialCommands := "import dispatch._"
