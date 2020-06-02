import java.util.Random

fun main(args: Array<String>) {
    //random number generator
    var seed: Int = 50
    var rand: Int = Random().nextInt(seed) + 1

    var expression = when(rand){
        in 1..10 -> "The random number is " + rand + " and is between 1-10"
        in 11..20 -> "The random number is " + rand + " and is between 11-20"
        in 21..30 -> "The random number is " + rand + " and is between 21-30"
        in 31..40 -> "The random number is " + rand + " and is between 31-40"
        else -> "The number, " + rand + " is not in range for this search."
    }

    println(expression)
}