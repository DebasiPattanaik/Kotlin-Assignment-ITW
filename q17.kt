val input: String? = "Kotlin"
fun main() 
{
    input?.let { 
        var len = it.length
        println("Length : $len")
    }
}
