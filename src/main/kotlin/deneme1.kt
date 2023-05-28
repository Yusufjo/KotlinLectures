fun main(args: Array<String>) {
    val list = mutableListOf("naber", "bilmem senden", "hesapla", "10 harf")
    for (sayi in list) {
        if (sayi.contains("hesa"))
            print("${sayi.substring(0, sayi.length - 1)}2 sayısında hesapla vardır.")
    }
    val yenilist = listOf(1, 2, 3, 5)
    var toplamasyi = 0
    for (sayi in yenilist)
        toplamasyi += sayi
    println(toplamasyi)
}