package instructions

fun main(args: Array<String>){

    try {
        var number = "asyugegyas".toInt()
    } catch (e: Exception){
        println("Nao sei o que aconteceu")
    } finally {
        println("finalmente!")
    }


}