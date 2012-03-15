package dispatch {
  // the three imports below use the current `dispatch` scope!
  import twitter._

  package bug {
    // this singleton object is the application
    object DispatchTwitterBug {
      // one http access point, please!
      val http = new Http with JdkLogging
      // ---BY YOUR COMMAND---
      def main(args: Array[String]) {
        println(try {
          val User.followers_count(followerCount) = http(User("n8han").show)
          "success : %s followers" format followerCount
        } catch {
          case t => "fail : %s" format (t.getClass())
        })
      }
    }
  }
}
