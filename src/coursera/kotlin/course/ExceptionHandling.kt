package coursera.kotlin.course

import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun findPercentage(number  :Int ) {
    val percent = if(number in 1..100)
         number
    else throw IllegalArgumentException("percentage must be between 1..100")
}

fun exceptionHandle(str : String):Int{
    val number = try {
        Integer.parseInt(str)
    }catch (e: NumberFormatException){
        0
    }
    return number
}

fun main(args : Array<String>){
    println("Argument ${args.getOrNull(0)}")
    findPercentage(100)
    println(exceptionHandle("T"))

    println(exceptionHandle("10"))
}

/*
https://www.coursera.org/learn/kotlin-for-java-developers/lecture/rn8SY/examples-from-the-standard-library
*/
