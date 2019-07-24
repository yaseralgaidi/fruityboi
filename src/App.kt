fun main (args: Array<String>) {
    val fruit = arrayOf("apple", "banana", "cherry", "blueberry", "pomegrante")
    val index = arrayOf(1, 3, 4, 2)
    var x = 0
    var y: Int
    while (x < 4) {
        y = index[x]
        x = x + 1
        println("Fruit = ${fruit[y]}")
    }
}


