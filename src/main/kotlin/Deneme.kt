fun main(args: Array<String>) {
    val liste = mutableListOf(1, 23, 4, 5,4,8,82,16,5489,58,53,754,123,56,)
    var degiskenDeger = liste[0]
    for (kontrol in liste) {
        if (kontrol < 3) {
            degiskenDeger = kontrol
        }
    }
    println(degiskenDeger)
    val index = liste.indexOf(754)
    println("Index of 754: $index")
    println(liste.indexOf(754))
}