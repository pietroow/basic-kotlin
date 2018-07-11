package instructions

fun hello() {
    println("Hello")
}

fun toUpper(str: String): String {
    return str.toUpperCase()
}

fun firstLetter(str: String, index: Int): Char{
    return str[index]
}

fun main(args: Array<String>) {
    hello()
    println(toUpper("VictOrPieTRo"))

    println(firstLetter("Pietro", 0))
}