
fun main() {
    // traverse in reverse
    println("Enter a string")
    val input = readln()

    // named params
    val reversed = reverseVal(stringToReverse = input)
    println(reversed)

    val reversed2 = input.reverse()
    println(reversed2)

    val numberInput = input.toIntOrNull()
    val reversedInt = numberInput?.reverse()
    println(reversedInt)

    val reversedInt2 = numberInput?.let { reverseVal(numberToReverse = it) } // called this way due to the null safe operator
    println(reversedInt2)

    if (input == reversed) {
        println("That's a palindrome!")
    }
}

// Normal Function
fun reverseVal(stringToReverse: String): String {
    val finalString = buildString {
        for (i in stringToReverse.lastIndex downTo 0) {
            append(stringToReverse[i])
        }
    }

    return finalString
}

// Extension Function
fun String.reverse(): String {
    val finalString = buildString {
        // it could also be just lastIndex as this. is added implicitly by the compiler
        // add @reverse so the compiler knows you're referring to the String in this, if not, it refers to the immediate block (the buildString and for loop respectively)
        for (i in this@reverse.lastIndex downTo 0) {
            append(this@reverse[i])
        }
    }

    return finalString
}

// Function Overloading
fun Int.reverse(): Int {
    return this.toString().reverse().toInt()
}

fun reverseVal(numberToReverse: Int): Int {
    return numberToReverse.toString().reversed().toInt()
}
