package com.example.kotlinbasics

abstract  class mamal(val Name: String, val weight: Double, val origin: String)
{
    abstract var maxspeed: Double

    abstract fun run()
    abstract fun breath()

    fun display(){
        println(" the name of the mamal is : $Name\n The weight is: $weight\n the origin is: $origin\nmaxspeed is: $maxspeed")
    }

}
class Human(Name: String, weight: Double, origin: String, override var maxspeed: Double,
):mamal(Name,weight,origin)
{
    override fun run() {
        println("can run on two legs")
    }

   override fun breath() {
        println("take breath through mouth!")
    }

}
fun main()
{
    var h1 = Human("taha",56.7,"aadaam",67.6)
    h1.run()
    h1.breath()
}