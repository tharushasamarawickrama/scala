class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero")

  // GCD to simplify the rational number
  private val gcd = gcdFunc(n.abs, d.abs)
  val numerator: Int = n / gcd
  val denominator: Int = d / gcd

  // Method to calculate GCD
  private def gcdFunc(a: Int, b: Int): Int = {
    if (b == 0) a else gcdFunc(b, a % b)
  }

  // Method to negate the rational number
  def neg: Rational = new Rational(-this.numerator, this.denominator)

  // Override toString to print rational number nicely
  override def toString: String = s"$numerator/$denominator"
}

// Usage example
object RationalTest extends App {
  val x = new Rational(3, 4)
  println(s"Original: $x")   // Output: 3/4
  println(s"Negated: ${x.neg}") // Output: -3/4
}
