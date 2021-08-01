enum class DayOfTheWeek {
   Sunday,
   Monday,
   Tuesday,
   Wednesday,
   Thursday,
   Friday,
   Saturday
}
fun main(args : Array<String>) {
    //for (day in DayOfTheWeek.values()) println("Day ${day.ordinal}: ${day.name}")
    val dayIndex = 0
    val dayAtIndex = DayOfTheWeek.values()[dayIndex]
    val tuesday = DayOfTheWeek.valueOf("Tuesday")
    println("Day at $dayIndex is $dayAtIndex")
    println("Day at ${tuesday.ordinal} is $tuesday")
}
