package com.example.kotlinbasics
//
//class person(var myFirstName:String, var myLastName: String,)
//{
//    var myAge : Int? = null
//    var myHobby : String? = null
//
//constructor( myFirstName:String, myLastName: String, myAge:Int):this(myFirstName,myFirstName)
//{
//   this.myAge = if (this.myAge>0)
//    {
//        myAge
//    }
//    else
//        throw IllegalArgumentException("age can't be less than 0")
//}
//
//    constructor( myFirstName:String, myLastName: String, myAge:Int,myHobby:String):this(myFirstName,myFirstName,myAge)
//    {
//        this.myHobby
//    }
//    init {
//        println("Person 1 data\n")
//        println("First Name: $myFirstName\t\t\t Last Name: $myLastName\t\t Age: $myAge\t\t Hobby: $myHobby\n")
//    }
//
//
//}
//fun main()
//{
//    val p1 = Person("Muhammad","Taha", 12, "reading books")
//
//
//}

class PerSon(var firstName: String, var lastName: String) {
    var age: Int? = null
    var hobby: String = "Watch Netflix"
    var myFirstName = firstName

    // Secondary Constructor
    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName)  {
        this.age = if(age > 0) age else throw IllegalArgumentException("Age must be greater than zero")
    }

    fun stateHobby(){
        println("$firstName \'s Hobby is: $hobby'" )
    }
}
fun main() {
// You can use primary or secondary Constructor to create an object

// Calls the primary constructor (Age will be null in this case)
    val person1 = PerSon("Denis", "Panjuta", 48)

// Calls the secondary constructor
    val person2 = PerSon("Elon", "Musk", 48)
    print("$person1")
}