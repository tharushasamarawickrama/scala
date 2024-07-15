object Q2{
        def identifynum()={
             println("input a number");
             val input=scala.io.StdIn.readLine().toInt;
             if(input<=0){
                println("Negative or Zero");
             }else if(input%2==0){
                println("Even number");
             }else{
                println("Odd number");
             }
        }



     def main(args: Array[String]): Unit = {
        identifynum();
     }
}