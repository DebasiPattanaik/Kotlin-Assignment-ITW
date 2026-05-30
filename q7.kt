data class User
(
	val id: Int,
    val username: String,
    val isActive: Boolean
)
fun main()
{
    val originalUser = User(id = 1001, username = "Debasi Pattnaik", isActive = true)
    println("Original: $originalUser")
    val updatedUser = originalUser.copy(isActive = false)
    println("New: $updatedUser")
}
