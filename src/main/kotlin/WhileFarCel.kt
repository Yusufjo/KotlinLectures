fun main(args: Array<String>) {
    //fahrenheit = (9 / 5) * celsius + 32
    var deger = 0
    while (deger < 1) {
        print("Celcius değerini giriniz:")
        val Celcius = readln().lowercase()
        if (Celcius == "q") {
            print("Program sonlandırılıyor..")
            break
        }
        val number = Celcius.toInt()
        val fahrenheit = 9.0 / 5 * number + 32
        println(fahrenheit)
    }
}