fun main(args: Array<String>) {

    print("Çemberin yarı çapı kaçtır?:")
    var r= readLine()!!.toInt()
    var c=2*Math.PI*r
    print("Çemberin çevresi: $c")
    var d=3.14*(r*r)
    print("Çemberin alanı: $d")
}