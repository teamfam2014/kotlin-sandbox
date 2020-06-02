fun main(args: Array<String>) {
    var grade : Int = 96
    var letterGrade : String = "F"
    if (grade >= 96){
        letterGrade = "A+"
    }else if (grade >= 80 && grade < 96){
        letterGrade = "A"
    }else if (grade >= 70 && grade < 80){
        letterGrade = "B"
    }else if (grade >= 60 && grade < 70){
        letterGrade = "C"
    }else if (grade >= 50 && grade < 60){
        letterGrade = "D"
    }

    println("You received the grade " + letterGrade)

    var letterGrdExpression = when(letterGrade){
        "A+" -> {
            "You are doing fantastic!\nYou deserve a medal!"
        }
        "A" -> "Excellent!"
        "B" -> "Very Good!"
        "C" -> "Satisfactory"
        "D" -> "Needs Improvement"
        else -> {
            "Significant Improvement required.\nGet your act together."
        }

    }
    println(letterGrdExpression)
}