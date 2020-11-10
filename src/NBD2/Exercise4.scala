package NBD2

object Exercise4 {
  def main(args: Array[String]): Unit = {
    println("Sum: " + calculateX(5, sum))
    println("Diff: " + calculateX(5, diff))
    println("Multiply: " + calculateX(5, multiply))
    println("Divide: " + calculateX(5, divide))
  }

  def calculateX(x: Int, f:(Int, Int) => Int) : Int = {
    f(x,  f(x, f(x, x+x)))
  }

  def sum(x: Int, y: Int): Int = {x+y}
  def diff(x: Int, y: Int): Int = {x-y}
  def multiply(x: Int, y: Int): Int = {x*y}
  def divide(x: Int, y: Int): Int = y match {
    case 0 => 0
    case _ =>(x/y)
  }
}
