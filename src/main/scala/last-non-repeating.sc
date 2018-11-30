def nonRepeating(s: String): Char = {
  s(s.lastIndexWhere(s.groupBy(identity).filter {
    case (_, v) => v.length == 1
  }.keySet))
}

nonRepeating("aabccddeefgghh")
