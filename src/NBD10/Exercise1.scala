package NBD10

object Exercise1 {

  def lazyPair: Iterator[(Int, Int)] = for {a <- Iterator.from(1)
                                            b <- 1 to a
                                            if a % b == 0
                                            }yield (a, b)

  def main(args: Array[String]): Unit = {

    val lazyPairBuffered = lazyPair.buffered

    for(i <- 1 to 20){
      println(lazyPairBuffered.next())
    }


    lazyPairBuffered take 20 foreach println
  }
}
