// Rational class to represent rational numbers
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

  // Method to subtract two rational numbers
  def sub(that: Rational): Rational = {
    val newNumerator = this.numerator * that.denominator - that.numerator * this.denominator
    val newDenominator = this.denominator * that.denominator
    new Rational(newNumerator, newDenominator)
  }

  // Override toString to print rational number nicely
  override def toString: String = s"$numerator/$denominator"
}

// RationalTest object to run the tests
object RationalTest {
  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)

    // Subtract y - z
    val result = y.sub(z)

    // Print result of y - z and compare with x
    println(s"y - z = $result")    // Output: 19/56
    println(s"x = $x")             // Output: 3/4
  }
}
