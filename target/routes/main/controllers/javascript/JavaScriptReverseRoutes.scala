
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/anmol/Downloads/comexample/conf/routes
// @DATE:Thu Feb 21 11:03:16 IST 2019

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:3
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:3
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def handelDef: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.handelDef",
      """
        function(email,version,cod,arr) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "def/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email)) + _qS([(version == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("version", version)), (cod == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("cod", cod)), (""" + implicitly[QueryStringBindable[List[Integer]]].javascriptUnbind + """)("arr", arr)])})
        }
      """
    )
  
    // @LINE:3
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:10
    def showDemo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.showDemo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "demo"})
        }
      """
    )
  
    // @LINE:11
    def handelReq: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.handelReq",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "req"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:4
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def updateUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.updateUser",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "update-user"})
        }
      """
    )
  
    // @LINE:4
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.addUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "add-user"})
        }
      """
    )
  
    // @LINE:9
    def searchUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.searchUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
        }
      """
    )
  
    // @LINE:6
    def getUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUser",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fetch-user/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
        }
      """
    )
  
    // @LINE:5
    def allUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.allUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "all-users"})
        }
      """
    )
  
    // @LINE:7
    def deleteUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.deleteUser",
      """
        function(id) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "delete-user/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id))})
        }
      """
    )
  
  }


}