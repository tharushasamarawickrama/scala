object StringFormatter {
  
  def toUpper(input: String): String = input.toUpperCase

  
  def toLower(input: String): String = input.toLowerCase

  
  def formatNames(name: String)(formatFunc: String => String): String = formatFunc(name)

  def main(args: Array[String]): Unit = {
    
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    
    val formattedNames = names.map {
      case "Benny" => formatNames("Benny")(toUpper)
      case "Niroshan" => formatNames("Niroshan")(name => name.substring(0, 2).toUpperCase + name.substring(2))
      case "Saman" => formatNames("Saman")(toLower)
      case "Kumara" => formatNames("Kumara")(name => name.substring(0, 1).toUpperCase + name.substring(1, name.length - 1) + name.substring(name.length - 1).toUpperCase)
    }

    
    formattedNames.foreach(println)
  }
}