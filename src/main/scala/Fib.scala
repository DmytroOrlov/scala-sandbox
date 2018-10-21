import scala.annotation.tailrec

object Fib {

  def fib(n: Int): BigInt = {
    n match {
      case 0 => 0
      case 1 => 1
      case pos if pos > 0 =>
        @tailrec
        def calcPos(n0: BigInt, n1: BigInt, current: Int, target: Int): BigInt =
          if (current == target) n1
          else calcPos(n1, n0 + n1, current + 1, target)

        calcPos(0, 1, 1, pos)
      case neg if neg < 0 =>
        @tailrec
        def calcNeg(n0: BigInt, n1: BigInt, current: Int, target: Int): BigInt =
          if (current == target) n0
          else calcNeg(n1 - n0, n0, current - 1, target)

        calcNeg(0, 1, 0, neg)
    }
  }
}
