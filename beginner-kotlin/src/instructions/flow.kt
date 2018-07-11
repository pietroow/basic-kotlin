package instructions

import java.util.*

//fun instructions.whatHapenned(year: Int): String{
//
//    if (year == 2018) {
//        val number = year - 10
//        return "Ano que aprendi Kotlin"
//    } else
//        return "nao sei"
//}

//fun instructions.whatHapenned(year: Int) = when (year){
//
//    2018 -> "Aprendi Kotlin"
//    2019, 2020 -> "Nao sei"
//    else -> "kappa"
//
//}

fun whatHapenned(year: Int): String{

    when {
//        (1 == 1) -> return "Verdade!"
        year == 2018 -> return "Ano que aprendi kotlin"
        else -> return "nao sei"
    }

}


fun main(args: Array<String>) {

    val calendar: Calendar = Calendar.getInstance()
    val year = calendar.get(Calendar.YEAR)
    print(whatHapenned(year))

}