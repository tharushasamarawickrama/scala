error id: file:///C:/Users/tharu/Desktop/scala/scala/labsheet03/Q1.scala:[299..302) in Input.VirtualFile("file:///C:/Users/tharu/Desktop/scala/scala/labsheet03/Q1.scala", "object StringReverser  {
  def reverseString(s: String): String = s match {
    case "" => "" // Base case: if the string is empty, return an empty string
    case _ => reverseString(s.tail) + s.head // Recursive case: reverse the tail and append the head
  }


  def
  // Example usage:
  val inputString = "tharusha"
  println(s"Original string: $inputString")
  println(s"Reversed string: ${reverseString(inputString)}")
}
")
file:///C:/Users/tharu/Desktop/scala/scala/labsheet03/Q1.scala
file:///C:/Users/tharu/Desktop/scala/scala/labsheet03/Q1.scala:10: error: expected identifier; obtained val
  val inputString = "tharusha"
  ^
#### Short summary: 

expected identifier; obtained val