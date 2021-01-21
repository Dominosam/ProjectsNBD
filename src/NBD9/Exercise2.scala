package NBD9

trait Maybe[A]
case class Yes[A](value: A)extends Maybe[A]
case class No() extends Maybe[Nothing]


object Exercise2 {
  def main(args: Array[String]): Unit = {
    println("Is Yes() subtype of Maybe?: " + Yes('X').isInstanceOf[Maybe[_]])
    println("Is No() subtype of Maybe?: " + No().isInstanceOf[Maybe[_]])
  }
}
