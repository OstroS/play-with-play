package controllers

import play.api._
import play.api.mvc._

/**
 * Purpose of this controller is to:
 * - present information about stored links,
 * - add links by user,
 * - deliver possibility to search among stored links.
 */
object LinksController extends Controller {
  
  def index = Action {
    Ok("Your new application is ready.")
  }
}