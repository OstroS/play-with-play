package controllers

import play.api._
import play.api.mvc._
import models.Link
import play.api.data._
import play.api.data.Forms._

/**
 * Purpose of this controller is to:
 * - present information about stored links,
 * - add links by user,
 * - deliver possibility to search among stored links.
 */
object LinksController extends Controller {
  
  def index = Action {
    Ok(views.html.link(Link.getLastNElements(10), urlForm))
  }
  


  def create = Action { implicit request => 
    Ok("request: " + request)
    }
  
  
  val urlForm = Form(
	"url" -> text)
}
