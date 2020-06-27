fun main(args: Array<String>) {
    //list of book titles
    val bookTitles = arrayListOf("How to Code", "Star Trek Destiny", "Warcraft Rise of Ancients", "The Balloon Tree", "Berenstein Bears Messy Room", "Nth")

    for(bookTitle in bookTitles){
        for(titleChar in bookTitle){
            if (titleChar == 'e'){
                println(bookTitle)
                break;
            }
        }
    }
}