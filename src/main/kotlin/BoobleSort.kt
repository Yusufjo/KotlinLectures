fun main(args: Array<String>) {
    val array = intArrayOf(64, 34, 25, 12, 22, 11, 90)
bubbleSort(array)
    println("${array.joinToString()}")
}

fun bubbleSort(array: IntArray) {
    val n=array.size
    for (i in 0..n - 1) {
        for (j in 0..n-i-2) {
            var key=array[j]
            if (array[j]>array[j+1]){
                array[j]=array[j+1]
                array[j+1]=key
            }

        }
    }
}