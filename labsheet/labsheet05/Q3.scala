import scala.io.StdIn.readLine

object Question3 {

  
  def fibonacci(n: Int): Int = {
    if (n <= 1) n
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  
  def printFibonacciSequence(n: Int): Unit = {
    for (i <- 0 until n) {
      println(fibonacci(i))
    }
  }

  def main(args: Array[String]): Unit = {
    println("Enter the number of terms: ")
    val num = readLine().toInt
    if (num > 0) {
      println(s"First $num Fibonacci numbers are:")
      printFibonacciSequence(num)
    } else {
      println("The number must be greater than 0.")
    }
  }
}