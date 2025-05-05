
fun main() {
    // traverse in reverse
    println("Enter a string")
    val input = readln()

    // Lambda Functions
    // filter takes a lambda function as parameters

    val lettersOnly = input.filter {
        it.isLetter()
    }
    println(lettersOnly)

    // Saving Lambda functions to variables
    val lambda: (Char) -> Boolean = {
        it.isLetter()
    }
    val lettersOnly2 = input.filter(lambda)
    println(lettersOnly2)

    // if you want a variable name different from it
    val lettersOnly3 = input.filter { currentCharacter ->
        currentCharacter.isLetter()
    }
    println(lettersOnly3)

    // Custom Lambda
    val lettersOnly4 = input.myFilter(lambda)
    println(lettersOnly4)

    val favNumbers = intArrayOf(1, 2, 3, 69)
    val evenNumbers = favNumbers.filter { it % 2 == 0 }
    println(evenNumbers)

    val squaredNumbers = favNumbers.map { it * it }
    println(squaredNumbers)
}

// Lambda Function
fun String.myFilter(predicate: (Char) -> Boolean): String {
    return buildString {
        for (char in this@myFilter) {
            if(predicate(char)) {
                append(char)
            }
        }
    }
}

// Lambda Function with Extension Func Param
fun String.myFilter2(predicate: Char.() -> Boolean): String {
    return buildString {
        for (char in this@myFilter2) {
            if(char.predicate()) {
                append(char)
            }
        }
    }
}
