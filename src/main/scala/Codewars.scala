object Codewars {
  def accum(s: String): String =
    s.zipWithIndex.map {
      case (a, n) => a.toUpper + a.toLower.toString * n
    }.mkString("-")
}
