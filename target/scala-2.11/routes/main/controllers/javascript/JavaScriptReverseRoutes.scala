
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Meili/Documents/Betgram/betgram-webapp-backend/conf/routes
// @DATE:Thu Nov 05 16:07:18 COT 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:38
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
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
  
    // @LINE:28
    def getManagers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getManagers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "managers"})
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
  
    // @LINE:29
    def getPayments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getPayments",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "payments"})
        }
      """
    )
  
    // @LINE:21
    def getClubs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getClubs",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clubs"})
          }
        
        }
      """
    )
  
    // @LINE:22
    def getBlogs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getBlogs",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "blogs"})
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
  
    // @LINE:33
    def getPlayers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getPlayers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "players"})
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
  
    // @LINE:32
    def getUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
    // @LINE:30
    def getPositions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getPositions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "positions"})
        }
      """
    )
  
    // @LINE:25
    def getCountries: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getCountries",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "countries"})
        }
      """
    )
  
    // @LINE:31
    def getSubscriptions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getSubscriptions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subscriptions"})
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
  
    // @LINE:24
    def getConfederations: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getConfederations",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "confederations"})
        }
      """
    )
  
    // @LINE:19
    def addPlayer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addPlayer",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "player"})
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
  
    // @LINE:23
    def getCities: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getCities",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cities"})
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
  
    // @LINE:26
    def getGrounds: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getGrounds",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "grounds"})
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