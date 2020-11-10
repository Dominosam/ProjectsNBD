package NBD1

object Exercise7 {
  def main(args: Array[String]) {
    // Before black friday
    val food = Map("Burger" -> 10.0, "RibEyeSteak" -> 20.0, "FrenchFries" -> 3.0, "Nuggets" -> 6.0, "FiletMignon" -> 40.0)

    val successfulOrderPrice: Option[Double] = food.get("Burger")
    val failedOrderPrice: Option[Double] = food.get("Salad")

    printOptionResult(successfulOrderPrice)
    printOptionResult(failedOrderPrice)
  }

  def printOptionResult(option: Option[Double]) = {
    if (option != None) {
      println("Order price: " + option.get)
    } else {
      println("Order failed")
    }
  }
}
