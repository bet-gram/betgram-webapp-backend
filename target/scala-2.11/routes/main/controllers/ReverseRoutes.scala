
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Meili/Documents/Betgram/betgram-webapp-backend/conf/routes
// @DATE:Thu Nov 05 23:17:58 COT 2015

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:55
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:55
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def addGround(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "grounds")
    }
  
    // @LINE:9
    def addCity(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "cities")
    }
  
    // @LINE:15
    def addPayment(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "payments")
    }
  
    // @LINE:39
    def getCityId(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "cities/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:16
    def addPosition(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "positions")
    }
  
    // @LINE:29
    def getManagers(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "managers")
    }
  
    // @LINE:18
    def addUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "users")
    }
  
    // @LINE:30
    def getPayments(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "payments")
    }
  
    // @LINE:48
    def getUserId(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:22
    def getClubs(): Call = {
    
      () match {
      
        // @LINE:22
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "clubs")
      
      }
    
    }
  
    // @LINE:38
    def getBlogId(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "blogs/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:23
    def getBlogs(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "blogs")
    }
  
    // @LINE:14
    def addManager(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "managers")
    }
  
    // @LINE:20
    def addStatistic(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "statistics")
    }
  
    // @LINE:8
    def addBlog(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "blogs")
    }
  
    // @LINE:34
    def getPlayers(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "players")
    }
  
    // @LINE:50
    def getStatisticId(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "statistics/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:17
    def addSubscription(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "subscriptions")
    }
  
    // @LINE:33
    def getUsers(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users")
    }
  
    // @LINE:31
    def getPositions(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "positions")
    }
  
    // @LINE:37
    def getClubId(id:Long): Call = {
    
      (id: @unchecked) match {
      
        // @LINE:37
        case (id)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "clubs/" + implicitly[PathBindable[Long]].unbind("id", id))
      
      }
    
    }
  
    // @LINE:26
    def getCountries(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "countries")
    }
  
    // @LINE:32
    def getSubscriptions(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "subscriptions")
    }
  
    // @LINE:7
    def addClub(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "clubs")
    }
  
    // @LINE:25
    def getConfederations(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "confederations")
    }
  
    // @LINE:19
    def addPlayer(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "players")
    }
  
    // @LINE:40
    def getConfederationId(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "confederations/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:47
    def getSubscriptionId(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "subscriptions/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:10
    def addConfederation(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "confederations")
    }
  
    // @LINE:49
    def getPlayerId(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "players/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:46
    def getPositionId(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "positions/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:42
    def getGroundId(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "grounds/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:24
    def getCities(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "cities")
    }
  
    // @LINE:11
    def addCountry(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "countries")
    }
  
    // @LINE:27
    def getGrounds(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "grounds")
    }
  
    // @LINE:44
    def getManagerId(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "managers/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:45
    def getPaymentId(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "payments/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:35
    def getStatistics(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "statistics")
    }
  
    // @LINE:41
    def getCountryId(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "countries/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:13
    def addLeague(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "leagues")
    }
  
  }


}