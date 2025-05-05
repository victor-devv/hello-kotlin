
fun main() {
    println("How many numbers do you want to add up?")

    val amountOfNumbers = readln().toIntOrNull() ?: 0

    var sum = 0
    // since arrays have a fixed size, and adding to an array would cause an overhead, as array would have to be recreated, we can use lists, mutable lists
    //var numbers = intArrayOf();
    var numbers = mutableListOf<Int>()


    // While Loop
    var i = 0
    while(i < amountOfNumbers) {
        println("Please enter number #: ${i + 1}")
        val number = readln().toIntOrNull() ?: continue
        sum += number
        //numbers += number
        numbers.add(number)
        i++
    }

    // For Loop
    for (j in 0 until amountOfNumbers) {
        println("Please enter number #: ${j + 1}")
        val number = readln().toIntOrNull() ?: continue
        sum += number
        numbers.add(number)
    }

    for (number in numbers) {
        println(number)
    }

    //    println("The provided numbers are: ${numbers.contentToString()}")
    println("The provided numbers are: $numbers")
    println("The total sum is $sum")

    // traverse in reverse
    println("Enter a string")
    val input = readln()

    val finalString = buildString {
        for (i in input.lastIndex downTo 0) {
            append(input[i])
        }
    }

    println(finalString)
}
