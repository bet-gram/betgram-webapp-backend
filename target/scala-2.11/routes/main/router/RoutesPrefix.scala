
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Meili/Documents/Betgram/betgram-webapp-backend/conf/routes
// @DATE:Thu Nov 05 14:04:18 COT 2015


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