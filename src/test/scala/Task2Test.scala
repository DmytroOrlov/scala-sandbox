import Task2._
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.{FlatSpec, MustMatchers}

class Task2Test extends FlatSpec with MustMatchers with TypeCheckedTripleEquals {

  "Task2" should "return length" in {
    task2("abc") must ===(3)
  }

}
