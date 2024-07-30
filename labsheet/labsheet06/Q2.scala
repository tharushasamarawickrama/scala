import scala.io.StdIn._

def getStudentInfo: (String, Int, Int, Double, Char) = {
    var isValid = false
    var name = ""
    var marks = 0
    var totalMarks = 0
      println("Enter student name:")
      name = readLine()
      println("Enter marks:")
      marks = readInt()
      println("Enter total possible marks:")
      totalMarks = readInt()
      
      val validation = validateInput(name, marks, totalMarks)
      isValid = validation._1
      if (!isValid) println(s"Error: ${validation._2}")
    
    
    val percentage = (marks.toDouble / totalMarks) * 100
    val grade = percentage match {
      case p if p >= 90 => 'A'
      case p if p >= 75 => 'B'
      case p if p >= 50 => 'C'
      case _ => 'D'
    }
    
    (name, marks, totalMarks, percentage, grade)
  }

  def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = record
    println(s"Name: $name")
    println(s"Marks: $marks")
    println(s"Total Possible Marks: $totalMarks")
    println(s"Percentage: $percentage")
    println(s"Grade: $grade")
  }

  def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
    if (name.isEmpty) {
      (false, Some("Name cannot be empty"))
    } else if (marks < 0 || totalMarks < 0) {
      (false, Some("Marks and total possible marks must be positive"))
    } else if (marks > totalMarks) {
      (false, Some("Marks cannot exceed total possible marks"))
    } else {
      (true, None)
    }
  }

  def getStudentInfoWithRetry: (String, Int, Int, Double, Char) = {
    var record: (String, Int, Int, Double, Char) = null
    var isValid = false
    while (!isValid) {
      val (name, marks, totalMarks, percentage, grade) = getStudentInfo
      val validation = validateInput(name, marks, totalMarks)
      isValid = validation._1
      if (isValid) {
        record = (name, marks, totalMarks, percentage, grade)
      } else {
        println(s"Error: ${validation._2}")
      }
    }
    record
  }

def main(args: Array[String]): Unit = {
  val studentRecord = getStudentInfoWithRetry
  printStudentRecord(studentRecord)

}