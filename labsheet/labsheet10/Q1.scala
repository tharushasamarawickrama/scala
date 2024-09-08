class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero")

  // Greatest Common Divisor
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  // Simplified numerator and denominator
  private val g = gcd(n.abs, d.abs)
  val numerator: Int = n / g
  val denominator: Int = d / g

  // Negate method
  def neg: Rational = new Rational(-numerator, denominator)

  // Overriding toString for better display
  override def toString: String = s"$numerator/$denominator"
}

object RationalTest extends App {
  val x = new Rational(3, 4)
  println(s"Original: $x") // 3/4
  println(s"Negated: ${x.neg}") // -3/4
}
