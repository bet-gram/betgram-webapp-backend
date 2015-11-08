
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/scvalencia606/Documents/black-widow/betgram/betgram-webapp-backend/conf/routes
// @DATE:Sat Nov 07 15:36:16 COT 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:55
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:55
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
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "grounds"})
        }
      """
    )
  
    // @LINE:9
    def addCity: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addCity",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cities"})
        }
      """
    )
  
    // @LINE:15
    def addPayment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addPayment",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "payments"})
        }
      """
    )
  
    // @LINE:39
    def getCityId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getCityId",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cities/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:16
    def addPosition: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addPosition",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "positions"})
        }
      """
    )
  
    // @LINE:29
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
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
    // @LINE:30
    def getPayments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getPayments",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "payments"})
        }
      """
    )
  
    // @LINE:48
    def getUserId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getUserId",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:22
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
  
    // @LINE:38
    def getBlogId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getBlogId",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "blogs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:23
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
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "managers"})
        }
      """
    )
  
    // @LINE:20
    def addStatistic: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addStatistic",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "statistics"})
        }
      """
    )
  
    // @LINE:8
    def addBlog: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addBlog",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "blogs"})
        }
      """
    )
  
    // @LINE:34
    def getPlayers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getPlayers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "players"})
        }
      """
    )
  
    // @LINE:50
    def getStatisticId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getStatisticId",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "statistics/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:17
    def addSubscription: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addSubscription",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "subscriptions"})
        }
      """
    )
  
    // @LINE:33
    def getUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
    // @LINE:31
    def getPositions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getPositions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "positions"})
        }
      """
    )
  
    // @LINE:37
    def getClubId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getClubId",
      """
        function(id) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clubs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
          }
        
        }
      """
    )
  
    // @LINE:26
    def getCountries: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getCountries",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "countries"})
        }
      """
    )
  
    // @LINE:32
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
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clubs"})
        }
      """
    )
  
    // @LINE:25
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
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "players"})
        }
      """
    )
  
    // @LINE:40
    def getConfederationId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getConfederationId",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "confederations/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:47
    def getSubscriptionId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getSubscriptionId",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subscriptions/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:10
    def addConfederation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addConfederation",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "confederations"})
        }
      """
    )
  
    // @LINE:49
    def getPlayerId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getPlayerId",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "players/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:46
    def getPositionId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getPositionId",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "positions/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:42
    def getGroundId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getGroundId",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "grounds/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:24
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
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "countries"})
        }
      """
    )
  
    // @LINE:27
    def getGrounds: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getGrounds",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "grounds"})
        }
      """
    )
  
    // @LINE:44
    def getManagerId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getManagerId",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "managers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:45
    def getPaymentId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getPaymentId",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "payments/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
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
  
    // @LINE:35
    def getStatistics: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getStatistics",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "statistics"})
        }
      """
    )
  
    // @LINE:41
    def getCountryId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getCountryId",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "countries/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:13
    def addLeague: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addLeague",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "leagues"})
        }
      """
    )
  
  }


}