import Task3._
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.{FlatSpec, MustMatchers}

class Task3Test extends FlatSpec with MustMatchers with TypeCheckedTripleEquals {

  "Task1" should "return length" in {
    task3("abc") must ===(3)
  }

}
