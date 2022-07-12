package com.example.kotlinbasics

interface interface_v1 {
    val maxSpeed: Double
    fun Drive(): String
    fun Brack()
    fun BreakAble()
    {
        print("the Brakeable car")
    }

}
open class car(override val maxSpeed: Double,
open val brandName: String): interface_v1 {
    open var range: Double = 0.0

    open fun ExtendRange(amnt:Double)
    {
        if(amnt>0)
        {
            range+=amnt
        }
    }
    override fun Drive(): String {
        println("car has been droven for $range KM")
        return range.toString()

    }
    override fun Brack() {
        println(" this car is brackAble")
    }
}

class ElcTrcCar(override val maxSpeed: Double,
                override val brandName: String , batterylife:Double):car(maxSpeed, brandName)
{
    override var range = batterylife / 6
    override fun Drive() = "driven"
    fun Drive(Dist: Double) {
        print("the electric car has beeb $range driven")
    }
    override fun Brack()
    {
        print("brackable")
    }
}

fun main()
{
    var qwe1 = car(234.4,"Audi")
    qwe1.ExtendRange(45.7)
    qwe1.Drive()
    qwe1.Brack()
    var asd1 = ElcTrcCar(56.33,"TESLA",67.4)
    asd1.Drive()
    asd1.Brack()
}
