package instructions

//fun instructions.hello() = println("Hello")
//
//fun instructions.toUpper(str: String) = str.toUpperCase()
//
//fun instructions.firstLetter(str: String, index: Int) = str[index]

fun whichNumberIsBigger(n1: Int, n2: Int) = if (n1 > n2) n1 else n2

fun main(args: Array<String>) {
//
//    instructions.hello()
//    println(instructions.toUpper("VictOrPieTRo"))
//    println(instructions.firstLetter("Pietro", 0))
    println(whichNumberIsBigger(1, 5))

}