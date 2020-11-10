package NBD2.Exercise5

trait Employee extends Person {
  override val tax: Float = 0.8f
  private var _salary = 0f
  def salary: Float = _salary
  def salary_= (newSalary : Float) = _salary = newSalary * tax

}
