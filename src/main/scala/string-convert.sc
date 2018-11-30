def convert(a: String): String =
  a.split(" ").map(_.dropRight(1).reverse).mkString(" ")


convert("disco for super heroes :-)")
