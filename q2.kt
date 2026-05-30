class Thermostat(temperature: Double) 
{ 
    var temp = temperature 
    private set
    fun update(newTemp: Double) 
    {
        temp = newTemp
    }
}
fun main()
{
    val thermostat = Thermostat(40.0)
    println("Initial temperature: ${thermostat.temp}")
    thermostat.update(45.0)
    println("Updated temperature: ${thermostat.temp}")
}
