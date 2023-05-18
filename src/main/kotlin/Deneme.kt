fun main(args: Array<String>) {
        val questions = listOf(
            "Başkentin adı nedir?",
            "Dünyanın en uzun nehri hangisidir?",
            "Python programlama dilinin yaratıcısı kimdir?"
        )

        val answers = listOf(
            "ankara",
            "nil",
            "yarağım"
        )

        var index = 0
        var chance = 2

        while (index < questions.size) {
            print("${questions[index]}: ")
            val userInput = readLine()

            if (userInput == answers[index]) {
                println("Doğru cevap!")
                index++
                chance = 2 // Yanıt doğruysa şansı sıfırla
            } else {
                if (chance > 0) {
                    println("Yanlış cevap! Bir şansınız daha var.")
                    chance--
                } else {
                    println("Yanlış cevap! Diğer soruya geçiliyor.")
                    index++
                    chance = 2 // Soruya geçtiğinde şansı sıfırla
                }
            }
        }

        println("Tebrikler, tüm soruları doğru cevapladınız!")
}