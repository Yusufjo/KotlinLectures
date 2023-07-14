fun main(args: Array<String>) {
    print("lütfen bir sayı giriniz:")
    val input = readln().toInt()
    var num = 1
    val toplam = mutableListOf<Int>(input)
    for (i in 1..input) {
        num *= i
    }
    println(num)
    print("lütfen bir girdi giriniz:")
    val input2 = readln()
    var rezerved = ""
    for (i in input2.length-1 downTo 0) {
        rezerved += input2[i]
    }
    println(rezerved)
}
