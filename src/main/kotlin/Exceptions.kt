
fun main() {
    println("Please enter a number")
    val input = readln()

    val inputAsInteger = try {
        input.toInt()
    } catch (e: NumberFormatException) { // can also catch Exception, which is general
        0
    }

    val output = when(inputAsInteger) {
        3 -> "The number is three!"
        5 -> "The number is five!"
        in 10 .. 20 -> "The number is between 10 and 20"
        else -> "I have no idea what to print"
    }
    println(output)

    //You can also throw exceptions by
    //throw Exception("What the hell did you pass in there?!")

}
