import java.lang.Exception

fun main() {

    /**
     * Basic Data type
     *
     * val intNum = 3
     * val doubleNum = 3.33
     * val floatNum = 3.33f
     * val bool = true
     * val str = "abc"
     */

    var x: Int = 3 * 4
    println("The value of x is $x")

    val sentence = "Kotlin is the best language"
    println(sentence.toUpperCase())

    /**
     * If-else
     */
    x = 4
    val y = if (x == 2) "Hoohoo" else "Poopoo"
    println("Value of y is $y")


    /**
     * Nulls
     */
//    val nullInt: Int? = null

//    val input1 = readLine() as? Int ?: 0
//    val input2 = readLine() as? Int ?: 0
//    val result = input1 + input2

//    println("Value of result is $result")

    /**
     * Lists
     */
//    val shoppingList = listOf<String>("Porsche", "BMW", "Tesla")
    val shoppingList = mutableListOf("Porsche", "BMW", "Tesla")
    shoppingList.add("Ferrari")
    println(shoppingList[3])

    for (shoppingItem in shoppingList) {
        println(shoppingItem)
    }

    /**
     * For-Loop
     */
    for (i in 1..100) {
        println(i)
    }

    when (3) {
        in 1..2 -> println("num is between 1 and 2")
        in 3..10 -> println("num is between 3 and 10")
        else -> {
            println("num is not in range of 1 to 10")
        }
    }

    /**
     * Functions
     */
//    fun Int.isOdd()  = this % 2 == 1
    fun Int.isOdd(): Boolean {
        return this % 2 == 1
    }
    println("Number 2 is odd: ${2.isOdd()}")

    /**
     * Classes
     */
    val dog = Dog()
    dog.makeSound()
    val cat = Cat()
    cat.makeSound()
//    val animal = Animal("Fish")

    /**
     * Anonymous Class
     */
    val bear = object : Animal("Bear") {
        override fun makeSound() {
            println("Bear bear!")
        }
    }
    bear.makeSound()

    /**
     * Exception Try-Catch
     */
//    val parsedHh = try {
//        val hh = readLine() ?: "0"
//        hh.toInt()
//    } catch (e: Exception) {
//        println(e)
//        0
//    }
//    println(parsedHh)

    /**
     * Lambda Function
     */
    val myList = listOf("Kotlin", "is", "fun")
    val count01 = myList.count { currStr -> currStr.length >= 3 }

    println(count01)

    fun List<String>.custCount(func: (String) -> Boolean): Int {
        var counter = 0
        for (string in this) {
            if (func(string)) counter++
        }
        return counter
    }

//    val count02 = myList.custCount (func = { currStr -> currStr.length >= 4 } )
    val count02 = myList.custCount { currStr -> currStr.length >= 4 }
    println(count02)

    /**
     * Generics
     */
    fun <T> List<T>.genCount(func: (T) -> Boolean): Int {
        var counter = 0
        for (string in this) {
            if (func(string)) counter++
        }
        return counter
    }

    val anoList = listOf(2, 3, 4, 5, 6)
    val count03 = anoList.genCount { curr -> curr >= 4 }
    println(count03)
}