
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/scvalencia606/Documents/black-widow/betgram/betgram-webapp-backend/conf/routes
// @DATE:Sat Nov 07 15:36:16 COT 2015

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
  // @LINE:55
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:55
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
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clubs""", """controllers.Application.addClub()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """blogs""", """controllers.Application.addBlog()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cities""", """controllers.Application.addCity()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """confederations""", """controllers.Application.addConfederation()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """countries""", """controllers.Application.addCountry()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grounds""", """controllers.Application.addGround()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """leagues""", """controllers.Application.addLeague()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """managers""", """controllers.Application.addManager()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """payments""", """controllers.Application.addPayment()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """positions""", """controllers.Application.addPosition()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subscriptions""", """controllers.Application.addSubscription()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.Application.addUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """players""", """controllers.Application.addPlayer()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statistics""", """controllers.Application.addStatistic()"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statistics""", """controllers.Application.getStatistics()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clubs/$id<[^/]+>""", """controllers.Application.getClubId(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """blogs/$id<[^/]+>""", """controllers.Application.getBlogId(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cities/$id<[^/]+>""", """controllers.Application.getCityId(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """confederations/$id<[^/]+>""", """controllers.Application.getConfederationId(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """countries/$id<[^/]+>""", """controllers.Application.getCountryId(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """grounds/$id<[^/]+>""", """controllers.Application.getGroundId(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """leagues/$id<[^/]+>""", """controllers.Application.getClubId(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """managers/$id<[^/]+>""", """controllers.Application.getManagerId(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """payments/$id<[^/]+>""", """controllers.Application.getPaymentId(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """positions/$id<[^/]+>""", """controllers.Application.getPositionId(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subscriptions/$id<[^/]+>""", """controllers.Application.getSubscriptionId(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/$id<[^/]+>""", """controllers.Application.getUserId(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """players/$id<[^/]+>""", """controllers.Application.getPlayerId(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """statistics/$id<[^/]+>""", """controllers.Application.getStatisticId(id:Long)"""),
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
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clubs")))
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
      this.prefix + """clubs"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_addBlog2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("blogs")))
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
      this.prefix + """blogs"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_addCity3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cities")))
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
      this.prefix + """cities"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_addConfederation4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confederations")))
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
      this.prefix + """confederations"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_addCountry5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("countries")))
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
      this.prefix + """countries"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_addGround6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grounds")))
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
      this.prefix + """grounds"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_addLeague7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("leagues")))
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
      this.prefix + """leagues"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Application_addManager8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("managers")))
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
      this.prefix + """managers"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Application_addPayment9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payments")))
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
      this.prefix + """payments"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Application_addPosition10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("positions")))
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
      this.prefix + """positions"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_addSubscription11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subscriptions")))
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
      this.prefix + """subscriptions"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_addUser12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
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
      this.prefix + """users"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Application_addPlayer13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("players")))
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
      this.prefix + """players"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Application_addStatistic14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statistics")))
  )
  private[this] lazy val controllers_Application_addStatistic14_invoker = createInvoker(
    Application_1.addStatistic(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addStatistic",
      Nil,
      "POST",
      """""",
      this.prefix + """statistics"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_getClubs15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clubs")))
  )
  private[this] lazy val controllers_Application_getClubs15_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_Application_getBlogs16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("blogs")))
  )
  private[this] lazy val controllers_Application_getBlogs16_invoker = createInvoker(
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

  // @LINE:24
  private[this] lazy val controllers_Application_getCities17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cities")))
  )
  private[this] lazy val controllers_Application_getCities17_invoker = createInvoker(
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

  // @LINE:25
  private[this] lazy val controllers_Application_getConfederations18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confederations")))
  )
  private[this] lazy val controllers_Application_getConfederations18_invoker = createInvoker(
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

  // @LINE:26
  private[this] lazy val controllers_Application_getCountries19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("countries")))
  )
  private[this] lazy val controllers_Application_getCountries19_invoker = createInvoker(
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

  // @LINE:27
  private[this] lazy val controllers_Application_getGrounds20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grounds")))
  )
  private[this] lazy val controllers_Application_getGrounds20_invoker = createInvoker(
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

  // @LINE:28
  private[this] lazy val controllers_Application_getClubs21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("leagues")))
  )
  private[this] lazy val controllers_Application_getClubs21_invoker = createInvoker(
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

  // @LINE:29
  private[this] lazy val controllers_Application_getManagers22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("managers")))
  )
  private[this] lazy val controllers_Application_getManagers22_invoker = createInvoker(
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

  // @LINE:30
  private[this] lazy val controllers_Application_getPayments23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payments")))
  )
  private[this] lazy val controllers_Application_getPayments23_invoker = createInvoker(
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

  // @LINE:31
  private[this] lazy val controllers_Application_getPositions24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("positions")))
  )
  private[this] lazy val controllers_Application_getPositions24_invoker = createInvoker(
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

  // @LINE:32
  private[this] lazy val controllers_Application_getSubscriptions25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subscriptions")))
  )
  private[this] lazy val controllers_Application_getSubscriptions25_invoker = createInvoker(
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

  // @LINE:33
  private[this] lazy val controllers_Application_getUsers26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_Application_getUsers26_invoker = createInvoker(
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

  // @LINE:34
  private[this] lazy val controllers_Application_getPlayers27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("players")))
  )
  private[this] lazy val controllers_Application_getPlayers27_invoker = createInvoker(
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

  // @LINE:35
  private[this] lazy val controllers_Application_getStatistics28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statistics")))
  )
  private[this] lazy val controllers_Application_getStatistics28_invoker = createInvoker(
    Application_1.getStatistics(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getStatistics",
      Nil,
      "GET",
      """""",
      this.prefix + """statistics"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Application_getClubId29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clubs/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getClubId29_invoker = createInvoker(
    Application_1.getClubId(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getClubId",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """clubs/$id<[^/]+>"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Application_getBlogId30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("blogs/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getBlogId30_invoker = createInvoker(
    Application_1.getBlogId(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getBlogId",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """blogs/$id<[^/]+>"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_Application_getCityId31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cities/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getCityId31_invoker = createInvoker(
    Application_1.getCityId(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getCityId",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """cities/$id<[^/]+>"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Application_getConfederationId32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confederations/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getConfederationId32_invoker = createInvoker(
    Application_1.getConfederationId(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getConfederationId",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """confederations/$id<[^/]+>"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Application_getCountryId33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("countries/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getCountryId33_invoker = createInvoker(
    Application_1.getCountryId(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getCountryId",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """countries/$id<[^/]+>"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_Application_getGroundId34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("grounds/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getGroundId34_invoker = createInvoker(
    Application_1.getGroundId(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getGroundId",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """grounds/$id<[^/]+>"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_Application_getClubId35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("leagues/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getClubId35_invoker = createInvoker(
    Application_1.getClubId(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getClubId",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """leagues/$id<[^/]+>"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_Application_getManagerId36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("managers/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getManagerId36_invoker = createInvoker(
    Application_1.getManagerId(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getManagerId",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """managers/$id<[^/]+>"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_Application_getPaymentId37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payments/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getPaymentId37_invoker = createInvoker(
    Application_1.getPaymentId(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getPaymentId",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """payments/$id<[^/]+>"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_Application_getPositionId38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("positions/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getPositionId38_invoker = createInvoker(
    Application_1.getPositionId(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getPositionId",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """positions/$id<[^/]+>"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_Application_getSubscriptionId39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subscriptions/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getSubscriptionId39_invoker = createInvoker(
    Application_1.getSubscriptionId(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getSubscriptionId",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """subscriptions/$id<[^/]+>"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_Application_getUserId40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getUserId40_invoker = createInvoker(
    Application_1.getUserId(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getUserId",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """users/$id<[^/]+>"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_Application_getPlayerId41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("players/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getPlayerId41_invoker = createInvoker(
    Application_1.getPlayerId(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getPlayerId",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """players/$id<[^/]+>"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_Application_getStatisticId42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("statistics/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getStatisticId42_invoker = createInvoker(
    Application_1.getStatisticId(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getStatisticId",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """statistics/$id<[^/]+>"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_Assets_versioned43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned43_invoker = createInvoker(
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
  
    // @LINE:20
    case controllers_Application_addStatistic14_route(params) =>
      call { 
        controllers_Application_addStatistic14_invoker.call(Application_1.addStatistic())
      }
  
    // @LINE:22
    case controllers_Application_getClubs15_route(params) =>
      call { 
        controllers_Application_getClubs15_invoker.call(Application_1.getClubs())
      }
  
    // @LINE:23
    case controllers_Application_getBlogs16_route(params) =>
      call { 
        controllers_Application_getBlogs16_invoker.call(Application_1.getBlogs())
      }
  
    // @LINE:24
    case controllers_Application_getCities17_route(params) =>
      call { 
        controllers_Application_getCities17_invoker.call(Application_1.getCities())
      }
  
    // @LINE:25
    case controllers_Application_getConfederations18_route(params) =>
      call { 
        controllers_Application_getConfederations18_invoker.call(Application_1.getConfederations())
      }
  
    // @LINE:26
    case controllers_Application_getCountries19_route(params) =>
      call { 
        controllers_Application_getCountries19_invoker.call(Application_1.getCountries())
      }
  
    // @LINE:27
    case controllers_Application_getGrounds20_route(params) =>
      call { 
        controllers_Application_getGrounds20_invoker.call(Application_1.getGrounds())
      }
  
    // @LINE:28
    case controllers_Application_getClubs21_route(params) =>
      call { 
        controllers_Application_getClubs21_invoker.call(Application_1.getClubs())
      }
  
    // @LINE:29
    case controllers_Application_getManagers22_route(params) =>
      call { 
        controllers_Application_getManagers22_invoker.call(Application_1.getManagers())
      }
  
    // @LINE:30
    case controllers_Application_getPayments23_route(params) =>
      call { 
        controllers_Application_getPayments23_invoker.call(Application_1.getPayments())
      }
  
    // @LINE:31
    case controllers_Application_getPositions24_route(params) =>
      call { 
        controllers_Application_getPositions24_invoker.call(Application_1.getPositions())
      }
  
    // @LINE:32
    case controllers_Application_getSubscriptions25_route(params) =>
      call { 
        controllers_Application_getSubscriptions25_invoker.call(Application_1.getSubscriptions())
      }
  
    // @LINE:33
    case controllers_Application_getUsers26_route(params) =>
      call { 
        controllers_Application_getUsers26_invoker.call(Application_1.getUsers())
      }
  
    // @LINE:34
    case controllers_Application_getPlayers27_route(params) =>
      call { 
        controllers_Application_getPlayers27_invoker.call(Application_1.getPlayers())
      }
  
    // @LINE:35
    case controllers_Application_getStatistics28_route(params) =>
      call { 
        controllers_Application_getStatistics28_invoker.call(Application_1.getStatistics())
      }
  
    // @LINE:37
    case controllers_Application_getClubId29_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_getClubId29_invoker.call(Application_1.getClubId(id))
      }
  
    // @LINE:38
    case controllers_Application_getBlogId30_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_getBlogId30_invoker.call(Application_1.getBlogId(id))
      }
  
    // @LINE:39
    case controllers_Application_getCityId31_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_getCityId31_invoker.call(Application_1.getCityId(id))
      }
  
    // @LINE:40
    case controllers_Application_getConfederationId32_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_getConfederationId32_invoker.call(Application_1.getConfederationId(id))
      }
  
    // @LINE:41
    case controllers_Application_getCountryId33_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_getCountryId33_invoker.call(Application_1.getCountryId(id))
      }
  
    // @LINE:42
    case controllers_Application_getGroundId34_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_getGroundId34_invoker.call(Application_1.getGroundId(id))
      }
  
    // @LINE:43
    case controllers_Application_getClubId35_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_getClubId35_invoker.call(Application_1.getClubId(id))
      }
  
    // @LINE:44
    case controllers_Application_getManagerId36_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_getManagerId36_invoker.call(Application_1.getManagerId(id))
      }
  
    // @LINE:45
    case controllers_Application_getPaymentId37_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_getPaymentId37_invoker.call(Application_1.getPaymentId(id))
      }
  
    // @LINE:46
    case controllers_Application_getPositionId38_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_getPositionId38_invoker.call(Application_1.getPositionId(id))
      }
  
    // @LINE:47
    case controllers_Application_getSubscriptionId39_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_getSubscriptionId39_invoker.call(Application_1.getSubscriptionId(id))
      }
  
    // @LINE:48
    case controllers_Application_getUserId40_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_getUserId40_invoker.call(Application_1.getUserId(id))
      }
  
    // @LINE:49
    case controllers_Application_getPlayerId41_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_getPlayerId41_invoker.call(Application_1.getPlayerId(id))
      }
  
    // @LINE:50
    case controllers_Application_getStatisticId42_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_getStatisticId42_invoker.call(Application_1.getStatisticId(id))
      }
  
    // @LINE:55
    case controllers_Assets_versioned43_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned43_invoker.call(Assets_0.versioned(path, file))
      }
  }
}