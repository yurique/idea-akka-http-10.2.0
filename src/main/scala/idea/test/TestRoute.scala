package idea.test

import akka.http.scaladsl.common.{ NameOptionReceptacle, NameReceptacle }
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route

class TestRoute  {

  def routeGood: Route =
      parameter("test-param".as[Int] /*: NameReceptacle[Int]*/) { p =>
        complete("done")
      }

  def routeRed: Route =
      parameter("test-param".as[Int].? /* NameOptionReceptacle[Int] */) { p =>
        complete("done")
      }

}
