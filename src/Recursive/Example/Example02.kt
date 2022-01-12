package Recursive.Example
/*

// Kotlin program of factorial using recursion
fun fact(num: Int): Long {
    return num * fact(num - 1)  // no terminate condition
}

//main method
fun main() {
    println("Factorial of 5 is: " + fact(5))
//Recursive call
}*/

fun recursionExample(n: Int): Int {
    return if (n == 1) {
        println("$n\n")
        println("Recursion has ended")
        n
    } else {
        print("$n+")
        n + recursionExample(n - 1)
    }
}

// Kotlin program of factorial using recursion
fun fact(num: Int): Long {
    return if (num == 1) num.toLong()     // terminate condition
    else num * fact(num - 1)
}

// Kotlin program of factorial using tail-recursion
fun factorial(num: Int, x: Int): Long {

    return if (num == 1)   // terminate condition
        x.toLong()
    else
        factorial(num - 1, x * num)   //tail recursion
}

// two parameters passed an array and size of array
fun sum(args: Array<Int>, index: Int): Int {
    return if (index <= 0) 0
    else (sum(args, index - 1) + args[index - 1])     // recursive function call
}

// two parameters passed an array and size of array
fun sum1(args: Array<Int>, index: Int, s: Int = 0): Int {
    return if (index <= 0) s
    else sum1(args, index - 1, s + args[index - 1])     // tail-recursion
}

//main method
fun main() {
    println(recursionExample(5))

    println("Factorial of 5 is: " + fact(5))   //Recursive call

    var b = 1
    var result = factorial(5, b)
    println("Factorial of 5 is: $result")

    // array initialization
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // size of array
    val n = array.size
    val result1 = sum(array, n)             // normal function call
    println("The sum of array elements is: $result1")
    for (element in array) {
        println(element)
    }

    val result2 = sum1(array, n)             // normal function call
    println("The sum of array elements is: $result2")

}

