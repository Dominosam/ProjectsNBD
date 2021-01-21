package NBD9

trait Exercise4Maybe[+A]{
  def applyFunction[R](changedTypeFunction: A => R): Exercise4Maybe[R]
  def getOrElse[R >: A](defaultValue: => R) : R

}
case class Exercise4Yes[A](value: A)extends Exercise4Maybe[A] {
  override def applyFunction[R](changedTypeFunction: A => R): Exercise4Maybe[R] = Exercise4Yes(changedTypeFunction(value))

  override def getOrElse[R >: A](defaultValue: => R): R = value
}
case class Exercise4No() extends Exercise4Maybe[Nothing] {
  override def applyFunction[R](changedTypeFunction: Nothing => R): Exercise4Maybe[R] = Exercise4No()
  override def getOrElse[R >: Nothing](defaultValue: => R): R = defaultValue
}

object Exercise4 {
  def main(args: Array[String]): Unit = {
    val yes = Exercise4Yes('X')
    val no = Exercise4No()

    println(yes.getOrElse('Z')) //should be X
    println(no.getOrElse('Z')) //should be Z
  }
}
