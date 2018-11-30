import cats.Eval
import cats.data.Kleisli

def op[A] = (acc: List[A], a: A) => a :: acc
def po[A] = (a: A, acc: List[A]) => a :: acc

val a: List[Int] = (0 to 1000000).toList

val z0: List[Int] = Nil

def foldLeft[A, B](a: Seq[A])(z: B)(f: (B, A) => B): B = {
  val fz: Kleisli[Eval, B, B] = Kleisli((b: B) => Eval.now(b))
  a.foldRight(fz)((a, g) => g.compose((b: B) => Eval.now(f(b, a)))) {
    z
  }.value
}
//a.foldRight(z0)(po)
a.foldLeft(z0)(op)
foldLeft(a)(z0)(op)
