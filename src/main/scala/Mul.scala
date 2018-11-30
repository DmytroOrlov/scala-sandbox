import scala.annotation.tailrec

object Mul {
  def multiply(a: Int, b: Int): Int = {
    if (a == 0 || b == 0) 0
    else if (a == 1) b
    else if (b == 1) a
    else {
      @tailrec
      def mul(cur: Int, res: Int): Int =
        cur match {
          case 1 => res
          case p => mul(p - 1, res + a)
        }

      if (b < 0) -mul(-b, a)
      else mul(b, a)
    }
  }
}
