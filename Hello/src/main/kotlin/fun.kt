

fun printMyName() {
    println("My name is Ola")
}

fun printMultipleOf(multiplier: Int, andValue: Int) {
    println("$multiplier * $andValue = ${multiplier * andValue}")
}

fun multiply(number:Int, multiplier: Int): Int {
    return number * multiplier
}

fun main(args: Array<String>) {
    //printMultipleOf(4,7)
    //multiply(1,7)
    //val (product, quotient) = multiplyAndDivide(4, 2)
    val Name = ::NameSurname  //    Name("ola","ini")

}

fun multiplyAndDivide(number:Int, factor:Int): Pair<Int, Int> {
    return Pair(number * factor, number / factor)

}


fun NameSurname(a: String, b:String) : String {
    return (a+b)
}

