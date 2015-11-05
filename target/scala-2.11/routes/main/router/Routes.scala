
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Meili/Documents/Betgram/betgram-webapp-backend/conf/routes
// @DATE:Thu Nov 05 16:07:18 COT 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_1: controllers.Application,
  // @LINE:38
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:38
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """club""", """controllers.Application.addClub()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """blog""", """controllers.Application.addBlog()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """city""", """controllers.Application.addCity()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """confederation""", """controllers.Application.addConfederation()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """country""", """controllers.Application.addCountry()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ground""", """controllers.Application.addGround()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """league""", """controllers.Application.addLeague()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """manager""", """controllers.Application.addManager()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """payment""", """controllers.Application.addPayment()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """position""", """controllers.Application.addPosition()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subscription""", """controllers.Application.addSubscription()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.Application.addUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """player""", """controllers.Application.addPlayer()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clubs""", """controllers.Application.getClubs()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """blogs""", """controllers.Application.getBlogs()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cities""", """controllers.Application.getCities()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """confederations""", """controllers.Application.getConfederations()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """countries""", """controllers.Application.getCountries()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grounds""", """controllers.Application.getGrounds()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """leagues""", """controllers.Application.getClubs()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """managers""", """controllers.Application.getManagers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """payments""", """controllers.Application.getPayments()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """positions""", """controllers.Application.getPositions()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subscriptions""", """controllers.Application.getSubscriptions()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.Application.getUsers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """players""", """controllers.Application.getPlayers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_addClub1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("club")))
  )
  private[this] lazy val controllers_Application_addClub1_invoker = createInvoker(
    Application_1.addClub(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addClub",
      Nil,
      "POST",
      """""",
      this.prefix + """club"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_addBlog2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("blog")))
  )
  private[this] lazy val controllers_Application_addBlog2_invoker = createInvoker(
    Application_1.addBlog(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addBlog",
      Nil,
      "POST",
      """""",
      this.prefix + """blog"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_addCity3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("city")))
  )
  private[this] lazy val controllers_Application_addCity3_invoker = createInvoker(
    Application_1.addCity(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addCity",
      Nil,
      "POST",
      """""",
      this.prefix + """city"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_addConfederation4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confederation")))
  )
  private[this] lazy val controllers_Application_addConfederation4_invoker = createInvoker(
    Application_1.addConfederation(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addConfederation",
      Nil,
      "POST",
      """""",
      this.prefix + """confederation"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_addCountry5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("country")))
  )
  private[this] lazy val controllers_Application_addCountry5_invoker = createInvoker(
    Application_1.addCountry(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addCountry",
      Nil,
      "POST",
      """""",
      this.prefix + """country"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_addGround6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ground")))
  )
  private[this] lazy val controllers_Application_addGround6_invoker = createInvoker(
    Application_1.addGround(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addGround",
      Nil,
      "POST",
      """""",
      this.prefix + """ground"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_addLeague7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("league")))
  )
  private[this] lazy val controllers_Application_addLeague7_invoker = createInvoker(
    Application_1.addLeague(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addLeague",
      Nil,
      "POST",
      """""",
      this.prefix + """league"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Application_addManager8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("manager")))
  )
  private[this] lazy val controllers_Application_addManager8_invoker = createInvoker(
    Application_1.addManager(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addManager",
      Nil,
      "POST",
      """""",
      this.prefix + """manager"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Application_addPayment9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payment")))
  )
  private[this] lazy val controllers_Application_addPayment9_invoker = createInvoker(
    Application_1.addPayment(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addPayment",
      Nil,
      "POST",
      """""",
      this.prefix + """payment"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Application_addPosition10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("position")))
  )
  private[this] lazy val controllers_Application_addPosition10_invoker = createInvoker(
    Application_1.addPosition(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addPosition",
      Nil,
      "POST",
      """""",
      this.prefix + """position"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_addSubscription11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subscription")))
  )
  private[this] lazy val controllers_Application_addSubscription11_invoker = createInvoker(
    Application_1.addSubscription(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addSubscription",
      Nil,
      "POST",
      """""",
      this.prefix + """subscription"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_addUser12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_Application_addUser12_invoker = createInvoker(
    Application_1.addUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addUser",
      Nil,
      "POST",
      """""",
      this.prefix + """user"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Application_addPlayer13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("player")))
  )
  private[this] lazy val controllers_Application_addPlayer13_invoker = createInvoker(
    Application_1.addPlayer(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addPlayer",
      Nil,
      "POST",
      """""",
      this.prefix + """player"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Application_getClubs14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clubs")))
  )
  private[this] lazy val controllers_Application_getClubs14_invoker = createInvoker(
    Application_1.getClubs(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getClubs",
      Nil,
      "GET",
      """""",
      this.prefix + """clubs"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_getBlogs15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("blogs")))
  )
  private[this] lazy val controllers_Application_getBlogs15_invoker = createInvoker(
    Application_1.getBlogs(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getBlogs",
      Nil,
      "GET",
      """""",
      this.prefix + """blogs"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Application_getCities16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cities")))
  )
  private[this] lazy val controllers_Application_getCities16_invoker = createInvoker(
    Application_1.getCities(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getCities",
      Nil,
      "GET",
      """""",
      this.prefix + """cities"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Application_getConfederations17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confederations")))
  )
  private[this] lazy val controllers_Application_getConfederations17_invoker = createInvoker(
    Application_1.getConfederations(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getConfederations",
      Nil,
      "GET",
      """""",
      this.prefix + """confederations"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Application_getCountries18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("countries")))
  )
  private[this] lazy val controllers_Application_getCountries18_invoker = createInvoker(
    Application_1.getCountries(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getCountries",
      Nil,
      "GET",
      """""",
      this.prefix + """countries"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Application_getGrounds19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grounds")))
  )
  private[this] lazy val controllers_Application_getGrounds19_invoker = createInvoker(
    Application_1.getGrounds(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getGrounds",
      Nil,
      "GET",
      """""",
      this.prefix + """grounds"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Application_getClubs20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("leagues")))
  )
  private[this] lazy val controllers_Application_getClubs20_invoker = createInvoker(
    Application_1.getClubs(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getClubs",
      Nil,
      "GET",
      """""",
      this.prefix + """leagues"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Application_getManagers21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("managers")))
  )
  private[this] lazy val controllers_Application_getManagers21_invoker = createInvoker(
    Application_1.getManagers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getManagers",
      Nil,
      "GET",
      """""",
      this.prefix + """managers"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Application_getPayments22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payments")))
  )
  private[this] lazy val controllers_Application_getPayments22_invoker = createInvoker(
    Application_1.getPayments(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getPayments",
      Nil,
      "GET",
      """""",
      this.prefix + """payments"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Application_getPositions23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("positions")))
  )
  private[this] lazy val controllers_Application_getPositions23_invoker = createInvoker(
    Application_1.getPositions(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getPositions",
      Nil,
      "GET",
      """""",
      this.prefix + """positions"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Application_getSubscriptions24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subscriptions")))
  )
  private[this] lazy val controllers_Application_getSubscriptions24_invoker = createInvoker(
    Application_1.getSubscriptions(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getSubscriptions",
      Nil,
      "GET",
      """""",
      this.prefix + """subscriptions"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_Application_getUsers25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_Application_getUsers25_invoker = createInvoker(
    Application_1.getUsers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getUsers",
      Nil,
      "GET",
      """""",
      this.prefix + """users"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_Application_getPlayers26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("players")))
  )
  private[this] lazy val controllers_Application_getPlayers26_invoker = createInvoker(
    Application_1.getPlayers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getPlayers",
      Nil,
      "GET",
      """""",
      this.prefix + """players"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Assets_versioned27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned27_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index())
      }
  
    // @LINE:7
    case controllers_Application_addClub1_route(params) =>
      call { 
        controllers_Application_addClub1_invoker.call(Application_1.addClub())
      }
  
    // @LINE:8
    case controllers_Application_addBlog2_route(params) =>
      call { 
        controllers_Application_addBlog2_invoker.call(Application_1.addBlog())
      }
  
    // @LINE:9
    case controllers_Application_addCity3_route(params) =>
      call { 
        controllers_Application_addCity3_invoker.call(Application_1.addCity())
      }
  
    // @LINE:10
    case controllers_Application_addConfederation4_route(params) =>
      call { 
        controllers_Application_addConfederation4_invoker.call(Application_1.addConfederation())
      }
  
    // @LINE:11
    case controllers_Application_addCountry5_route(params) =>
      call { 
        controllers_Application_addCountry5_invoker.call(Application_1.addCountry())
      }
  
    // @LINE:12
    case controllers_Application_addGround6_route(params) =>
      call { 
        controllers_Application_addGround6_invoker.call(Application_1.addGround())
      }
  
    // @LINE:13
    case controllers_Application_addLeague7_route(params) =>
      call { 
        controllers_Application_addLeague7_invoker.call(Application_1.addLeague())
      }
  
    // @LINE:14
    case controllers_Application_addManager8_route(params) =>
      call { 
        controllers_Application_addManager8_invoker.call(Application_1.addManager())
      }
  
    // @LINE:15
    case controllers_Application_addPayment9_route(params) =>
      call { 
        controllers_Application_addPayment9_invoker.call(Application_1.addPayment())
      }
  
    // @LINE:16
    case controllers_Application_addPosition10_route(params) =>
      call { 
        controllers_Application_addPosition10_invoker.call(Application_1.addPosition())
      }
  
    // @LINE:17
    case controllers_Application_addSubscription11_route(params) =>
      call { 
        controllers_Application_addSubscription11_invoker.call(Application_1.addSubscription())
      }
  
    // @LINE:18
    case controllers_Application_addUser12_route(params) =>
      call { 
        controllers_Application_addUser12_invoker.call(Application_1.addUser())
      }
  
    // @LINE:19
    case controllers_Application_addPlayer13_route(params) =>
      call { 
        controllers_Application_addPlayer13_invoker.call(Application_1.addPlayer())
      }
  
    // @LINE:21
    case controllers_Application_getClubs14_route(params) =>
      call { 
        controllers_Application_getClubs14_invoker.call(Application_1.getClubs())
      }
  
    // @LINE:22
    case controllers_Application_getBlogs15_route(params) =>
      call { 
        controllers_Application_getBlogs15_invoker.call(Application_1.getBlogs())
      }
  
    // @LINE:23
    case controllers_Application_getCities16_route(params) =>
      call { 
        controllers_Application_getCities16_invoker.call(Application_1.getCities())
      }
  
    // @LINE:24
    case controllers_Application_getConfederations17_route(params) =>
      call { 
        controllers_Application_getConfederations17_invoker.call(Application_1.getConfederations())
      }
  
    // @LINE:25
    case controllers_Application_getCountries18_route(params) =>
      call { 
        controllers_Application_getCountries18_invoker.call(Application_1.getCountries())
      }
  
    // @LINE:26
    case controllers_Application_getGrounds19_route(params) =>
      call { 
        controllers_Application_getGrounds19_invoker.call(Application_1.getGrounds())
      }
  
    // @LINE:27
    case controllers_Application_getClubs20_route(params) =>
      call { 
        controllers_Application_getClubs20_invoker.call(Application_1.getClubs())
      }
  
    // @LINE:28
    case controllers_Application_getManagers21_route(params) =>
      call { 
        controllers_Application_getManagers21_invoker.call(Application_1.getManagers())
      }
  
    // @LINE:29
    case controllers_Application_getPayments22_route(params) =>
      call { 
        controllers_Application_getPayments22_invoker.call(Application_1.getPayments())
      }
  
    // @LINE:30
    case controllers_Application_getPositions23_route(params) =>
      call { 
        controllers_Application_getPositions23_invoker.call(Application_1.getPositions())
      }
  
    // @LINE:31
    case controllers_Application_getSubscriptions24_route(params) =>
      call { 
        controllers_Application_getSubscriptions24_invoker.call(Application_1.getSubscriptions())
      }
  
    // @LINE:32
    case controllers_Application_getUsers25_route(params) =>
      call { 
        controllers_Application_getUsers25_invoker.call(Application_1.getUsers())
      }
  
    // @LINE:33
    case controllers_Application_getPlayers26_route(params) =>
      call { 
        controllers_Application_getPlayers26_invoker.call(Application_1.getPlayers())
      }
  
    // @LINE:38
    case controllers_Assets_versioned27_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned27_invoker.call(Assets_0.versioned(path, file))
      }
  }
}