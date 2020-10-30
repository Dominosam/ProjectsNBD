import scala.annotation.tailrec

object Exercise3 {
  def main(args: Array[String]) {
    val weekDays = List("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    //Zadanie3 - rekurencja ogonowa
    println(getWeekDaysTailRecurrence(weekDays));

  }

  def getWeekDaysTailRecurrence(weekDays: List[String]): String ={
    @tailrec
    def iter(weekDays: List[String], result: String, index: Int): String = {
      if(index == weekDays.length-1) {
        result + weekDays(index)
      } else {
        iter(weekDays, (result + weekDays(index) + ", "), index+1)
      }
    }
    return iter(weekDays, "", 0)
  }
}
