class Account(var balance: Double) {

  // Deposit money into the account
  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be positive")
    balance += amount
    println(s"Deposited $$amount. New balance: $$balance")
  }

  // Withdraw money from the account
  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdraw amount must be positive")
    if (amount <= balance) {
      balance -= amount
      println(s"Withdrew $$amount. New balance: $$balance")
    } else {
      println("Insufficient balance")
    }
  }

  // Transfer money from this account to another account
  def transfer(amount: Double, toAccount: Account): Unit = {
    require(amount > 0, "Transfer amount must be positive")
    if (amount <= balance) {
      this.withdraw(amount)
      toAccount.deposit(amount)
      println(s"Transferred $$amount to another account. Your new balance: $$balance")
    } else {
      println("Insufficient balance for transfer")
    }
  }

  // Display the current balance
  def displayBalance(): Unit = {
    println(s"Current balance: $$balance")
  }
}

// Usage example
object BankApp extends App {
  // Create two accounts
  val account1 = new Account(1000.0)
  val account2 = new Account(500.0)

  // Deposit money into account1
  account1.deposit(200.0)

  // Withdraw money from account1
  account1.withdraw(150.0)

  // Transfer money from account1 to account2
  account1.transfer(300.0, account2)

  // Display final balances
  account1.displayBalance()  // Output: Your balance: 750.0
  account2.displayBalance()  // Output: Your balance: 800.0
}
