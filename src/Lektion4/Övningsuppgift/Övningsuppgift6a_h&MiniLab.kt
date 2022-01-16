@file:Suppress("UNUSED_EXPRESSION")

package Lektion4.Övningsuppgift

import java.util.*

class Animal(type: String, numberOfLegs: Int) {
    var type: String = type
        get() = field
        set(value) {
            field = value
        }

    var numberOfLegs: Int = numberOfLegs
        get() = field
        set(value) {
            field = value
        }

    private fun printAnimalsType() = println(type)
    private fun printAllInformation() = println("I am an animal of type \"$type\" and i have $numberOfLegs legs")

    fun printAll() {
        printAnimalsType()
        printAllInformation()
    }

    override fun toString(): String {
        return "Animal {Type:$type, Number of Legs:$numberOfLegs}"
    }
}

fun main() {
    val dog = Animal("Dog", 4)
    val cat = Animal("Cat", 4)
    val flamingos = Animal("Flamingos", 2)
    val spider = Animal("Spider", 8)
    /*animal1.printAll()
    animal2.printAll()*/

    println("Printing the list of animals:")
    val list = listOf(dog, cat, flamingos, spider)
    list.forEach { e ->
        e.printAll()
        println()
    }

    println("\nprinting using it:")
    list.forEach { it.printAll() }

    println("\nAfter maping to frog")

    list.map { Animal("Frog", 4) }
        .forEach { println(it) }

    //Minilab joinToString
    println("\nMinilab joinToString")
    list.joinToString(",") { "[${it.type.uppercase(Locale.getDefault())}]" }.forEach { print(it) }
    println("\nAnother methode")
    list.joinToString(",", transform = { "[${it.type.uppercase(Locale.getDefault())}]" }).forEach { print(it) }

    println("\n\nAfter mapIndexed")
    list.mapIndexed { index, element -> "[$index: $element ]" }.forEach { print(it) }
    println("\nAfter mapIndexed just index without element")
    list.mapIndexed { index, _ -> "[$index]" }.forEach { print(it) }

    println("\n\nAll Animals other than Spider")
    val otherThanSpider = { element: Animal -> element.type != "Spider" }
    list.filter(otherThanSpider).forEach { println(it) }

    println("\nPrinting Spider only")
    list.filterNot(otherThanSpider).forEach { println(it) }

    println("\nIs there any cat in the list")
    val isThereAnyCats = list.any { it.type == "Cat" }
    println(isThereAnyCats)

    list.map { element -> element.numberOfLegs }
        .reduce { num1: Int, num2: Int -> if (num1 > num2) num1 else num2 }.apply {
            println("\nUsing reduce to print the animal that has the highiest amount of legs:")
            println(this)
        }

    list.map { element -> element.numberOfLegs }
        .reduce { num1: Int, num2: Int -> num1 + num2 }.apply {
            println("\nUsing reduce to print the sum of all animals legs: $this")
        }

    list.count { it.numberOfLegs > 4 }.apply {
        println("\nThere are $this amount of insect(s)!")
    }

    val groupByNumberOfLegs = list.groupBy(Animal::numberOfLegs) { it.type }
    println("\nUsing groupBy to group the amount of legs to each animal:\n$groupByNumberOfLegs")


    val eachCount = list.groupingBy { it.type }.eachCount()
    println("\nUsing groupingBy to count the amount of each type of animals:\n$eachCount")

    val fold = list.groupingBy { it.type }.fold(0) { acc, element -> acc + element.numberOfLegs }
    println("\nUsing fold to count the amount of legs for each type of animals:\n$fold")

    list.groupingBy { it.numberOfLegs }
        .fold(listOf<String>()) { acc, element -> acc + element.type }
        .apply { println("\nUsing groupingBy to group the amount of legs to each animal:\n$this") }

    /* val reduce = list.groupingBy { it.type }
         .reduce { _, acc, element -> if (acc.numberOfLegs > element.numberOfLegs) acc else element }
     println(reduce)

     list.groupingBy { it.type }.reduce { _, accumulator, element ->
         if (accumulator.numberOfLegs == element.numberOfLegs) accumulator.also {
             listOf(
                 accumulator,
                 element
             )
         } else element
     }.apply {
         println(this)
     }
*/
    list.groupingBy { it.numberOfLegs }.fold({ key, _ -> key to mutableListOf<Animal>() },
        { _, accumulator, element ->
            accumulator.also { (_, list) ->
                if (element.numberOfLegs == accumulator.first)
                    list.add(element)
            }
        }).apply { println(this) }

}

