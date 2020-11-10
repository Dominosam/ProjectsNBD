package NBD1

object Exercise9 {
  def main(args: Array[String]) {
    val numbers = List(-2, 0, -1, 0, 1, 2, 3, 0, 4, 0, 5, 6, 0, 7, 8, 0, 0, 0, 9)

    //Before incrementation
    println(numbers)
    //After incrementation
    println(incrementNumbersListByOne(numbers))
  }

  def incrementNumbersListByOne(numbers: List[Int]) = {
    numbers.map(x => x + 1)
  }
}
