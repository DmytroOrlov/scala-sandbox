import org.scalacheck.Arbitrary._
import org.scalacheck.Prop._
import org.scalatest.WordSpec
import org.scalatest.prop.Checkers

class MulTest extends WordSpec with Checkers {
  "Mul" when {
    "multiply" should {
      "be correct" in check { (a: Int, b: Int) =>
        a * b == Mul.multiply(a, b)
      }
    }
  }
}
