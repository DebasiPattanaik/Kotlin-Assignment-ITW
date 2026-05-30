abstract class Animal
{
    abstract fun makeSound()
}
class Cat: Animal()
{
    override fun makeSound()
    {
        println("Meow")
    }
}
fun main()
{
    val myCat: Animal = Cat()
    myCat.makeSound()
}
