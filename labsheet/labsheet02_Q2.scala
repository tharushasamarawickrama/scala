object ik{
    def main(args: Array[String]): Unit = {
        //initialise the variable
        var a = 2
        var b = 3
        var c = 4
        var d = 5
        var k = 4.3f
        var g = 3.0f

         //println( - -b * a + c *d - -);
         b-=1 
         println(s"a) ${b*a+c*d}")
         d -= 1

         // println(a++); 
        println(s"b) $a")
        a += 1

        // println (–2 * ( g – k ) +c);
        println(s"c) ${-2*(g-k) + c}")

        //) println (c=c++); 
        println(s"d) $c")
        c += 1

        // println (c=++c*a++); 
        c += 1
        println(s"e) ${c*a}")
        a += 1


    }
}