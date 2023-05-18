fun main(args: Array<String>) {
//    val sayi = ArrayList<String>()
//    val sayi1 = arrayListOf(1, 2, 3, 4, 5, 6, 7)
//    val sayi2 = listOf(1, 2, 3, 4, 5)
//    val sayi3 = arrayOf(1,2,34,5)
//        sayi.add("0")
//    sayi.add("1")
//    sayi.add("2")
//    sayi.add("3")
//    sayi.add("4")
//    sayi.add("5")
//    sayi.add("6")
//    sayi.add("7")
//    sayi.add("8")
//    sayi.add("9")
    print("2 basamaklı bir sayı giriniz:")
    val tahmin = "81"
    val randomNum =18
    val random=randomNum.toString()

    println("Kazanan rakam:" + random)

    if (tahmin != random) {
        if (tahmin[0] == random[0])
            println("1.000₺ kazandınız!")
        else if (tahmin[0] == random[1])
            println("1.000₺ kazandınız!")
        else if (tahmin[1] == random[0])
            println("1.000₺ kazandınız!")
        else if (tahmin[1] == random[1])
            println("1.000₺ kazandınız!")
        else if (tahmin[0] == random[1] && tahmin[1] == random[0])
            println("3.000₺ kazandınız!")//|| ya da
    }


    if (tahmin[0] != random[1] && tahmin[1] != random[0] && tahmin[0] != random[0] && tahmin[1] != random[1])
        println("Kazanamadınız.")

    if (tahmin == random)
        println("10.000₺ kazandınız.")

}