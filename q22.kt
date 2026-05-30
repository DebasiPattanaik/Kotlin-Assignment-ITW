sealed class ScreenState
{
    object Loading:ScreenState()
    data class Success
    (
        val data: String
    ):ScreenState()
    data class Error(val errorMsg: String) : ScreenState()
}
fun main()
{
    val screenState:ScreenState = ScreenState.Success("Data Loading Successful")
    when(screenState)
    {
        is ScreenState.Loading -> println("Loading...")
        is ScreenState.Success -> println(screenState.data)
        is ScreenState.Error -> println("Error: ${screenState.errorMsg}")
    }
}
