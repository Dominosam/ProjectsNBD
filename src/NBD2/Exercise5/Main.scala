package NBD2.Exercise5

object Main {
  def main(args: Array[String]): Unit = {

    val johnTravolta = new Person(name = "John", surname = "Travolta") with Student
    val johnnyDepp = new Person(name = "Johnny", surname = "Depp") with Employee{salary = 1000}
    val johnLennon = new Person(name = "John", surname = "Lennon") with Teacher {salary = 2000}

    println(johnTravolta.name + " " + johnTravolta.surname + ", tax: " +johnTravolta.tax)
    println(johnnyDepp.name + " " + johnnyDepp.surname + ", salary: "+ johnnyDepp.salary + ", tax: " +johnnyDepp.tax)
    println(johnLennon.name + " " + johnLennon.surname + ", salary:  "+ johnLennon.salary + ", tax: " +johnLennon.tax)
  }

}
