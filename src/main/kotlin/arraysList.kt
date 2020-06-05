fun main(args: Array<String>) {
    var nACountries = arrayListOf("CA","US","MX")
    println("North American Countries are: " + nACountries)

    var sACountries = arrayListOf("BR","CO","PR","CH","VZ")
    println("South American Countries are: " + sACountries)

    //concatenate them
    var americanCountries = nACountries + sACountries;
    println("American Countries are: " + americanCountries)
}