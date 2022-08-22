fun main() {
    // Arithmetic operators
    val a = 10
    val b = 5
    val c = ((a + b) * (a - b))
    println("$c = (($a + $b) * ($a - $b))")

    val c1 = a - b
    println("$c1 = $a - $b")


    // Comparisons operators
    val num1 = 10
    val num2 = 3

    val answer = num1 != num2
    println(answer)
//Greater than Operator
    if (num1 > num2) {
        println("$num1 is greater than $num2")
    }
    //Less than and Equal to Operator
    if (num2 <= 3) {
        println("$num2 is equal to 3")
    }

    // Assignment operators
    var d = 2
    d += 5
    println(d)

    var e = 21
    e %= 5
    println("e %= 5 is equal to $e")


    // Increment/Decrement operators
    var i = 10
    println (i++)
    println(i)

    var j = 20
    println (j--)
    println(j)


}