fun main(args:Array<String>){

    var age:Int =23

    var weight:Double=23.4

    println("age : ${age}")
    println("weight: ${weight}")


    var integerNUmber:Number=23
    var total:Int=144

    println(integerNUmber)
    println(total)

    //numbers
    var ten:Int = 10
    var hundred:Int= 100
    var thousand:Int=100

    var ten_thousand:Int = 10_000
    var hundred_thousand:Int= 100_000
    var million:Int=1_000_000

    println(ten)
    println(hundred)
    println(thousand)
    println(ten_thousand)
    println(hundred_thousand)
    println(million)

    //characters
    var myChar:Char='a';
    println("The value of myChar is ${myChar}")
    // converting a character to int

    println("The value of myChar in int is ${myChar.toInt()}")

    //booleans
    var trueState:Boolean=true
    var falseState:Boolean=false

    println("Value of trueState is ${trueState}")
    println("Value of falseState is ${falseState}")

    //string
    var message:String ="Good morning"
    println("Good morning")

    //escape sequences
    var message2:String="Good morning\nHow are you?\nHave a \t wonderful day"
    println(message2)

    /// tripple quotes
    var message3:String=""" Good morning 
        |
        |
        |
        |\n How are you doing? \n""".trimMargin()
    println(message3)

    //string template expressions
    var a:Int =10
    var b:String="Hello world"
    println("The value of a is ${a}")

    println("The length of b is ${b.length} ")
}