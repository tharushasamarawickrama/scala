object RationalNumbers {

  case class Rational(numerator: Int, denominator: Int) {
    require(denominator != 0, "Denominator cannot be zero")

    // Reduce the fraction to its simplest form
    private def gcd(a: Int, b: Int): Int = {
      if (b == 0) a else gcd(b, a % b)
    }

    private val divisor = gcd(numerator, denominator)
    val reducedNumerator = numerator / divisor
    val reducedDenominator = denominator / divisor

    // Method to subtract two Rational numbers
    def subtract(other: Rational): Rational = {
      val newNumerator = (this.reducedNumerator * other.reducedDenominator) - (other.reducedNumerator * this.reducedDenominator)
      val newDenominator = this.reducedDenominator * other.reducedDenominator
      Rational(newNumerator, newDenominator)
    }

    override def toString: String = s"$reducedNumerator/$reducedDenominator"
  }

  def main(args: Array[String]): Unit = {
    val x = Rational(3, 4)
    val y = Rational(5, 8)
    val z = Rational(2, 7)

    val resultYMinusZ = y.subtract(z)
    val result = x.subtract(resultYMinusZ)

    println(s"x - (y - z) = $result")
  }
}



