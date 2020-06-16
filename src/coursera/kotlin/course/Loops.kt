package coursera.kotlin.course


fun main(args: Array<String>) {
    // Range including upper bound will print till 10
    for (i in 1 ..10){
        println(" Counter $i")
    }
    // Range Excluding upper bound will print till 9
    for (i in 1 until 10){
        println(" Counter2 $i")
    }
    // Prints all the characters+1
    for (ch in "abc") {
        print(ch + 1)
    }

    // in KEYWORD


    print("Checking Lexographically using in -->")
    println("Kotlin" in "Java" .. "Scala"); //True since K comes between J and S i.e. Alphabtical order
    // checking values exists in set of values
    print("Checking Value exists in a Set -->")
    println("Kotlin" in setOf<String>("Java","Scala")) //False as kotlin is not in set

    // You can do the same for Your custom objects if there implement Comparable.
    // For example
    // if(myDate in startDate .. endDate)

    // You can also use in to check if element is in a list
    //if(element in list)

    // You can also Use in for checking inside when condition
    // For Example
    val c = 10
    when(c){
        in 0..9 -> println("Value is small")
        in 10 ..11 -> println("Correct values")
        else -> println("Too High or Too Low values")
    }

    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}

//A valid identifier is a non-empty string
// that starts with a letter or underscore
// and consists of only letters, digits and underscores.
// You can achieve the same with String.none(), String.all() and filter() and then check size.
fun isValidIdentifier(s: String): Boolean {
    return (s.isNotEmpty()&&s.isNotBlank())
            && ( s.all { it.isLetter() }||
            ((s.startsWith("_")
                    && isAlphanumericOrUnderscore(s.substring(1)))))
}


fun isAlphanumericOrUnderscore(s : String) = s.all { it.isLetter()||it.isDigit()|| it.equals("_") }





