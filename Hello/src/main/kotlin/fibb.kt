fun fibonacci(number: Int): Int {
    if (number <= 1) {
        return number
    }
    return(fibonacci(number-1) + fibonacci(number-2))
}


fun main(args: Array<String>) {
    println(fibonacci(12))  // = 1
}

var myName = "Ola"
var age = 17
var occupation = "Software Developer and Student"

var errorCode: Int? = null //values 