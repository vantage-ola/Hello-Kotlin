import kotlin.math.roundToInt

class Person(var FirstName: String, var LastName: String) {
    val Fullname
        get() = "$FirstName $LastName"
}
class Tv(var height:Double, var width:Double){
    val diagonal: Int
        get() {
            val result = Math.sqrt(height * height + width * width)

            return result.roundToInt()
        }
}
fun main(args: Array<String>) {
    // println(Person(FirstName = "Ola", LastName = "Sanya")) //Person@511d50c0 heap memory

}