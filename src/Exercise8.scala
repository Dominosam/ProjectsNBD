object Exercise8 {
  def main(args: Array[String]) {
    val numbers = List(-2,0,-1,0,1,2,3,0,4,0,5,6,0,7,8,0,0,0,9)
    println(getNumbersWithoutZero(numbers))
  }

  def getNumbersWithoutZero(numbers:List[Int], currentNumber: Option[Int] = None):List[Int]= (numbers, currentNumber) match {
    case (n :: ns, Some(m)) if n == 0 => getNumbersWithoutZero(ns, Some(m))
    case (n :: ns, _) => n :: getNumbersWithoutZero(ns, Some(n))
    case _ => Nil
  }
}
