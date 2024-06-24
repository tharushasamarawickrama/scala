object XYZCo {
    def normalSalary(normalHours: Int): Int = {
        normalHours * 250
    }

    def OTSalary(otHours: Int): Int = {
        otHours * 85
    }

    def totalSalary(normalHours: Int, otHours: Int): Int = {
        normalSalary(normalHours) + OTSalary(otHours)
    }

    def tax(totalSalary: Int): Double = {
        totalSalary * 0.12
    }

    def finalSalary(normalHours: Int, otHours: Int): Double = {
        val total = totalSalary(normalHours, otHours)
        total - tax(total)
    }

    def main(args: Array[String]): Unit = {
        val normalHours = 40
        val otHours = 30

        println(s"The final take-home salary of an employee: Rs. ${finalSalary(normalHours, otHours)}")
    }
}
