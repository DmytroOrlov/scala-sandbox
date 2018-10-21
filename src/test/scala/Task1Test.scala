import Task1._
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.{FlatSpec, MustMatchers}

class Task1Test extends FlatSpec with MustMatchers with TypeCheckedTripleEquals {

  "Task1" should "return length" in {
    task1("abc") must ===(3)
  }

}
