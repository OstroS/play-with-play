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
  def getAll() : List[Link] = LinkDataSource.getAll()
  
  /**
   * Creates a link
   */
  def create(link: Link) = {}
  
}

object LinkDataSource {
	val MockedLinksList = List(Link(0, "link1", "desc1", List("tag1", "tag2")))
  
	def getAll() : List[Link] = MockedLinksList
}