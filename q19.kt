import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.launch
fun main() = runBlocking { 
    launch { 
            println("Background task finished")
    }
    println("Completing background task.....")
}
