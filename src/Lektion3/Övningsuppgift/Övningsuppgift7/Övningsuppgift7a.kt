package Lektion3.Övningsuppgift.Övningsuppgift7

fun main(){
     fun amountAfterInterest(amount :Long, years: Int, interest: Long) : Long  {
        return if (years == 0) amount
        else amountAfterInterest ((amount + amount*interest / 100), years-1, interest)
    }

    println(amountAfterInterest(1_000_000L, 5, 4))

}