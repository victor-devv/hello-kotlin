
fun main() {
    println("Please enter a number")
    val input = readln()

    //val inputAsInt = input.toIntOrNull()

    //val isEven = inputAsInt!! % 2 == 0 //double bang !! because it can be null (kotlin is weird), but you would still get a null pointer exception if null, instead set a fixed default value using ?:

    // NULL SAFETY OPERATOR ?: (set default if null) ?. (chain function call if not null)
//    val inputAsInt = input.toIntOrNull() ?: 0
//    val isEven = inputAsInt % 2 == 0
//
//    print("Is the number even? $isEven")

    // increment
//    val inputAsInt = input.toIntOrNull()?.inc() //inc works if expression before is not null
//    print("The incremented number is $inputAsInt")

    val isEven = input.toIntOrNull()?.rem(2)?.equals(0)
    print("Is even? $isEven")
}
