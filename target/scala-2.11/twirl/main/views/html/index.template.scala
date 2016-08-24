
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""<!DOCTYPE html>
<html>
  <head>
    <title data-ng-bind="pageTitle"></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*6.55*/routes/*6.61*/.Assets.versioned("images/favicon.png")),format.raw/*6.100*/("""" />
    <link rel="stylesheet" media="screen" href=""""),_display_(/*7.50*/routes/*7.56*/.Assets.versioned("lib/bootstrap/css/bootstrap.css")),format.raw/*7.108*/("""" />
    """),format.raw/*8.33*/("""
    """),format.raw/*9.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*9.50*/routes/*9.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.97*/("""" />
    """),format.raw/*10.39*/("""
    """),format.raw/*11.5*/("""<script>
      (function(i,s,o,g,r,a,m)"""),format.raw/*12.31*/("""{"""),format.raw/*12.32*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*12.82*/("""{"""),format.raw/*12.83*/("""
      """),format.raw/*13.7*/("""(i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*13.42*/("""}"""),format.raw/*13.43*/(""",i[r].l=1*new Date();a=s.createElement(o),
      m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
      """),format.raw/*15.7*/("""}"""),format.raw/*15.8*/(""")(window,document,'script','https://www.google-analytics.com/analytics.js','ga');
    </script>
    """),format.raw/*17.35*/("""
    """),format.raw/*18.5*/("""<script data-main=""""),_display_(/*18.25*/routes/*18.31*/.Assets.versioned("javascripts/main.js")),format.raw/*18.71*/("""" type="text/javascript" src=""""),_display_(/*18.102*/routes/*18.108*/.Assets.versioned("lib/requirejs/require.js")),format.raw/*18.153*/(""""></script>
  </head>
  <body>
    """),format.raw/*21.30*/("""
    """),format.raw/*22.5*/("""<script type="text/javascript" src="http://www.33-trk-srv.com/js/81611.js" ></script>
    <noscript><img src="http://www.33-trk-srv.com/81611.png" style="display:none;" /></noscript>
    """),format.raw/*24.22*/("""
    """),format.raw/*25.5*/("""<nav class="navbar navbar-transparent" data-ng-controller="HeaderCtrl" data-ng-cloak>
      <div class="container" data-ng-switch="!!user" data-ng-cloak>
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#header-navbar-body" aria-expanded="false">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a href="#/" class="navbar-brand"><img src="/assets/images/logos/Worldline-E-Payment-Services_White_50px.png" alt="..."></a>
        </div>
        <div class="collapse navbar-collapse" id="header-navbar-body">
          <ul class="nav navbar-nav">
            <li><a href="#/payment">Payment Acceptance</a></li>
            <li><a href="#/pricing">Pricing</a></li>
            <li><a href="#/aboutus">About Us</a></li>
            <li><a href="#/contact">Contact</a></li>
            <li><a href="#/faq">FAQ</a></li>

"""),format.raw/*46.6*/("""
          """),format.raw/*47.11*/("""</ul>
"""),format.raw/*73.6*/("""
      """),format.raw/*74.7*/("""</div>
    </nav>
    """),format.raw/*76.29*/("""
    """),format.raw/*77.5*/("""<div class="container" data-ng-cloak>
      <div data-ng-view></div>
    </div>
    """),format.raw/*80.22*/("""
    """),format.raw/*81.5*/("""<footer data-ng-controller="FooterCtrl" data-ng-cloak>
      <div class="navbar navbar-transparent">
        <div class="container">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#footer-navbar-body">
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <div class="navbar-brand">
              <ul class="nav navbar-left">
                <li><a id="footer-wl-link" href="http://uk.worldline.com" target="_blank">© Worldline 2016 all rights reserved</a></li>
              </ul>
            </div>
          </div>
          <div class="navbar-collapse collapse" id="footer-navbar-body">
            <ul class="nav nav-justified">
              <li><a href="#/termsofuse">Terms of use</a></li>
              <li><a href="#/privacypolicy">Privacy policy</a></li>
              <li><a href="#/cookiepolicy">Cookie policy</a></li>
              <li><a href="#/contact">Contact us</a></li>
            </ul>
          </div>
        </div>
      </div>
    </footer>
  </body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Wed Aug 24 16:15:12 BST 2016
                  SOURCE: C:/wl-sips-portal-opbeat/UK-SIPS-Portal/app/views/index.scala.html
                  HASH: b4e7a4ef9e6bcb241b393879343de504c91a0ce4
                  MATRIX: 520->1|616->3|848->209|862->215|922->254|1002->308|1016->314|1089->366|1125->403|1156->408|1227->453|1241->459|1302->500|1339->543|1371->548|1438->587|1467->588|1545->638|1574->639|1608->646|1671->681|1700->682|1862->817|1890->818|2018->948|2050->953|2097->973|2112->979|2173->1019|2232->1050|2248->1056|2315->1101|2378->1161|2410->1166|2625->1370|2657->1375|3755->2558|3794->2569|3827->3594|3861->3601|3911->3647|3943->3652|4055->3753|4087->3758
                  LINES: 20->1|25->1|30->6|30->6|30->6|31->7|31->7|31->7|32->8|33->9|33->9|33->9|33->9|34->10|35->11|36->12|36->12|36->12|36->12|37->13|37->13|37->13|39->15|39->15|41->17|42->18|42->18|42->18|42->18|42->18|42->18|42->18|45->21|46->22|48->24|49->25|68->46|69->47|70->73|71->74|73->76|74->77|77->80|78->81
                  -- GENERATED --
              */
          