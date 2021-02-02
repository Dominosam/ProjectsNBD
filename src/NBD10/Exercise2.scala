package NBD10

import scala.Char.char2double

trait Maybe[+A]{
  def applyFunction[R](changedTypeFunction: A => R): Maybe[R]
  def getOrElse[R >: A](defaultValue: => R) : R
  def map[R](mapFunction: A => R): Maybe[R]
  def flatMap[R](flatMapFunction: A=> Maybe[R]): Maybe[R]

}
case class Yes[A](value: A)extends Maybe[A] {
  override def applyFunction[R](changedTypeFunction: A => R): Maybe[R] = Yes(changedTypeFunction(value))

  override def getOrElse[R >: A](defaultValue: => R): R = value

  override def map[R](mapFunction: A => R): Maybe[R] = Yes(mapFunction(value))

  override def flatMap[R](flatMapFunction: A => Maybe[R]): Maybe[R] = flatMapFunction(value)
}
case class No() extends Maybe[Nothing] {
  override def applyFunction[R](changedTypeFunction: Nothing => R): Maybe[R] = No()
  override def getOrElse[R >: Nothing](defaultValue: => R): R = defaultValue

  override def map[R](mapFunction: Nothing => R): Maybe[R] = No()

  override def flatMap[R](flatMapFunction: Nothing => Maybe[R]): Maybe[R] = No()
}

object Exercise2 {
  def main(args: Array[String]): Unit = {
    val yes = Yes('X')
    val no = No()

    println(yes.map(getCharASCICode))
    println(no.map(getCharASCICode))
    println(yes.flatMap(getCharASCICodeMaybe))
    println(no.flatMap(getCharASCICodeMaybe))
  }

  def getCharASCICode(char: Char): Int ={
    char.toInt
  }

  def getCharASCICodeMaybe(char: Char): Maybe[Int] ={
    if(char != " ".charAt(0))
    {
      Yes(char)
    }else{
      No()
    }
  }
}
