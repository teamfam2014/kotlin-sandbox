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
}