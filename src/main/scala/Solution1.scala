object Solution1 {
  def duplicateEncode(word: String): String = {
    val ws = word.toLowerCase
    val dups = ws.groupBy(identity).mapValues(s => if (s.length > 1) ')' else '(')
    ws.map(dups)
  }
}
