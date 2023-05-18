fun main(args: Array<String>) {
    val L1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val L2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
    val L3 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    val sarkisecimiL1 = L1.random()
    val sarkisecimiL2 = L2.random()
    val sarkisecimil3 = L3.random()
    print("Çalma Listesini giriniz:")
    val giris = readln().uppercase()
    if (giris == "L1")
        println("$sarkisecimiL1.şarkı çalınıyor...")
    else if (giris == "L2")
        println("$sarkisecimiL2. şarkı çalınıyor...")
    else if (giris == "L3")
        println("$sarkisecimil3. şarkı çalınıyor...")
    else
        println("Böyle bir çalma listesi bulunmamaktadır.")
when(giris){
    "L1"-> {
        println("$sarkisecimiL1.şarkı çalınıyor...")
    }
    "L2"-> println("$sarkisecimiL2.şarkı çalınıyor...")
    else -> println("Böyle bir çalma listesi bulunmamaktadır.")
}

}