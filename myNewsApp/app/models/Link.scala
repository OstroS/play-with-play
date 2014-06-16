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

/**
 * Mocked data generator
 */
object LinkDataSource {
	lazy val MockedLinksList = ( 
	 for { 
	  id <- 0 to 50
	} yield Link(id, "http://url/" + id, "desc_" + id, List("tag", "tag_" + id))) toList
  
	def getAll() : List[Link] = MockedLinksList
}