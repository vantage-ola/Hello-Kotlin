// You earn $25 for every hour up to 40 hours, and $50 for every hour thereafter.
var hoursWorked = 45
var price = 0
val Range = 0..10
fun main(args: Array<String>) {
    if (hoursWorked > 40) {
        val hoursOver40 = hoursWorked - 40
        hoursWorked -= hoursOver40
    }
    price += hoursWorked * 25
    println(price)
    println(Range)
}
