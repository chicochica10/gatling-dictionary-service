package computerdatabase.advanced

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import java.util.concurrent.ThreadLocalRandom

class DictionaryServiceSimulation extends Simulation {

  object DictionaryService {

    val getDictionary = exec(http("dictionary for user1")
      .get("/user1"))
      .pause(1)
  }
 
  val httpConf = http
    .baseURL("http://localhost:5000/dictionary")
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
    .doNotTrackHeader("1")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .acceptEncodingHeader("gzip, deflate")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0")

  val users = scenario("BankUsers").exec(DictionaryService.getDictionary)
  
  setUp(
    users.inject(rampUsers(10) over (10 seconds))
  ).protocols(httpConf)
}
