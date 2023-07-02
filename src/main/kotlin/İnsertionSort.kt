fun insertionSort(a:IntArray) {

    for (i in 1..a.size-1){
        val key=a[i]
        var j=i-1
        while (j>=0 && a[j]>key){
            a[j+1]=a[j]
            j--
        }
        a[j+1]=key
    }

}
fun main(args: Array<String>) {
    var a= intArrayOf(20,40,10,50,30)
    insertionSort(a)
    println("${a.contentToString()}")

}