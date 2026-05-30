import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
suspend fun launch() 
{
    println("Completing background task.....")
    delay(1000)
    println("Background task finished")
}
fun main()=runBlocking {
    launch()
}
