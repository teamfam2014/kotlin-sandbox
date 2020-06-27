fun main(args: Array<String>) {
    var sum = 0
    var min = 100
    var max = 100000
    for (index in min..max){
        sum += index
    }
    println("The sum of all numbers from $min to $max is $sum")
}