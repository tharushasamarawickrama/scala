object StringReverser extends App {
  def reverseString(s: String): String = s match {
    case "" => "" // Base case: if the string is empty, return an empty string
    case _ => reverseString(s.tail) + s.head // Recursive case: reverse the tail and append the head
  }

  // Get user input
  println("Enter a string to reverse:")
  val inputString = scala.io.StdIn.readLine()

  // Output the original and reversed string
  println(s"Original string: $inputString")
  println(s"Reversed string: ${reverseString(inputString)}")
}
