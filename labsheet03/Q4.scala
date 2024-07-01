object EvenSumCalculator  {
  def sumOfEvens(numbers: List[Int]): Int = {
    numbers.filter(_ % 2 == 0).sum
  }

  def main(args: Array[String]): Unit = {
    // Example usage:
    val inputNumbers = List(11,18,4,8,3,9,20)
    val sumEvens = sumOfEvens(inputNumbers)
    println(s"The sum of all even numbers in the list is: $sumEvens")
  }

  
}


