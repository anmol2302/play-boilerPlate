
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""

"""),_display_(/*3.2*/main("CassandraConnekt")/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""
"""),format.raw/*4.1*/("""<h1>Hello There!</h1>
<p> """),_display_(/*5.6*/message),format.raw/*5.13*/(""" """),format.raw/*5.14*/("""</p>
""")))}),format.raw/*6.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Feb 21 11:03:17 IST 2019
                  SOURCE: /home/anmol/Downloads/comexample/app/views/index.scala.html
                  HASH: f71d0cd5502cc53272ff51d536e798e342442cf9
                  MATRIX: 527->1|638->17|666->20|698->44|737->46|764->47|816->74|843->81|871->82|906->88
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|29->5|29->5|29->5|30->6
                  -- GENERATED --
              */
          