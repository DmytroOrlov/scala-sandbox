val twice: Int => Int =
  x => x * 2

val countCats: Int => String =
  x => if (x == 1) "1 cat" else s"$x cats"

val twiceAsManyCats: Int => String =
  twice andThen countCats

twiceAsManyCats(1)

val parse: String => Option[Int] =
  s => if (s.matches("-?[0-9]+")) Some(s.toInt) else None

val reciprocal: Int => Option[Double] =
  i => if (i != 0) Some(1.0 / i) else None

import cats.data.Kleisli
import cats.implicits._

val parseAndReciprocal: Kleisli[Option,String,Double] =
  Kleisli(parse).andThen(Kleisli(reciprocal))

parseAndReciprocal("2")
