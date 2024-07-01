object StringFilter  {
  def filterLongStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
  }
  def main(args: Array[String]): Unit = {
    
  // Example usage:
  val inputStrings = List("hello", "world", "Scala", "programming", "is", "fun")
  val filteredStrings = filterLongStrings(inputStrings)
  println(s"Original list: $inputStrings")
  println(s"Filtered list: $filteredStrings")
  }
}
