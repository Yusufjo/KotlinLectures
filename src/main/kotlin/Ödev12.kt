fun main(args: Array<String>) {
    print("Lütfen paket ağırlığını giriniz:")
    val agirlik = readln().toDouble()


    if (agirlik <= 1)
        println("Ücret:3.5₺")
    else if (agirlik > 1 && agirlik <= 3)
        println("Ücret:5.5₺")
    else if (agirlik > 3 && agirlik <= 10)
        println("Ücret:8.5₺")
    else if (agirlik > 10 && agirlik <= 20)
        println("Ücret:10.5₺")
    else
        println("Paket Taşınamaz")
}