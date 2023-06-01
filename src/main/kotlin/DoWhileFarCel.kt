//fahrenheit = (9 / 5) * celsius + 32
fun main(args: Array<String>) {
    do{
        print("Celcius miktarını yazınız:")
        val Celcius= readln()
        if (Celcius!="q"){

        val fahrenheit=9.0/5*Celcius.toDouble()+32
        println(fahrenheit)}
    }while (Celcius !="q")
    println("Program sonlandırılıyor...")
}