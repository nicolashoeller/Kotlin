fun main() {
    val myArray: String = "Hello World"
    for (buchstabe in myArray) {
        print(buchstabe)
    }
    print("\n\n")
    for (index in myArray.indices) {
        print(index)
        print(", ")
    }
}