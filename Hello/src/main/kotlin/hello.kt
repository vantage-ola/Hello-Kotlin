import kotlin.math.*

var messgae = "Hello"+" my name is"
val name = "Ola"
val bigString = """
|You can have a string
|that contains multiple
|lines
|by
""".trimMargin()

val fakeAge = 18
val realAge = 17

fun main(args: Array<String>) {  //main function
    val coordinates = Triple(10, 5, 15)  // println(coordinates.first)
    val (x, y, _) = coordinates //  ignore z

    val a = 4
    val b: Short = 100
    val c: Byte = 12

    //println(a+b -c)

}

/* Unit return type*/
fun add() : Unit {
    val result = 2+2
    println(result)
}

//do {
    // (<LOOP CODE>)
//} while (<CONDITION>)