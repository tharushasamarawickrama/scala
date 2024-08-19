object InterestCalculator {

  def main(args: Array[String]): Unit = {
    // Example usage
    val depositAmounts = List(10000, 50000, 500000, 5000000)
    depositAmounts.foreach { amount =>
      println(s"Deposit amount: Rs. $amount, Interest: Rs. ${calculateInterest(amount)}")
    }
  }

  def calculateInterest: Double => Double = {
    case deposit if deposit <= 20000 => deposit * 0.02
    case deposit if deposit <= 200000 => deposit * 0.04
    case deposit if deposit <= 2000000 => deposit * 0.035
    case deposit => deposit * 0.065
  }
}
