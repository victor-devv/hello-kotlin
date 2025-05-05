
fun main() {
    println("How many numbers do you want to add up?")

    val amountOfNumbers = readln().toIntOrNull() ?: 0

    // While Loop
    var i = 0
    var sum = 0

    // since arrays have a fixed size, and adding to an array would cause an overhead, as array would have to be recreated, we can use lists, mutable lists
    //var numbers = intArrayOf();
    var numbers = mutableListOf<Int>()

    while(i < amountOfNumbers) {
        println("Please enter number #: ${i + 1}")
        val number = readln().toIntOrNull() ?: continue
        sum += number
        //numbers += number
        numbers.add(number)
        i++
    }

//    println("The provided numbers are: ${numbers.contentToString()}")
    println("The provided numbers are: $numbers")
    println("The total sum is $sum")
}
