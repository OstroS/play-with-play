package controllers

import play.api._
import play.api.mvc._

object LinksController extends Controller {
  
  def index = Action {
    Ok("Your new application is ready.")
  }
}