// Created by Toni Zaneti

fun main(args: Array<String>) {
    var num1: Double
    var num2: Double

    print("Enter number 1: ")
    num1 = readLine()!!.toDouble()
    print("Enter number 2: ")
    num2 = readLine()!!.toDouble()

    print ("What you need? (+, -, *, /)")
    val op:String = readLine()!!
    var result=0.0

    //println("$num1 $num2 $op")
    when(op)
    {
        "+"  -> result = num1 + num2
        "-"  -> result = num1 - num2
        "*"  -> result = num1 * num2
        "-"  -> result = num1 / num2

    }
    println( "$num1 $op $num2  = $result")


}
