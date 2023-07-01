fun main(args: Array<String>) {
    val n = 6 // Piramidin yüksekliği

    for (i in 1..n) {
        // Boşlukları ekle
        for (j in 1..(n - i)) {
            print(" ")
        }

        // Yıldızları ekle
        for (j in 1..(2 * i - 1)) {
            print("*")
        }

        println() // Bir sonraki satıra geç
    }
}
