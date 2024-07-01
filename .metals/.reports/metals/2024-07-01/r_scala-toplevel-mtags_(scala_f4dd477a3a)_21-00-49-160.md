error id: file:///C:/Users/tharu/Desktop/scala/scala/labsheet03/Q1.scala:[306..309) in Input.VirtualFile("file:///C:/Users/tharu/Desktop/scala/scala/labsheet03/Q1.scala", "object StringReverser extends App {
  def reverseString(s: String): String = s match {
    case "" => "" // Base case: if the string is empty, return an empty string
    case _ => reverseString(s.tail) + s.head // Recursive case: reverse the tail and append the head
  }
  def
  // Example usage:
  val inputString = "hello"
  println(s"Original string: $inputString")
  println(s"Reversed string: ${reverseString(inputString)}")
}
")
file:///C:/Users/tharu/Desktop/scala/scala/labsheet03/Q1.scala
file:///C:/Users/tharu/Desktop/scala/scala/labsheet03/Q1.scala:8: error: expected identifier; obtained val
  val inputString = "hello"
  ^
#### Short summary: 

expected identifier; obtained val