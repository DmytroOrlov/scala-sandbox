import org.scalatest.{FlatSpec, MustMatchers}

class FoldLeftTest extends FlatSpec with MustMatchers {
  it should "" in {
    def op[A] = (acc: List[A], a: A) => a :: acc
    def po[A] = (a: A, acc: List[A]) => a :: acc

    val a = List(0, 1)

    val z0: List[Int] = Nil
    val z1 = op(z0, a(0))
    op(z1, a(1))

    def zz1 = z0
    def zz0 = po(a(0), zz1)
    po(a(1), zz0)

    a.foldLeft(z0)(op)

    def foldLeft[A, B](a: List[A])(z: B)(op: (B, A) => B): B = a.foldLeft(z)(op)

    def foldLeft1[A, B](a: List[A])(z: B)(op: (B, A) => B): B = a.foldLeft(z)(op)

    foldLeft(a)(z0)(op)
    foldLeft1(a)(z0)(op)

    def foldLeftWithFoldRight[A, B](a: List[A])(z0: B)(po: (A, B) => B): B = {
      def zz1 = z0
      def zz0 = po(a(0), zz1)
      po(a(1), zz0)

      a.foldRight(z0)(po)
    }

    foldLeftWithFoldRight(a)(z0)(po)
  }
}
