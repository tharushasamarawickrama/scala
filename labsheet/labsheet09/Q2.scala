object NumberClassifier {
  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide exactly one integer input.")
    } else {
      try {
        val input = args(0).toInt
        println(classifyNumber(input))
      } catch {
        case _: NumberFormatException => println("Please provide a valid integer.")
      }
    }
  }

  val classifyNumber: Int => String = {
    case x if x <= 0 => "Negative/Zero is input"
    case x if x % 2 == 0 => "Even number is given"
    case _ => "Odd number is given"
  }
}
