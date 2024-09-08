object BankAccountManager {

  case class Account(accountId: String, balance: Double)

  object Bank {
    // List of accounts
    private var accounts: List[Account] = List()

    // Function to add accounts to the bank
    def addAccount(account: Account): Unit = {
      accounts = account :: accounts
    }

    // 4.1 List of Accounts with negative balances
    def listNegativeBalances: List[Account] = {
      accounts.filter(_.balance < 0)
    }

    // 4.2 Calculate the sum of all account balances
    def sumOfBalances: Double = {
      accounts.map(_.balance).sum
    }

    // 4.3 Calculate final balances after applying interest
    def applyInterest(): List[Account] = {
      accounts.map { account =>
        val updatedBalance = if (account.balance > 0) {
          account.balance * 1.05  // Apply 5% deposit interest
        } else {
          account.balance * 0.90  // Apply 10% overdraft interest
        }
        account.copy(balance = updatedBalance)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    // Adding sample accounts
    Bank.addAccount(Account("A001", 500.0))
    Bank.addAccount(Account("A002", -150.0))
    Bank.addAccount(Account("A003", 200.0))
    Bank.addAccount(Account("A004", -75.0))

    // List accounts with negative balances
    println("Accounts with negative balances:")
    Bank.listNegativeBalances.foreach(println)

    // Calculate the sum of all account balances
    println(s"\nSum of all account balances: ${Bank.sumOfBalances}")

    // Calculate final balances after applying interest
    println("\nFinal balances after applying interest:")
    Bank.applyInterest().foreach(println)
  }
}




