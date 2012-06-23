package controllers
 
import play.api.data.Form
import play.api.data.Forms.{single, nonEmptyText}
import play.api.mvc.{Action, Controller}
import anorm.NotAssigned
import play.api.cache.Cache
import play.api.cache.Cached
import play.api.Play.current
import models.aznable
 
 
object Application extends Controller {

  def index = Cached("homePage") {
    Action {
      Ok(views.html.index())
    }
  }
 

  import com.codahale.jerkson.Json
 
  def list_aznables() = Action {
    val aznables = aznable.findAll()
    val json = Json.generate(aznables)
    Ok(json).as("application/json")
  }

}
