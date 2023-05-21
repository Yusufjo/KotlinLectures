fun main(args: Array<String>) {
    val dosyalar = arrayListOf("müzikler", "filmler", "resimler")
    val muzikler = arrayListOf("müzik-1.mp3", "müzik-2.mp3", "müzik-3.mp3")
    val filmler = arrayListOf("film-1.mp4", "film-2.mp4", "film-3.mp4")
    val resimler = arrayListOf("foto-1.jpg", "foto-2.jpg", "foto-3.jpg")
    println("Hoşgeldiniz, lütfen ne yapmak istediğinizi belirtin;")
    println(
        "\n1- Var olan klasörleri göster" +
                "\n2- Herhangi bir klasörü aç" +
                "\n3- Yeni klasör ekle" +
                "\n4- Çıkış"
    )
    val input = readln()

    when (input) {
        "1" -> {
            print("Var olan klasörler:" + dosyalar.joinToString(","))
        }

        "2" -> {
            print("Hangi klasörü açmak istersiniz?:")
            val inputfile = readln().lowercase()

            if (inputfile == "müzikler") {
                print("<$inputfile> dosyası açıldı:")
                println(
                    "Ne yapmak istersiniz" +
                            "\n1- Dosya aç" +
                            "\n2- Dosya ekle" +
                            "\n3- Çıkış"
                )
                val inputmuzik = readln()
                when (inputmuzik) {
                    "1" -> {
                        print("Açmak istediğiniz dosyayı giriniz:")
                        val input2i1 = readln()
                        if (input2i1 == muzikler[0].substring(0, 7) || input2i1 == muzikler[0]) {
                            println(muzikler[0] + " Açıldı..")
                        } else if (input2i1 == muzikler[1].substring(0, 7) || input2i1 == muzikler[1]) {
                            println(muzikler[1] + " Açıldı..")
                        } else if (input2i1 == muzikler[2].substring(0, 7) || input2i1 == muzikler[2]) {
                            println(muzikler[2] + " Açıldı..")
                        } else print("Böyle bir dosya bulunmamaktadır.")
                    }

                    "2" -> {
                        print("Eklemek istediğiniz Dosyanın adını yazınız:")
                        val input2i2 = readln()
                        if (input2i2.contains(".mp3")){
                            muzikler.add(input2i2)
                        print("<$input2i2> eklendi..\nDosyalar:" + muzikler)
                        }
                        else {
                            muzikler.add(input2i2 + ".mp3")
                            print("<$input2i2.mp3> eklendi..\nDosyalar:" + muzikler)
                        }
                    }

                    "3" -> {
                        println("Program sonlandırılıyor..")
                    }

                }

            } else if (inputfile == "filmler") {
                print("<$inputfile> dosyası açıldı:")
                println(
                    "Ne yapmak istersiniz" +
                            "\n1- Dosya aç" +
                            "\n2- Dosya ekle" +
                            "\n3- Çıkış"
                )
                val inputfilmler = readln()
                when (inputfilmler) {
                    "1" -> {
                        print("Açmak istediğiniz dosyayı giriniz:")
                        val input2i2 = readln()
                        if (input2i2 == filmler[0].substring(0, 6) || input2i2 == filmler[0]) {
                            println(filmler[0] + " Açıldı..")
                        } else if (input2i2 == filmler[1].substring(0, 6) || input2i2 == filmler[1]) {
                            println(filmler[1] + " Açıldı..")
                        } else if (input2i2 == filmler[2].substring(0, 6) || input2i2 == filmler[2]) {
                            println(filmler[2] + " Açıldı..")
                        } else print("Böyle bir dosya bulunmamaktadır.")
                    }

                    "2" -> {
                        print("Eklemek istediğiniz Dosyanın adını yazınız:")
                        val input2i2 = readln()
                        if (input2i2.contains(".mp4"))
                        {
                            filmler.add(input2i2)
                            print("<$input2i2> eklendi..\nDosyalar:" + filmler)
                        }
                        else
                        {
                            muzikler.add(input2i2 + ".mp4")
                            print("<$input2i2.mp4> eklendi..\nDosyalar:" + filmler)
                        }

                    }

                    "3" -> {
                        println("Program sonlandırılıyor..")
                    }

                }
            } else if (inputfile == "resimler") {
                print("<$inputfile> dosyası açıldı:")
                println(
                    "Ne yapmak istersiniz" +
                            "\n1- Dosya aç" +
                            "\n2- Dosya ekle" +
                            "\n3- Çıkış"
                )
                val inputresimler = readln()
                when (inputresimler) {
                    "1" -> {
                        print("Açmak istediğiniz dosyayı giriniz:")
                        val input2i3 = readln()
                        if (input2i3 == resimler[0].substring(0, 6) || input2i3 == resimler[0]) {
                            println(resimler[0] + " Açıldı..")
                        } else if (input2i3 == resimler[1].substring(0, 6) || input2i3 == resimler[1]) {
                            println(resimler[1] + " Açıldı..")
                        } else if (input2i3 == resimler[2].substring(0, 6) || input2i3 == resimler[2]) {
                            println(resimler[2] + " Açıldı..")
                        } else print("Böyle bir dosya bulunmamaktadır.")
                    }

                    "2" -> {
                        print("Eklemek istediğiniz Dosyanın adını yazınız:")
                        val input2i2 = readln()
                        if (input2i2.contains(".jpg")){
                            resimler.add(input2i2)
                            println("<$input2i2> dosyası eklendi.\n" +
                                    "Dosyalar: $resimler")
                        }
                        else
                        { resimler.add(input2i2 + ".jpg")
                        print("<$input2i2.jpg> dosyası eklendi.\n"+
                                "Dosyalar:" + resimler) }

                    }

                    "3" -> {
                        println("Program sonlandırılıyor..")
                    }

                }
            }
            else print("Böyle bir Klasör bulunmamaktadır")
        }

        "3" -> {
            print("Eklemek istediğiniz dosya adını girin lütfen:")
            val inputdosya = readln().lowercase()
            dosyalar.add(inputdosya)
            println(
                "<$inputdosya> Klasörlere eklendi..\n" +
                        "var olan klasörler:" + dosyalar
            )

        }

        "4" -> {
            println("Program sonlandırılıyor..")
        }
    }
}



