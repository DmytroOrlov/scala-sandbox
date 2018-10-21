// You can test using ScalaTest (http://www.scalatest.org/).
import org.scalatest._

// TODO: replace this example test with your own, this is just here to demonstrate usage.
// See http://www.scalatest.org/at_a_glance for example usages
class BasicTests extends FlatSpec with Matchers {

  "fib(0)" should "return 0" in {
    Fib.fib(0) should be (0)
  }
  "fib(1)" should "return 1" in {
    Fib.fib(1) should be (1)
  }
  "fib(2)" should "return 1" in {
    Fib.fib(2) should be (1)
  }
  "fib(3)" should "return 2" in {
    Fib.fib(3) should be (2)
  }
  "fib(4)" should "return 4" in {
    Fib.fib(4) should be (3)
  }
  "fib(5)" should "return 5" in {
    Fib.fib(5) should be (5)
  }
  "fib(-1)" should "return 1" in {
    Fib.fib(-1) should be (1)
  }
}
