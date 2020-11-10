package NBD2.Exercise3


object Main {
  def main(args: Array[String]) {
    val johnTravolta = new Person(name = "John", surname = "Travolta")
    val johnLennon = new Person(name = "John", surname = "Lennon")
    val johnKovalski = new Person(name = "John", surname = "Kovalski")

    println(johnTravolta.name + " " + johnTravolta.surname + ": " + greetPersonUsingSurname(johnTravolta));
    println(johnLennon.name + " " + johnLennon.surname + ": " + greetPersonUsingSurname(johnLennon));
    println(johnKovalski.name + " " + johnKovalski.surname + ": " + greetPersonUsingSurname(johnKovalski));
  }

  def greetPersonUsingSurname(person: Person ): String = person.surname match {
    case "Travolta" => "Look at that hair, it's Danny Zuko!"
    case "Lennon" => "Imagine there's no heaven...tututututu"
    case _ => "I don't know you, how are you " + person.surname
  }
}
