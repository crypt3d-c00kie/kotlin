
//some basic math operations
fun myMath()
{
    val nNumber = 25_00 // val because im not really changing it again
    print("Twenty Five hundred adds with 30 : ")
    println(nNumber.plus(30))

    print("Twenty Five hundred subtracted by 30 : ")
    println(nNumber.minus(30))

    print("Twenty Five hundred multiplied by 2 : ")
    println(nNumber.times(2))

    print("Twenty Five hundred divided by 2 : ")
    println(nNumber.div(2))
}

//driver code starts here
fun main()
{
    println()

    var szSentence = "hello this is kotlin speaking."
    println(szSentence)

    szSentence = "Modified the string again, started learning this today lol."
    println(szSentence)
    print("\n")

    println("Looking at what i learnt today")
    println("-----------------------------------------------")

    //some math operations and called them by a function called math_operation
    myMath()
}