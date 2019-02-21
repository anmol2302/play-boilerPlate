
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/anmol/Downloads/comexample/conf/routes
// @DATE:Thu Feb 21 11:03:16 IST 2019

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:3
package controllers {

  // @LINE:3
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def handelDef(email:String, version:String = null, cod:String = "1", arr:List[Integer]): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "def/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)) + queryString(List(if(version == null) None else Some(implicitly[QueryStringBindable[String]].unbind("version", version)), if(cod == "1") None else Some(implicitly[QueryStringBindable[String]].unbind("cod", cod)), Some(implicitly[QueryStringBindable[List[Integer]]].unbind("arr", arr)))))
    }
  
    // @LINE:3
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:10
    def showDemo(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "demo")
    }
  
    // @LINE:11
    def handelReq(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "req")
    }
  
  }

  // @LINE:17
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:4
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def updateUser(): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "update-user")
    }
  
    // @LINE:4
    def addUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "add-user")
    }
  
    // @LINE:9
    def searchUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "search")
    }
  
    // @LINE:6
    def getUser(id:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "fetch-user/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
    }
  
    // @LINE:5
    def allUsers(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "all-users")
    }
  
    // @LINE:7
    def deleteUser(id:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "delete-user/" + implicitly[PathBindable[String]].unbind("id", dynamicString(id)))
    }
  
  }


}