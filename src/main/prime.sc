import scala.annotation.tailrec

val a1 = 1.to(50).toArray
val a2 = 20.to(60).toArray

def commonPrimes(a1: Array[Int], a2: Array[Int]): Array[Int] = {
  @tailrec
  def filterPrime(check: Array[Int], primes: Array[Int], current: Int, target: Int): Array[Int] = {
    if (check.isEmpty) primes
    else {
      val newPrimes = check.filter(_ <= current * 2)
      val next = current + 1
      val candidates = check.diff(newPrimes).filter(_ % next != 0)
      filterPrime(candidates, primes ++ newPrimes, next, target)
    }
  }

  val common = a1.intersect(a2)
  filterPrime(common.filter(_ > 1), Array.empty, 1, common.max / 2)
}

commonPrimes(a1, a2).sorted
