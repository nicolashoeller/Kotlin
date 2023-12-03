fun main() {
    var myArray = arrayOf(1,2,3,4)
    var mySecondArray = Array(4){i -> i}        //[0,1,2,3]
    println(mySecondArray[3])
    println(myArray[3])
    myArray[3] = 5
    println(myArray[3])
}