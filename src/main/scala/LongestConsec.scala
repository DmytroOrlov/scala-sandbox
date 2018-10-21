object LongestConsec {
  def longestConsec(a: Array[String], k: Int): String = {
    val n = a.length
    if (n == 0 || k > n || k <= 0) "" else a.sliding(k).map(_.fold("")(_ + _)).maxBy(_.length)
  }
}
