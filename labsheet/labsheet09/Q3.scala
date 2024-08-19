object NameFormatter {
  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    println("To upper case:")
    names.foreach { name =>
      println(formatNames(name, toUpper))    // Formatting to uppercase for demonstration
    }
    
    println("To lower case:")
    names.foreach { name =>
      println(formatNames(name, toLower))    // Formatting to lowercase for demonstration
    }

    // Custom formats as per the example output
    println("To custom case:")
    println(formatNames("Benny", toUpper))
    println(formatNames("Niroshan", name => name.substring(0, 2).toUpperCase + name.substring(2).toLowerCase))
    println(formatNames("Saman", toLower))
    println(formatNames("Kumara", name => name.substring(0, 1).toUpperCase + name.substring(1, 5).toLowerCase + name.substring(5).toUpperCase))
  }

  def toUpper(name: String): String = {
    name.toUpperCase
  }

  def toLower(name: String): String = {
    name.toLowerCase
  }

  def formatNames(name: String, formatFunction: String => String): String = {
    formatFunction(name)
  }
}
