package com.example.kotlinbasics

// 5 basics concepts
// variables and types
//        control flow
//        functions
//        collections
//        class and objects
//
class MobilePhone(osName : String, brand :String, model : String  )
{
   private var battery = 34
 init {
   print("the OS Name is : $osName \n the brand name is : $brand \n the model name is : $model \nthe battery  is : $battery \n")
 }
    fun BatteryLife(chargein: Int)
    {
        println("battery before is: $battery Ater charging is now\t${battery+chargein}")
        battery+=chargein
    }
}

fun main()
{
var opp12 = MobilePhone("Android","Oppo","realme 5")
 var iphone = MobilePhone("Mac","Iphone","Iphone 11")
    iphone.BatteryLife(23)

}