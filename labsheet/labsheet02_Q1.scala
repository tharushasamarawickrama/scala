object variables{
    def main(args: Array[String]): Unit = {
        //Declareand assign
        var i,j,k = 2
        var m,n =5
        var f = 12.0f
        var g = 4.0f
        var c = 'X'

        //Evaluating the expressions
        val a = k + 12 * m 
        val b = m / j
        val h = n % j
        val d = m / j * j
        val e = f + 10 * 5 + g
        i += 1
        val p= i * n

        //printing the results
        println(s"a) $a")
        println(s"b) $b")
        println(s"c) $h")
        println(s"d) $d")
        println(s"e) $e")
        println(s"f) $p")
    }
}