object PrimeSolution {
  def prime(a: Int): Boolean = {
    var isPrime = true
    var i = 2
    while (i < a && isPrime) {
      if (a % i == 0) i = i + 1
      else isPrime = false
    }
    isPrime
  }
}
