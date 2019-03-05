
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/anmolgupta/Documents/IntellizProjects/playProjects/play-boilerPlate/conf/routes
// @DATE:Tue Mar 05 13:06:41 IST 2019


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
