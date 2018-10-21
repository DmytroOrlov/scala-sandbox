object DirReduction {

  def dirReduc(arr: Array[String]): Array[String] =
    arr.foldLeft(List.empty[String]) { (acc, a) =>
      if (acc.headOption.contains(opposite(a))) acc.tail
      else a :: acc
    }.reverse.toArray

  val opposite = Map("NORTH" -> "SOUTH", "SOUTH" -> "NORTH", "WEST" -> "EAST", "EAST" -> "WEST")
}
