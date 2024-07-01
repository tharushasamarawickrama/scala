object ArithmeticMean  {
  
  def calculateMean(num1: Int, num2: Int): Double = {
    val mean = (num1 + num2) / 2.0
    // Round to two decimal places
    Math.round(mean * 100.0) / 100.0
  } 
  def main(args: Array[String]): Unit = {
    // Example usage:
    val num1 = 5
    val num2 = 10
    println(s"The arithmetic mean of $num1 and $num2 is: ${calculateMean(num1, num2)}")
  }

  
}
