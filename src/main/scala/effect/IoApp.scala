package effect

import cats.effect.IO

object IoApp extends App {
  IO(println("done")).unsafeRunSync()
}
