
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/wl-sips-portal-opbeat/UK-SIPS-Portal/conf/routes
// @DATE:Wed Aug 24 16:15:12 BST 2016


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
