package Lektion2.Övningsuppgift.`5`

class Rectangle(val width: Double, val height: Double)

fun Rectangle.area() = width * height

fun Rectangle.perimeter(): Double {
    return 2 * (width + height)
}

fun main() {

    val rectangle = Rectangle(2.0, 3.0)
    println("Perimeter: ${rectangle.perimeter()}")
    println("Area: ${rectangle.area()}")
    println("Area of rectangle(4.0,5.0): ${Rectangle(4.0, 5.0).area()}")

    val rectangle1 = Rectangle(height = 5.0, width = 4.0)
    println(message = "Perimeter: ${rectangle1.perimeter()}")
    println(message = "Area: ${rectangle1.area()}")
}