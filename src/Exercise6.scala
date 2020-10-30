object Exercise6 {
  def main(args: Array[String]) {
    // Before black friday
    val tripleTuple = Tuple3("TestOneTwoThreeeeee", 23, 0.01)
    printTripleTuple(tripleTuple)
  }

  def printTripleTuple(tuple3:(String, Int, Double)) = {
    println(tuple3._1)
    println(tuple3._2)
    println(tuple3._3)
  }
}
