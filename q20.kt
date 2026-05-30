import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.async
fun main() = runBlocking { 
    val wait = async {
        5 + 5
    }
    val result = wait.await()
    println(result)
}
