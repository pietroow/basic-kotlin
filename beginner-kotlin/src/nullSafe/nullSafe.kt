package nullSafe

fun main(args: Array<String>){

    val str: String? = null
//    println(str?.length)

    if (str != null){
//        println(str.length)
    }

    val n1 = nullExampleJava()
    println(n1.name)
    println(n1.age)

    val n2 = nullExampleJava.getInstance()
    if(n2 != null){
        if(n2.age != null){
            println(n2.age)
        }
    }

    println(n2!!.name?.length)

}