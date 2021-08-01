val months = arrayOf( "January", "February", "March",
    "April", "May", "June",
    "July", "August", "September",
    "October", "November", "December")
class SimpleDate(var month: String) {
    fun monthsUntilWinterBreak(): Int {
        return months.indexOf("December") - months.indexOf(this.month)
    }
}

fun main(args: Array<String>) {
    val date1 = SimpleDate("July")
    println(date1.monthsUntilWinterBreak())
}