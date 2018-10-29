object Solution2 {

  def solution(a: Array[Int]): Int = {
    var res = (a.length - 1, 1)
    var p = a.head
    var start = 0
    a.zipWithIndex.tail.foreach { case (k, i) =>
      if (k > p) p = k
      else {
        if (i - start > res._2) {
          res = (start, i - start)
        }
        p = k
        start = i
      }
    }
    if (a.length - start > res._2)
      start
    else res._1
  }

}
