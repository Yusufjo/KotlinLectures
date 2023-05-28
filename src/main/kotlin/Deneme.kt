fun main(args: Array<String>) {
    //arraylist - listOf - mutablelistOf -
   var MuList= mutableListOf(1,2,3,4)
    println(MuList)
    MuList[1]=10
    println(MuList)
    MuList.add(2,16)
    println(MuList)
    var listof= mutableListOf("foto-1.mp3","fjhks.mp3","ya.mp3","müzik-2","müzik-1","mat-1","mat-2")
 var listof2= mutableListOf("resim-2","mat-1")
    var randomBirisi=listof.random()
    if (randomBirisi.substring(randomBirisi.length-4)!=".mp3")
    println(randomBirisi)
 val isim="kralsonkol"
 println(isim.substring(isim.length-5,7))

val input= "müzik-2,ya.mp3"
 val ayir=input.split(",")
if (!listof.contains(input.substring(0,3))&&input.endsWith("2"))
 println("1 ini almadığınız dersin 2. sini alamazsınız.")
 else
  println("Başarıyla eklendi")
}