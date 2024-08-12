object NumberCategorizer {

  // Function to categorize the number based on the input
  def categorizeNumber(input: Int): String = {
    input match {
      // Check if the number is a multiple of both 3 and 5
      case n if ((n: Int) => n % 3 == 0 && n % 5 == 0)(n) => "Multiple of Both Three and Five"
      // Check if the number is a multiple of 3
      case n if ((n: Int) => n % 3 == 0)(n) => "Multiple of Three"
      // Check if the number is a multiple of 5
      case n if ((n: Int) => n % 5 == 0)(n) => "Multiple of Five"
      // If none of the above conditions are met
      case _ => "Not a Multiple of Three or Five"
    }
  }

  def main(args: Array[String]): Unit = {
    println("Please provide exactly one integer as an input.")

    // Read input from the user
    val input = scala.io.StdIn.readInt()

    // Get the message based on the input
    val message = categorizeNumber(input)

    // Print the result
    println(message)
  }
}
