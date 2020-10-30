object Exercise5 {
  def main(args: Array[String]) {
    // Before black friday
    val food = Map("Burger" -> 10.0, "RibEyeSteak" -> 20.0, "FrenchFries" -> 3.0, "Nuggets" -> 6.0, "FiletMignon" -> 40.0)
    println("Before black friday")
    printMap(food)

    // During black friday
    val blackFridayFood = food.map({case (a,b) => a -> b * 0.75})
    println("During black friday")
    printMap(blackFridayFood)
  }

  def printMap(map: Map[String, Double]): Unit ={
    map foreach (p => println (p._1 + "-->" + p._2))
    println()
  }

}
