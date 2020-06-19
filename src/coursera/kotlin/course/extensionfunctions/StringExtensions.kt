package coursera.kotlin.course.extensionfunctions

//Under the hood in java it is static so to convert it to
// Java its signature will be like this StringExtensions.lastChar("")
// So effectively the string(class that is extended) itself is passed as first argument.
fun String.lastChar() = get(length-1)