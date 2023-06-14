fun main(args: Array<String>) {
    val elements = listOf("A", "B", "C", "D") // Eleman listesi
    val selectedElement = elements.random() // Rastgele seçilen bir eleman

    var count = 0
    var selectedElementCount = 0

    while (count < elements.size) {
        if (selectedElementCount < 4) {
            println(selectedElement)
            selectedElementCount++
        } else {
            for (element in elements) {
                if (element != selectedElement) {
                    println(element)
                    count++
                }
            }
        }
    }
}









