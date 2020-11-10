package NBD2.Exercise2

object Main {
  def main(args: Array[String]) {
    val myBankAccount = new BankAccount()
    val definatelyNotMyBankAccount = new BankAccount(123)

    println("My account balance: " + myBankAccount.accountBalance)
    println("Definately not mine account balance: " + definatelyNotMyBankAccount.accountBalance)
  }
}
