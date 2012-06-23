package models
 
import play.api.db._
import play.api.Play.current
 
import anorm._
import anorm.SqlParser._
 
case class aznable(id: Pk[Long], title: String,url: String)
 
object aznable {
 
  val simple = {
    get[Pk[Long]]("id") ~
    get[String]("title") ~
    get[String]("url") map {
      case id~title~url => aznable(id, title,url)
    }
  }
 
  def findAll(): Seq[aznable] = {
    DB.withConnection { implicit connection =>
      SQL("select * from aznable").as(aznable.simple *)
    }
  }
 
}
