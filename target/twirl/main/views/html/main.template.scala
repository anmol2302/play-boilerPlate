
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!--<!DOCTYPE html>-->
<html lang="en">
<head>
    """),format.raw/*12.58*/("""
    """),format.raw/*13.5*/("""<title>"""),_display_(/*13.13*/title),format.raw/*13.18*/("""</title>
    <!--<link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.101*/("""">-->
    <!--<link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">-->
</head>
<body>
"""),format.raw/*19.23*/("""
"""),_display_(/*20.2*/content),format.raw/*20.9*/("""

"""),format.raw/*22.1*/("""<!--<script src=""""),_display_(/*22.19*/routes/*22.25*/.Assets.versioned("javascripts/main.js")),format.raw/*22.65*/("""" type="text/javascript"></script>-->
</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue Mar 05 13:06:43 IST 2019
                  SOURCE: /Users/anmolgupta/Documents/IntellizProjects/playProjects/play-boilerPlate/app/views/main.scala.html
                  HASH: 4a0abc3c24d36569239003b6313ed68189f42c4a
                  MATRIX: 779->255|904->285|932->287|1011->391|1043->396|1078->404|1104->409|1193->471|1208->477|1271->518|1362->582|1377->588|1438->627|1487->729|1515->731|1542->738|1571->740|1616->758|1631->764|1692->804
                  LINES: 25->7|30->7|32->9|35->12|36->13|36->13|36->13|37->14|37->14|37->14|38->15|38->15|38->15|41->19|42->20|42->20|44->22|44->22|44->22|44->22
                  -- GENERATED --
              */
          