package NBD9

case class Container[A](private val value:A) {
  def getContent(): A = value

  def applyFunction[R](changedTypeFunction: A => R): Container[R] = Container(changedTypeFunction(value))

  override def equals(that: Any): Boolean = false
}

object Exercise1{
  def main(args: Array[String]): Unit = {
    val charParametrizedContainer = new Container[Char]('X')
    println(charParametrizedContainer.getContent())
    println()
    val newContainer = charParametrizedContainer.applyFunction(getCharASCICode)
    println(newContainer.getContent())
    println()
    println(charParametrizedContainer.getContent())
  }

  def getCharASCICode(char: Char): Int ={
    return char.toInt
  }
}
