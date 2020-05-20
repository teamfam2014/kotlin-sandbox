fun main(args: Array<String>) {
    //list expression
    println("listOfNumbers=" + listOf(1,2,3,4))
    //null references require question marks on the type
    var str : String? = null
    println("str=" + str)
    //print out the length of the string on null value
    println("str length is " + str?.length)
    str = "Some String value"
    //print out the length of the string on a populated value
    println("str length is " + str.length)
}