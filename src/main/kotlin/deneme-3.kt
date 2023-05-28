fun main(args: Array<String>) {
    val liste = mutableListOf(4, 5, 12, 98, 16)
    var min = liste[0]
    var max = liste[0]


    for (number in liste)
    {
        if (number < min) {
            min=number
        }
            if (number > max)
            {max=number
        }

    }
    println("en küçük sayı $min")
    println("en büyük sayı $max")
}