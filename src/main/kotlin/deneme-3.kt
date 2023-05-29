fun main(args: Array<String>) {
    val LessonBil = listOf(
        "mat-1",
        "mat-2",
        "fizik-1",
        "fizik-2",
        "digital design",
        "computer programming-1",
        "computer programming-2",
        "data structures",
        "algorithm analysis"
    )
    val YusufDersler = mutableListOf("mat-2", "fizik-1", "data structures")
    val YusufVerilenDersler = mutableListOf("mat-1", "digital design", "computer programming-1")
    val YusufunEkleyebilecegiDersler=LessonBil.subtract(YusufDersler).subtract(YusufVerilenDersler)
    println(YusufunEkleyebilecegiDersler)
    val input= readln().split(",")
    for (KontrolGirilenDersler in input)
    {for (kontrolVerilenDersler in YusufVerilenDersler) {
        if (KontrolGirilenDersler.endsWith("2") && !kontrolVerilenDersler.contains(KontrolGirilenDersler.substring(0, KontrolGirilenDersler.length - 1)))

            println("1'i tamamlamadığınız dersin 2. alamazsınız.")
        else println("Ders başarıyla eklendi")
    }

}}