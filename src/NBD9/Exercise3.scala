package NBD9

trait NewMaybe[+A]{
  def applyFunction[R](changedTypeFunction: A => R): NewMaybe[R]

}
case class NewYes[A](value: A)extends NewMaybe[A] {
  override def applyFunction[R](changedTypeFunction: A => R): NewMaybe[R] = NewYes(changedTypeFunction(value))
}
case class NewNo() extends NewMaybe[Nothing] {
  override def applyFunction[R](changedTypeFunction: Nothing => R): NewMaybe[R] = NewNo()
}

object Exercise3 {
  def main(args: Array[String]): Unit = {
    val yes = NewYes('X')
    val no = NewNo()

    println("Is NewYes() subtype of Maybe?: " + yes.isInstanceOf[NewMaybe[_]])
    println("Is NewNo() subtype of Maybe?: " + no.isInstanceOf[NewMaybe[_]])

    println(yes)
    println(no)

    println(yes.applyFunction(Exercise1.getCharASCICode))
    println(no.applyFunction(Exercise1.getCharASCICode))
  }
}
