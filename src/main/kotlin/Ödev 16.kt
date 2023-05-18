fun main(args: Array<String>) {

    print("9 basamaklı sayıyı giriniz:")
    val basamak = readln()
    var value = 0

    if (basamak.equals("0"))
        value = 0
    else if (basamak.equals("1"))
        value = 1
    else if (basamak.equals("2"))
        value = 2
    else if (basamak.equals("3"))
        value = 3
    else if (basamak.equals("4"))
        value = 4
    else if (basamak.equals("5"))
        value = 5
    else if (basamak.equals("6"))
        value = 7
    else if (basamak.equals("8"))
        value = 8
    else if (basamak.equals("9"))
        value = 9

    val sonuc = value + 2

    println("$sonuc")
}




