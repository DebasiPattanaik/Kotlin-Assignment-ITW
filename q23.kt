import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.async
import kotlin.system.measureTimeMillis
suspend fun fetchUserData(): String {
    delay(1000L)
    return "Alice"
}
suspend fun fetchAppConfig(): String {
    delay(2000L)
    return "Dark Mode"
}
fun main() = runBlocking {
    val time = measureTimeMillis {
        val userWaiting = async { 
            fetchUserData() }
        val configWaiting = async { 
            fetchAppConfig() }
        val user = userWaiting.await()
        val config = configWaiting.await()
        println("User: $user")
        println("Config: $config")
    }
    println("Total execution time: $time ms")
}
