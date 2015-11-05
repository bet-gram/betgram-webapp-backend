
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Meili/Documents/Betgram/betgram-webapp-backend/conf/routes
// @DATE:Thu Nov 05 16:07:18 COT 2015

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:38
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
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
      Call("POST", _prefix + { _defaultPrefix } + "ground")
    }
  
    // @LINE:9
    def addCity(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "city")
    }
  
    // @LINE:15
    def addPayment(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "payment")
    }
  
    // @LINE:16
    def addPosition(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "position")
    }
  
    // @LINE:28
    def getManagers(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "managers")
    }
  
    // @LINE:18
    def addUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "user")
    }
  
    // @LINE:29
    def getPayments(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "payments")
    }
  
    // @LINE:21
    def getClubs(): Call = {
    
      () match {
      
        // @LINE:21
        case ()  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "clubs")
      
      }
    
    }
  
    // @LINE:22
    def getBlogs(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "blogs")
    }
  
    // @LINE:14
    def addManager(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "manager")
    }
  
    // @LINE:8
    def addBlog(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "blog")
    }
  
    // @LINE:33
    def getPlayers(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "players")
    }
  
    // @LINE:17
    def addSubscription(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "subscription")
    }
  
    // @LINE:32
    def getUsers(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users")
    }
  
    // @LINE:30
    def getPositions(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "positions")
    }
  
    // @LINE:25
    def getCountries(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "countries")
    }
  
    // @LINE:31
    def getSubscriptions(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "subscriptions")
    }
  
    // @LINE:7
    def addClub(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "club")
    }
  
    // @LINE:24
    def getConfederations(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "confederations")
    }
  
    // @LINE:19
    def addPlayer(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "player")
    }
  
    // @LINE:10
    def addConfederation(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "confederation")
    }
  
    // @LINE:23
    def getCities(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "cities")
    }
  
    // @LINE:11
    def addCountry(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "country")
    }
  
    // @LINE:26
    def getGrounds(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "grounds")
    }
  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:13
    def addLeague(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "league")
    }
  
  }


}