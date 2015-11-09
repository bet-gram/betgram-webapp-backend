
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/scvalencia606/Documents/black-widow/betgram/betgram-webapp-backend/conf/routes
// @DATE:Mon Nov 09 11:55:11 COT 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:27
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def summary: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.summary",
      """
        function(team1,team2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "summary/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("team1", encodeURIComponent(team1)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("team2", encodeURIComponent(team2))})
        }
      """
    )
  
    // @LINE:21
    def matches: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.matches",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "matches"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}