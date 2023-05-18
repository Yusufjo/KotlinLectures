fun main(args: Array<String>) {
    val numbers = mutableListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    numbers.shuffle()

     // Basamakları karıştır
    val result = numbers.take(8) // İlk 8 basamağı birleştir
    println(result)
}