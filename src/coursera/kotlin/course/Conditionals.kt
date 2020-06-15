package coursera.kotlin.course

import coursera.kotlin.course.Color.*
import java.util.concurrent.locks.Condition


enum class Color {
    BLUE, ORANGE, RED, YELLOW, GREEN;
}

interface Animal {

}

class Cat : Animal {
    fun meow() = println("meow")
}

class Dog : Animal {
    fun bark() = println("Woof")
}

class Conditionals {
    fun getDescription(color: Color): String = when (color) {
        BLUE, GREEN -> "Cold"
        RED, YELLOW -> "Hot"
        else -> "Warm"
    }

    fun respondToAttendence(input: String): String = when (input) {
        "Y", "Yes" -> "Attending"
        else -> "Not attending"
    }

    fun mixColors(firstColor: Color, secondColor: Color): Color = when (setOf(firstColor, secondColor)) {
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        else -> throw Exception("Dirty Color")
    }

    fun checkTypes(animal: Animal) {
        when (animal) {
            is Cat -> animal.meow() // No Casting is needed // This is knows as smart cast
            is Dog -> animal.bark() // no need to cast to a dog and all the methods are available.
        }
    }

    fun myFavoriteAnimal(counter: Int) = if (counter == 1) Dog() else Cat()

    fun favoriteAnimalSound(counter : Int) {
        when (val animal = Conditionals().myFavoriteAnimal(counter)) { // evaluate expression and save it a variable so that you can use smart cast.
            is Cat -> animal.meow() // No Casting is needed // This is knows as smart cast
            is Dog -> animal.bark() // no need to cast to a dog and all the methods are available.
        }
    }


}

fun main(args: Array<String>) {
    println(Conditionals().getDescription(RED))
    println(Conditionals().respondToAttendence("Yes"))
    println(Conditionals().respondToAttendence("Y"))
    print(Conditionals().respondToAttendence("Not sure"))
    println(Conditionals().mixColors(RED, YELLOW))
    println(Conditionals().favoriteAnimalSound(1))
}
