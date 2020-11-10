package NBD1

object Exercise10 {
  def main(args: Array[String]) {
    val numbers = List(-123, -12, -5, -2, 0, -1, 0, 1.1, 2, 3.1, 0, 4.2222, 0, 5, 6, 0, 7.4352, 8, 0, 0.41234, 0, 9, 12, 24, 543, 3456)

    //Before total absolution (and <-5, 12> restrictions)
    println(numbers)
    //After total absolution (and <-5, 12> restrictions)
    println(getAbsoluteValuesList(numbers))
  }

  def getAbsoluteValuesList(numbers: List[Double]) = {
    numbers.filter(n => (n >= -5) && (n <= 12)).map(math.abs)
  }
}
