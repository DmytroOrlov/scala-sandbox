import org.scalatest.{FlatSpec, MustMatchers}

class Solution2Test extends FlatSpec with MustMatchers {


  it should "solution1" in {
    Solution2.solution(Array(1, 1, 2, 3, -1)) mustEqual 1
  }

}
