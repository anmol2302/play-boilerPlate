
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/anmolgupta/Documents/IntellizProjects/playProjects/play-boilerPlate/conf/routes
// @DATE:Tue Mar 05 13:10:19 IST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

object Routes extends Routes

class Routes extends GeneratedRouter {

  import ReverseRouteContext.empty

  override val errorHandler: play.api.http.HttpErrorHandler = play.api.http.LazyHttpErrorHandler

  private var _prefix = "/"

  def withPrefix(prefix: String): Routes = {
    _prefix = prefix
    router.RoutesPrefix.setPrefix(prefix)
    
    this
  }

  def prefix: String = _prefix

  lazy val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation: Seq[(String, String, String)] = List(
    ("""GET""", prefix, """@controllers.HomeController@.index()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """add-user""", """@controllers.UserController@.addUser()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """all-users""", """@controllers.UserController@.allUsers()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """fetch-user/$id<[^/]+>""", """@controllers.UserController@.getUser(id:String)"""),
    ("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete-user/$id<[^/]+>""", """@controllers.UserController@.deleteUser(id:String)"""),
    ("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """update-user""", """@controllers.UserController@.updateUser()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search""", """@controllers.UserController@.searchUser()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """demo""", """@controllers.HomeController@.showDemo()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """req""", """@controllers.HomeController@.handelReq()"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """js""", """@controllers.HomeController@.handelJson()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:3
  private[this] lazy val controllers_HomeController_index0_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.HomeController]).index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:4
  private[this] lazy val controllers_UserController_addUser1_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add-user")))
  )
  private[this] lazy val controllers_UserController_addUser1_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.UserController]).addUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "addUser",
      Nil,
      "POST",
      """""",
      this.prefix + """add-user"""
    )
  )

  // @LINE:5
  private[this] lazy val controllers_UserController_allUsers2_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("all-users")))
  )
  private[this] lazy val controllers_UserController_allUsers2_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.UserController]).allUsers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "allUsers",
      Nil,
      "GET",
      """""",
      this.prefix + """all-users"""
    )
  )

  // @LINE:6
  private[this] lazy val controllers_UserController_getUser3_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fetch-user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_getUser3_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.UserController]).getUser(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUser",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """fetch-user/$id<[^/]+>"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_UserController_deleteUser4_route: Route.ParamsExtractor = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete-user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_deleteUser4_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.UserController]).deleteUser(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "deleteUser",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """delete-user/$id<[^/]+>"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_UserController_updateUser5_route: Route.ParamsExtractor = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update-user")))
  )
  private[this] lazy val controllers_UserController_updateUser5_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.UserController]).updateUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "updateUser",
      Nil,
      "PUT",
      """""",
      this.prefix + """update-user"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UserController_searchUser6_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_UserController_searchUser6_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.UserController]).searchUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "searchUser",
      Nil,
      "POST",
      """""",
      this.prefix + """search"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_showDemo7_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("demo")))
  )
  private[this] lazy val controllers_HomeController_showDemo7_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.HomeController]).showDemo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "showDemo",
      Nil,
      "GET",
      """""",
      this.prefix + """demo"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_handelReq8_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("req")))
  )
  private[this] lazy val controllers_HomeController_handelReq8_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.HomeController]).handelReq(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "handelReq",
      Nil,
      "GET",
      """""",
      this.prefix + """req"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_handelJson9_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("js")))
  )
  private[this] lazy val controllers_HomeController_handelJson9_invoker = createInvoker(
    play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.HomeController]).handelJson(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "handelJson",
      Nil,
      "POST",
      """""",
      this.prefix + """js"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Assets_versioned10_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned10_invoker = createInvoker(
    controllers.Assets.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ The version parameter is optional. E.g. /api/list-all?version=3.0
 Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:3
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.HomeController]).index())
      }
  
    // @LINE:4
    case controllers_UserController_addUser1_route(params) =>
      call { 
        controllers_UserController_addUser1_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.UserController]).addUser())
      }
  
    // @LINE:5
    case controllers_UserController_allUsers2_route(params) =>
      call { 
        controllers_UserController_allUsers2_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.UserController]).allUsers())
      }
  
    // @LINE:6
    case controllers_UserController_getUser3_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_UserController_getUser3_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.UserController]).getUser(id))
      }
  
    // @LINE:7
    case controllers_UserController_deleteUser4_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_UserController_deleteUser4_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.UserController]).deleteUser(id))
      }
  
    // @LINE:8
    case controllers_UserController_updateUser5_route(params) =>
      call { 
        controllers_UserController_updateUser5_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.UserController]).updateUser())
      }
  
    // @LINE:9
    case controllers_UserController_searchUser6_route(params) =>
      call { 
        controllers_UserController_searchUser6_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.UserController]).searchUser())
      }
  
    // @LINE:10
    case controllers_HomeController_showDemo7_route(params) =>
      call { 
        controllers_HomeController_showDemo7_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.HomeController]).showDemo())
      }
  
    // @LINE:11
    case controllers_HomeController_handelReq8_route(params) =>
      call { 
        controllers_HomeController_handelReq8_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.HomeController]).handelReq())
      }
  
    // @LINE:12
    case controllers_HomeController_handelJson9_route(params) =>
      call { 
        controllers_HomeController_handelJson9_invoker.call(play.api.Play.maybeApplication.map(_.injector).getOrElse(play.api.inject.NewInstanceInjector).instanceOf(classOf[controllers.HomeController]).handelJson())
      }
  
    // @LINE:18
    case controllers_Assets_versioned10_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned10_invoker.call(controllers.Assets.versioned(path, file))
      }
  }
}