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
  	Link.create(urlForm.bindFromRequest.get)
    Ok(views.html.link(Link.getLastNElements(10), urlForm))
  }

  val urlForm = Form(
    mapping(
      "url" -> text,
      "description" -> text)
      ((url, description) => Link(999, url, description, List("tag")))
      ((link: Link) => Some((link.url, link.description))))
  	    
}