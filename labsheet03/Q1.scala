object StringReverser {
  def reverseString(s: String): String = s match {
    case "" => "" // Base case: if the string is empty, return an empty string
    case _ => reverseString(s.tail) + s.head // Recursive case: reverse the tail and append the head
  }
  
  def main(args: Array[String]): Unit = {
    // Example usage:
  val inputString = "hello" 
  println(s"Original string: $inputString")
  println(s"Reversed string: ${reverseString(inputString)}")
  }
}
