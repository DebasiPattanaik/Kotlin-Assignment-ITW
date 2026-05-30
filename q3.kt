open class vehicle
{
    open fun startEngine()
    {
        println("Engine Started")
    }
}
class motorcycle:vehicle()
{
    override fun startEngine()
    {
        println("Vroom!")
    }
}
fun main()
{
    val motor = motorcycle()
    motor.startEngine() 
}
