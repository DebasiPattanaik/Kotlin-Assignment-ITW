class Window {
    var width = 0
    var height = 0
}
fun main() 
{
    val myWindow = Window().apply {
        width = 1920
        height = 1080
    }
    println("Window width: ${myWindow.width}")
    println("Window height: ${myWindow.height}")
}
