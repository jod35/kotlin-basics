import java.util.Arrays
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

    var messenger:String="Ssali JOnathan"

    println("${messenger} is the messenger")

//    /arrays
    var names: Array<String> = arrayOf("names","names","names")

    for (name in names){
        println(name)
    }

    var numbers: Array <Int> = arrayOf(1,2,3,4,5,6,7,8,9,1,0)

    for (number in numbers){
        println(number)
    }

    //primitive arrays
    var f :ByteArray= byteArrayOf(1,2,3)
    var g :ShortArray= shortArrayOf(1,2,3)
    var c :IntArray = intArrayOf(1,23,45,56)
    var d : DoubleArray = doubleArrayOf(1.2,3.4)
    var e :CharArray = charArrayOf('a','f','e')

    for (el in f){
        println(el)
    }

    //array of nulls
    var arrayOfNulls= arrayOfNulls<Int>(5)

    for (el in arrayOfNulls){
        println(el)
    }

    //how to create a function using a factory
    var squares= Array(5,{i: Int -> i *i  })

    for (el in squares){
        println(el)
    }

    var cubes =Array(10,{i:Int -> i * i * i})

    println("\n Ten cubes ")

    for (el in cubes){
        println(el)
    }

    //print an array
    var friends:Array<String> = arrayOf("Perez","Jemo","Bazil")

    for(name in friends){
        println("${name} is my friend")
    }

    var arr: Array<String> = arrayOf("we","we","we")

    println(Arrays.toString(arr))

    for (index in arr.indices){
        println(arr[index])
    }

}