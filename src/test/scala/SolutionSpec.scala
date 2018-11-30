import org.scalatest.{FlatSpec, MustMatchers}

class SolutionSpec extends FlatSpec with MustMatchers {
  it should "check prime" in {
    PrimeSolution.prime(1) mustBe true
    PrimeSolution.prime(2) mustBe true
    PrimeSolution.prime(3) mustBe true
    PrimeSolution.prime(4) mustBe false
    PrimeSolution.prime(5) mustBe true
    PrimeSolution.prime(6) mustBe false
  }
}
