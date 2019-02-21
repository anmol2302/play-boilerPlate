
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/anmol/Downloads/comexample/conf/routes
// @DATE:Thu Feb 21 11:03:16 IST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
