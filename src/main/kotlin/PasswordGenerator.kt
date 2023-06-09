fun main(args: Array<String>) {
    //Part 1: 8 haneli rastgele karakterlerden oluşan içinde 2 tane büyük harf,
// 2 tane sayı ve 4 tane de küçük harf bulunan bir şifre oluştur. Buradaki şifre deseni (pattern) şöyle olsun:
    //            bbnnsskkkk
    //                b: büyük harf
    //                s: sayı
    //                k: küçük harf

    val Bharf1 = listOf<String>(
        "Q",
        "W",
        "E",
        "R",
        "T",
        "Y",
        "U",
        "I",
        "O",
        "P",
        "Ğ",
        "Ü",
        "A",
        "S",
        "D",
        "F",
        "G",
        "H",
        "J",
        "K",
        "L",
        "Ş",
        "İ",
        "Z",
        "X",
        "C",
        "V",
        "B",
        "N",
        "M",
        "Ö",
        "Ç"
    ).random()
    val Bharf2 = listOf<String>(
        "Q",
        "W",
        "E",
        "R",
        "T",
        "Y",
        "U",
        "I",
        "O",
        "P",
        "Ğ",
        "Ü",
        "A",
        "S",
        "D",
        "F",
        "G",
        "H",
        "J",
        "K",
        "L",
        "Ş",
        "İ",
        "Z",
        "X",
        "C",
        "V",
        "B",
        "N",
        "M",
        "Ö",
        "Ç"
    ).random()
    val Kharf1 = listOf<String>(
        "w",
        "e",
        "r",
        "t",
        "y",
        "u",
        "ı",
        "o",
        "p",
        "ğ",
        "ü",
        "a",
        "s",
        "d",
        "f",
        "g",
        "h",
        "j",
        "k",
        "l",
        "ş",
        "i",
        "z",
        "x",
        "c",
        "v",
        "b",
        "n",
        "m",
        "ö",
        "ç"
    ).random()
    val Kharf2 = listOf<String>(
        "w",
        "e",
        "r",
        "t",
        "y",
        "u",
        "ı",
        "o",
        "p",
        "ğ",
        "ü",
        "a",
        "s",
        "d",
        "f",
        "g",
        "h",
        "j",
        "k",
        "l",
        "ş",
        "i",
        "z",
        "x",
        "c",
        "v",
        "b",
        "n",
        "m",
        "ö",
        "ç"
    ).random()
    val Kharf3 = listOf<String>(
        "w",
        "e",
        "r",
        "t",
        "y",
        "u",
        "ı",
        "o",
        "p",
        "ğ",
        "ü",
        "a",
        "s",
        "d",
        "f",
        "g",
        "h",
        "j",
        "k",
        "l",
        "ş",
        "i",
        "z",
        "x",
        "c",
        "v",
        "b",
        "n",
        "m",
        "ö",
        "ç"
    ).random()
    val Kharf4 = listOf<String>(
        "w",
        "e",
        "r",
        "t",
        "y",
        "u",
        "ı",
        "o",
        "p",
        "ğ",
        "ü",
        "a",
        "s",
        "d",
        "f",
        "g",
        "h",
        "j",
        "k",
        "l",
        "ş",
        "i",
        "z",
        "x",
        "c",
        "v",
        "b",
        "n",
        "m",
        "ö",
        "ç"
    ).random()
    val sayi1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0).random()
    val sayi2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0).random()
    val randomsifre = listOf(sayi1, sayi2, Kharf1, Kharf2, Kharf3, Kharf4, Bharf1, Bharf2).shuffled()
    val sifre=randomsifre.joinToString("")

    println("Random belirlenen güvenli şifre:   $sifre")
val upper="ABCDE"
    val lower="abcde"
    val i1=(0..upper.length-1).random()
    val i2=(0 until upper.length).random()
    val i3=(lower.indices).random()
    val i4=(lower.indices).random()
    val sifre132=""+upper[i1]+upper[i2]+lower[i3]+lower[i4]

}