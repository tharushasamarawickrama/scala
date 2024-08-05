object CalculateSquareApp {
  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(num => num * num)
  }

  def main(args: Array[String]): Unit = {
    val input = List(1, 2, 3, 4, 5)
    val result = calculateSquare(input)
    println(result)  // Output: List(1, 4, 9, 16, 25)
  }
}
