
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/wl-sips-portal-opbeat/UK-SIPS-Portal/conf/routes
// @DATE:Wed Aug 24 16:15:12 BST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_1: controllers.Application,
  // @LINE:31
  Captcha_2: controllers.Captcha,
  // @LINE:37
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:31
    Captcha_2: controllers.Captcha,
    // @LINE:37
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Captcha_2, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Captcha_2, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jsroutes.js""", """controllers.Application.jsRoutes()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """environment""", """controllers.Application.environment()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """verifycaptcha""", """controllers.Captcha.verifyCaptcha(response:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
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

  // @LINE:9
  private[this] lazy val controllers_Application_jsRoutes1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jsroutes.js")))
  )
  private[this] lazy val controllers_Application_jsRoutes1_invoker = createInvoker(
    Application_1.jsRoutes(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "jsRoutes",
      Nil,
      "GET",
      """ JavaScript routes object""",
      this.prefix + """jsroutes.js"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_environment2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("environment")))
  )
  private[this] lazy val controllers_Application_environment2_invoker = createInvoker(
    Application_1.environment(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "environment",
      Nil,
      "GET",
      """""",
      this.prefix + """environment"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Captcha_verifyCaptcha3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("verifycaptcha")))
  )
  private[this] lazy val controllers_Captcha_verifyCaptcha3_invoker = createInvoker(
    Captcha_2.verifyCaptcha(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Captcha",
      "verifyCaptcha",
      Seq(classOf[String]),
      "GET",
      """ Captcha""",
      this.prefix + """verifycaptcha"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Assets_versioned4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index())
      }
  
    // @LINE:9
    case controllers_Application_jsRoutes1_route(params) =>
      call { 
        controllers_Application_jsRoutes1_invoker.call(Application_1.jsRoutes())
      }
  
    // @LINE:18
    case controllers_Application_environment2_route(params) =>
      call { 
        controllers_Application_environment2_invoker.call(Application_1.environment())
      }
  
    // @LINE:31
    case controllers_Captcha_verifyCaptcha3_route(params) =>
      call(params.fromQuery[String]("response", None)) { (response) =>
        controllers_Captcha_verifyCaptcha3_invoker.call(Captcha_2.verifyCaptcha(response))
      }
  
    // @LINE:37
    case controllers_Assets_versioned4_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned4_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
