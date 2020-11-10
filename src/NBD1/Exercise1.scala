package NBD1

object Exercise1 {
  def main(args: Array[String]) {
    val weekDays = List("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    //Zadanie1 a - pętla for
    getWeekDaysStringFor(weekDays);
    //Zadanie1 b - pętla for z warunkiem na literę 'S', zamiast 'P', ponieważ napisałem dni po angielsku
    getWeekDaysStringOnLetter(weekDays, 'S');
    //Zadanie1 c - while
    getWeekDaysStringWhile(weekDays);
  }

  def getWeekDaysStringFor(weekDays: List[String]): Unit = {
    var weekDaysString = ""
    for (day <- weekDays) {
      weekDaysString += day
      if (day != weekDays.last) {
        weekDaysString += ", "
      }
    }
    println(weekDaysString);
  }

  def getWeekDaysStringOnLetter(weekDays: List[String], firstChar: Char): Unit = {
    var weekDaysString = ""
    for (day <- weekDays) {
      if (day.charAt(0) == firstChar) {
        weekDaysString += day
        if (day != weekDays.last) {
          weekDaysString += ", "
        }
      }
    }
    println(weekDaysString);
  }

  def getWeekDaysStringWhile(weekDays: List[String]): Unit = {
    var weekDaysString = ""
    var i = 0
    while (i < weekDays.length) {
      weekDaysString += weekDays(i)
      if (i < weekDays.length - 1) {
        weekDaysString += ", "
      }
      i += 1
    }
    println(weekDaysString);
  }

}
