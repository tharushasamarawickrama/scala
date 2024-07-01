object EvenSumCalculator  {
  def sumOfEvens(numbers: List[Int]): Int = {
    numbers.filter(_ % 2 == 0).sum
  }

  def main(args: Array[String]): Unit = {
    // Example usage:
    val inputNumbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9,10)
    val sumEvens = sumOfEvens(inputNumbers)
    println(s"The sum of all even numbers in the list is: $sumEvens")
  }

  
}


