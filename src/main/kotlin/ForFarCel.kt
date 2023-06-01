
fun main(args: Array<String>) {
    //fahrenheit = (9 / 5) * celsius + 32

    for (i in 1..Int.MAX_VALUE){
    print("Celcius miktarını yazınız:")
    val Celcius= readln().lowercase()

    if (Celcius == "q") {
        println("Program sonlandırılıyor...")
        break
    }
        val Fahrenheit=(9.0 / 5) * Celcius.toDouble() + 32
        println(Fahrenheit)
    }
}