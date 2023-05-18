fun main(args: Array<String>) {

    print("Boyunuz nedir?:")
    val boy = readln()
    if (boy.length<4){
        println("Yazdığınız sayı metre cinsindendir.")
    }


    var boyNumber = -1.1
    if (boy.contains('.')) {
        boyNumber = boy.toDouble()
    } else {
        boyNumber = boy.toDouble() / 100
    }
    print("Kilonuz nedir?:")
    val kilo = readln().toDouble()
    val sonuc = kilo / (boyNumber * boyNumber)
    println("Vücut kitle endeksiniz:$sonuc")
    if (sonuc < 18.5)
        println("Underweight")
    if (sonuc >= 18.5 && sonuc < 25.0)
        println("Normal")
    if (sonuc >= 25 && sonuc < 30)
        println("Overweight")
    if (sonuc >= 30)
        println("Obese")
}