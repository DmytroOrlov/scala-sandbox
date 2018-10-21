import java.time.LocalDate
import java.time.format.DateTimeFormatter

import Solution4._

class Solution4 {

  def solution(s: String): String = {
    s.split("\n").map { sub =>
      (LocalDate.parse(sub.substring(0, 10), formatter), sub.substring(11, 17).trim)
    }.count {
      case (date, owner) => date.isBefore(before) && owner == "root"
    }.toString
  }

}

object Solution4 {
  val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
  val before: LocalDate = LocalDate.parse("1995-10-13", formatter)
}
