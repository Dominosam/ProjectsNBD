package NBD2

import scala.util.Random.between
import scala.util.Random.nextInt

object Exercise1 {
  def main(args: Array[String]) {
    val weekDays = List("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    val randomDay = weekDays(nextInt(weekDays.size))
    val randomWeekendDay = weekDays(between(5, weekDays.size))
    val notDay = "definatelyNotDay"
    println(randomDay + " is a: " + matchWeekWorkDay(randomDay))
    println(randomWeekendDay + " is a: " + matchWeekWorkDay(randomWeekendDay))
    println(notDay + " is a: " + matchWeekWorkDay(notDay))
  }

  def matchWeekWorkDay(day : String): String = day match{
    case "Saturday" | "Sunday" => "Weekend"
    case "Monday" | "Tuesday" | "Wednesday" | "Thursday" | "Friday" => "Workday"
    case _ => "Not a day"
  }
}
