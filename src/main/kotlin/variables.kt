fun main(args: Array<String>) {
    var testVar = "testMe"
    println("testVar=" + testVar)
    val testVal = "testMe2"
    println("testVal=" + testVal)
    //testing out primitives
    //boolean
    val testBoolean = 3 < 4
    println("testBoolean=" + testBoolean)
    //byte
    val bigByte : Byte = 127
    println("bigByte=" + bigByte)
    //Float
    val myFloat : Float = 3.542422F
    println("myFloat=" + myFloat)
    var myDouble : Double = myFloat.toDouble()
    println("myDouble=" + myDouble)
}