package controllers

import javax.inject._
import xcb_app._
import play.api.mvc._
import play.api.routing._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class XcbAppController @Inject()(app:xcb_app) extends Controller {

  def nextCount = Action {
    Ok("Next Count: " + app.nextCount.toString)
  }

  def helloApp = Action {
    Ok(app.hello)
  }

  def helloLib = Action {
    Ok(app.libHello)
  }

  def javascriptRoutes = Action { implicit request =>
    Ok(
      JavaScriptReverseRouter("jsRoutes")(
        routes.javascript.XcbAppController.nextCount
      )
    ).as("text/javascript")
  }
}
