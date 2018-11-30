object Fibonacci extends App {
  def f(i: Int): Int = {
    i match {
      case 0 => 0
      case 1 => 1
      case n => f(n - 1) + f(n - 2)
    }
  }

  (0 to 10).foreach(n => println(f(n)))
}
