open class Employee(val baseSalary:Int)
{
    fun details()
    {
        println("Manager with base salary: $baseSalary")
    }
}
class Manager():Employee(80000)
{
    fun manageDetails()
    {
        details()
    }
}
fun main()
{
    val manager = Manager()
    manager.manageDetails()
}
