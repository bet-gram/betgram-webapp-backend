
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Meili/Documents/Betgram/betgram-webapp-backend/conf/routes
// @DATE:Thu Nov 05 14:04:18 COT 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:22
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
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

  
    // @LINE:12
    def addGround: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addGround",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "ground"})
        }
      """
    )
  
    // @LINE:9
    def addCity: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addCity",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "city"})
        }
      """
    )
  
    // @LINE:15
    def addPayment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addPayment",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "payment"})
        }
      """
    )
  
    // @LINE:16
    def addPosition: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addPosition",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "position"})
        }
      """
    )
  
    // @LINE:18
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
        }
      """
    )
  
    // @LINE:14
    def addManager: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addManager",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "manager"})
        }
      """
    )
  
    // @LINE:8
    def addBlog: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addBlog",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "blog"})
        }
      """
    )
  
    // @LINE:17
    def addSubscription: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addSubscription",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "subscription"})
        }
      """
    )
  
    // @LINE:7
    def addClub: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addClub",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "club"})
        }
      """
    )
  
    // @LINE:10
    def addConfederation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addConfederation",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "confederation"})
        }
      """
    )
  
    // @LINE:11
    def addCountry: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addCountry",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "country"})
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
  
    // @LINE:13
    def addLeague: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addLeague",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "league"})
        }
      """
    )
  
  }


}