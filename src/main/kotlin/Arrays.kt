
fun main() {
    println("Please enter an index")
    val input = readln()
    val inputAsInt = input.toIntOrNull()
    var favNumbers = intArrayOf(1, 2, 3, 4, 5) // floatArrayOf, arrayOf, etc

    // append to array
    favNumbers += 6 // this would create another array under the hood, since array sizes are fixed
    favNumbers[2] = 69

//    println(favNumbers[0])
//    println(favNumbers.getOrNull(7)) // adds null safety (kotlin weird)

    if (inputAsInt != null && inputAsInt in 0 .. favNumbers.lastIndex) {
        println("Your number is ${favNumbers[inputAsInt]}")
    } else {
        println("You have provided an invalid input!")
    }

    // NOTE: arrays cannot be printed, you would need to call the .contentToString() function on the array to display the array
}
