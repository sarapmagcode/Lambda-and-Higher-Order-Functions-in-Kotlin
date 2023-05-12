
fun main() {
//    (Int) -> Int is called a 'function type'
//    which is similar to the data type when
//    creating normal variables:
//    val triple: (Int) -> Int = { a: Int -> a * 3 }

//    We can use the 'it' special identifier
//    if the parameter is only one.
    val triple: (Int) -> Int = { it * 3 }
    println(triple(5))

    // Higher-order functions:
    val peopleNames = listOf("Fred", "Ann", "Barbara", "Joe")
    println(peopleNames.sorted())

    // < 0, if str1 is shorter than str2
    // = 0, if str1 and str2 have the same length
    // > 0, if str1 is longer than str2
    println(peopleNames.sortedWith { str1: String, str2: String -> str1.length - str2.length })
}
