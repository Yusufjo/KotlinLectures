
fun listeduzenleme(list:IntArray){
for (i in 1..list.size-1){
    val key=list[i]
    var j=i-1
    while (j>=0&& list[j]>key){
        list[j+1]=list[j]
        j--
    }
    list[j+1]=key
}

}
fun main(args: Array<String>) {
    var liste=  intArrayOf(10,50,1,5,78,20,36)
    listeduzenleme(liste)
    println("${liste.contentToString()}")
}