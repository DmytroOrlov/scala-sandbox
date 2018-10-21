import org.scalatest.{FlatSpec, MustMatchers}

class SolutionTest extends FlatSpec with MustMatchers {

  it should "solution" in {
    val s = new Solution
    val t =
      """1988-08-29   root system.zip
        |1976-09-16   root to-do-list.xml
        |1987-02-03   root blockbuster.mpeg
        |1961-12-04   jane notes.html
        |2009-04-16   root delete-this.zip
        |2006-01-19   jane setup.png
        |1995-10-13   root archive.zip""".stripMargin
    s.solution(t) mustEqual "3"
  }

}
