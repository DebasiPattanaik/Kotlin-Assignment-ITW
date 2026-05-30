class IDGenetrator
{
    companion object
    {
        var currentID=0
        fun getNextID()
        {
            currentID++
            println("Current ID: $currentID")
        }
    }
}
fun main()
{
    IDGenetrator.getNextID() // Current ID: 1
    IDGenetrator.getNextID() // Current ID: 2
    IDGenetrator.getNextID() // Current ID: 3
}
