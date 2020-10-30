object Exercise2 {
  def main(args: Array[String]) {
    val weekDays = List("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    //Zadanie2 a - rekurencja przodem
    println(getWeekDaysRecurrence(weekDays, 0));

    //Zadanie2 b - rekurencja tylem
    println(getWeekDaysRecurrenceBackwards(weekDays, weekDays.length-1));
  }

  def getWeekDaysRecurrence(weekDays: List[String], index: Int): String ={
    if(index < weekDays.length - 1 ){
      return weekDays(index) + ", " + getWeekDaysRecurrence(weekDays, index+1)
    }
    return weekDays(index)
  }

  def getWeekDaysRecurrenceBackwards(weekDays: List[String], index: Int): String ={
    if(index > 0) {
      return weekDays(index) + ", " + getWeekDaysRecurrenceBackwards(weekDays, index-1)
    }
    return weekDays(index)
  }

}
