class Account(val id: Int, var balance: Double) {

  // Deposit money into the account
  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be positive")
    balance += amount
  }

  // Withdraw money from the account
  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdraw amount must be positive")
    if (amount <= balance) {
      balance -= amount
    } else {
      println("Insufficient balance")
    }
  }

  // Apply interest: 5% for positive balances, 10% overdraft for negative balances
  def applyInterest(): Unit = {
    if (balance > 0) {
      balance += balance * 0.05  // 5% interest
    } else if (balance < 0) {
      balance += balance * 0.10  // 10% overdraft interest
    }
  }

  override def toString: String = s"Account(id=$id, balance=$balance)"
}

// Define the Bank as a list of Accounts
class Bank(accounts: List[Account]) {

  // 4.1 List of Accounts with negative balances
  def accountsWithNegativeBalance(): List[Account] = {
    accounts.filter(_.balance < 0)
  }

  // 4.2 Calculate the sum of all account balances
  def totalBalance(): Double = {
    accounts.map(_.balance).sum
  }

  // 4.3 Calculate final balances after applying interest to each account
  def applyInterestToAll(): Unit = {
    accounts.foreach(_.applyInterest())
  }

  // Print details of all accounts
  def printAccounts(): Unit = {
    accounts.foreach(println)
  }
}

// Usage example
object BankApp extends App {
  // Create some accounts
  val acc1 = new Account(1, 1000.0)
  val acc2 = new Account(2, -500.0)
  val acc3 = new Account(3, 300.0)
  val acc4 = new Account(4, -200.0)

  // Create a bank with these accounts
  val bank = new Bank(List(acc1, acc2, acc3, acc4))

  // 4.1 List of accounts with negative balances
  val negativeAccounts = bank.accountsWithNegativeBalance()
  println("Accounts with negative balance:")
  negativeAccounts.foreach(println)

  // 4.2 Calculate the sum of all account balances
  val total = bank.totalBalance()
  println(s"Total balance of all accounts: $$total")

  // 4.3 Apply interest to all accounts
  bank.applyInterestToAll()
  println("Balances after applying interest:")
  bank.printAccounts()
}
