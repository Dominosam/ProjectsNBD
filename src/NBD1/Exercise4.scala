package NBD1

object Exercise4 {
  def main(args: Array[String]) {
    val weekDays = List("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    getWeekDaysRecurrenceFold(weekDays, "S")
  }

  def getWeekDaysRecurrenceFold(weekDays: List[String], startingLetter: String) = {
    //Zadanie 4a - foldl
    var weekDaysFoldLeft = weekDays.foldLeft("")((m, n) => m + n + ", ")
    println(weekDaysFoldLeft)
    //Zadanie 4b - foldr
    var weekDaysFoldRight = weekDays.foldRight("")((m, n) => m + ", " + n)
    println(weekDaysFoldRight)
    //Zadanie 4c - foldl - tylko zaczynajace się na startingLetter np "S" (zamiast "P")
    var weekDaysFoldStartingLetter = weekDays.filter(_.startsWith(startingLetter)).foldLeft("")((m, n) => (m + n + ", "))
    println(weekDaysFoldStartingLetter)
  }

}
