class Account(val id: Int, private var balance: Double) {

  // Deposit method
  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be positive")
    balance += amount
    println(s"Deposited $$${amount} to account $id. New balance: $$${balance}")
  }

  // Withdraw method
  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdraw amount must be positive")
    if (amount <= balance) {
      balance -= amount
      println(s"Withdrew $$${amount} from account $id. New balance: $$${balance}")
    } else {
      println(s"Insufficient balance in account $id. Withdrawal failed.")
    }
  }

  // Transfer method
  def transfer(amount: Double, toAccount: Account): Unit = {
    require(amount > 0, "Transfer amount must be positive")
    if (amount <= balance) {
      withdraw(amount)
      toAccount.deposit(amount)
      println(s"Transferred $$${amount} from account $id to account ${toAccount.id}")
    } else {
      println(s"Insufficient balance in account $id. Transfer failed.")
    }
  }

  // Display balance method
  def displayBalance(): Unit = {
    println(s"Account $id balance: $$${balance}")
  }
}

object AccountTest extends App {
  val acc1 = new Account(1, 1000.0)
  val acc2 = new Account(2, 500.0)

  acc1.deposit(200.0)       // Deposit $200 to acc1
  acc1.withdraw(150.0)      // Withdraw $150 from acc1
  acc1.transfer(300.0, acc2) // Transfer $300 from acc1 to acc2

  acc1.displayBalance()     // Display balance of acc1
  acc2.displayBalance()     // Display balance of acc2
}
