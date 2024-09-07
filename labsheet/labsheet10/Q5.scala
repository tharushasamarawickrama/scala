object WordProcessor {

  def countLetterOccurrences(words: List[String]): Int = {
    // Step 1: Use map to transform the list of words into their respective lengths (number of letters)
    val lengths = words.map(word => word.length)

    // Step 2: Use reduce to calculate the total count of letter occurrences
    val totalLetterCount = lengths.reduce((a, b) => a + b)

    totalLetterCount
  }

  def main(args: Array[String]): Unit = {
    // Example input
    val words = List("apple", "banana", "cherry", "date")

    // Call the function and print the result
    val totalCount = countLetterOccurrences(words)
    println(s"Total count of letter occurrences: $totalCount")
  }
}
