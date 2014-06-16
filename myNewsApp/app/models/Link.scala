package models

/**
 * Definition of model Link as a case class
 */
case class Link(id: Long, url: String, description: String, tags: List[String])

/**
 * Definition of "service" as a Scala object
 */
object Link {
  /**
   * Returns list of all links
   */
  def getAll() : List[Link] = Nil
  
  /**
   * Creates a link
   */
  def create(link: Link) = {}
  
}