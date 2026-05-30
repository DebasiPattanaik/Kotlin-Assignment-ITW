class BankAccount(private var balance:Double = 10000.0)
{
    fun deposit(amount:Double)
    {
        balance=balance+amount
        println("Current Balance = $balance")
    }
}
fun main()
{
    var amount=5000.0
    val account = BankAccount()
    account.deposit(amount)
}
