object question04{
    def main(args: Array[String]): Unit ={
        println(profit(15));
        println(profit(20));
        println(profit(25));
        println(profit(30));

    }
}
def noOfAttendees(ticket_price: Double): Double={
        120 + (15 - ticket_price) * 4 // 20/5
    }
def cost(ticket_price: Double):Double={
    var noOfshow= (noOfAttendees(ticket_price)/120)
    if(noOfshow <= 1){
        noOfshow=1
    }else{
        noOfshow=2
    }
    
       noOfshow*500+noOfAttendees(ticket_price)*3 
    }
def income(ticket_price:Double):Double={
    noOfAttendees(ticket_price)*ticket_price
}
def profit(ticket_price:Double):Double={
    income(ticket_price)-cost(ticket_price)
}