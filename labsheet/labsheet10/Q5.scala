object LetterCount {

  def countLetterOccurrences(words: List[String]): Int = {
    // Step 1: Map each word to its length (number of letters)
    val lengths = words.map(_.length)

    // Step 2: Reduce the lengths to get the total count of letter occurrences
    val totalCount = lengths.reduce(_ + _)

    totalCount
  }

  def main(args: Array[String]): Unit = {
    val words = List("apple", "banana", "cherry", "date")
    val totalLetters = countLetterOccurrences(words)
    println(s"Total count of letter occurrences: $totalLetters")
  }
}
