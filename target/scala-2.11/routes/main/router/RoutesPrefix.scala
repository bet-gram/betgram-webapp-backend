
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/scvalencia606/Documents/black-widow/betgram/betgram-webapp-backend/conf/routes
// @DATE:Sun Nov 08 12:11:46 COT 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
