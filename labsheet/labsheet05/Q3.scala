object fibonacci{

    def fib(num:Int):Int=num match{
        case 0 => 0
        case 1 =>  1
        case _ => fib(num-1) + fib(num-2)
    

    }

    def main(args:Array[String]):Unit={


  println(fib(10));
 }
}