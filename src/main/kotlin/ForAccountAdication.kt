fun main(args: Array<String>) {

    for (i in 1..Int.MAX_VALUE) {
        print("Hizmet bedeliniz yazınız:")
        val HizmetBedeli = readln().lowercase()
        if (HizmetBedeli == "q") {
            print("Program Sonlandırılıyor.")
            break
        } else {
            val BahsisBedeli = HizmetBedeli.toDouble() * 0.15
            val Toplam = HizmetBedeli.toDouble() + BahsisBedeli
            println("Hizmet Bedeli:$HizmetBedeli\nBahşiş Bedeli:$BahsisBedeli\nToplam Maliyet:$Toplam")

        }
        val DevamOption=""
        do {
            println("Başka işlem yapmak ister misiniz?(y/n)")
            val DevamOption = readln().lowercase()}
         while (DevamOption != "y" && DevamOption != "n")
            if (DevamOption == "n") {
                println("Program Sonlandırılıyor...")
                break
            } else if (DevamOption == "y") {
            } else {
                println("Sadece y ya da n ile işlem sağlayabilirsiniz.")
            }
        }

    }
