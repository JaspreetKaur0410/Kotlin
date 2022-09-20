package com.example.kotlinbasics


/* *************************************** ARRAYS, LISTS /* *******************************************/* */

fun main() {
//    //val numbers:IntArray= intArrayOf(1,2,3,4,5,6)
//    val numbers = intArrayOf(1, 2, 3, 4, 5, 6)
//    print(numbers.contentToString())
//    println()
//
//    //Traverse through array
//    for(ele in numbers) {
//        println(ele)
//    }
//    println()
//    val fruits=arrayOf(Fruit("Apple",90.0))
//    print(fruits.contentToString())
//    println()
//    for(index in fruits.indices){
//        print("${fruits[index]} is in index $index")
//    }

    ////////////////////////////****************** LISTS **************************/
    val months= listOf("Jan","Feb","Mar")
    val anyTypes= listOf(1,2,3,true,"String")

    for(month in months)
        println(month)
    println()

    val addtionalMonths=months.toMutableList()
    val newMonths=arrayOf("April","May","June")
    addtionalMonths.addAll(newMonths)
    addtionalMonths.add("July")
    println(addtionalMonths)
    println()

    val days= mutableListOf<String>("Mon","Tue","Wed")
    days.add("Thu")
    print(days)



}
data class Fruit(val name:String,val price:Double)

/* *************************************** ARRAYS /* *******************************************/* */

/* *************************************** 'AS KEYWORD'(UNSAFE and SAFE CASTING) /* *******************************************/* */

//fun main() {
//    val obj1: Any = "I have a dream"
//    val str2: String = obj1 as String     //WORKS
//    println(str2)                        //WORKS
//
//    val obj2: Any = 1456
////    val str3: String = obj2 as String        // ERROR
////    println(str3)                            // ERROR - INTEGER CAN't be COnverted to String
//
//    // Explicit casting(Safe(nullable) casting) using "as?" keyword
//    val obj3:Any=144567
//    //val x: String? = y as? String
//    val str4:String? = obj3 as? String
//    println(str4)                              //PRINTS null
//}

/* *************************************** 'AS KEYWORD'(UNSAFE and Safe CASTING) /* *******************************************/* */





/* *************************************** ABSTARCT CLASS /* *******************************************/* */

/* An Abstract class cannot be instantiated */
/* You can inherit from Abstract class */
/* The members of Abstract class are not Abstract(until and
    unless not specified by using keyword "Abstract") */
/* A subclass of Abstract class must implement Abstract members of Abstract class */

//abstract class Mammal(private val name:String, private val origin:String,private val weight:Double){
//    abstract var maxSpeed:Double
//    abstract fun run()
//    abstract fun breath()
//    fun displayDetails(){
//        println("Name:${name}, Origin:${origin}, Weight:${weight}, MaxSpeed:${maxSpeed}")
//    }
//}
//
//class Human(name:String, origin: String, weight: Double, override var maxSpeed: Double):Mammal(name,origin,weight){
//    override fun breath() {
//        println("Human Breathe")
//    }
//
//    override fun run() {
//        println("Human Run")
//    }
//}
//
//class Elephant(name:String, origin: String, weight: Double, override var maxSpeed: Double):Mammal(name,origin,weight){
//    override fun breath() {
//        println("Elephant Braethe")
//    }
//
//    override fun run() {
//        println("Elephant Run")
//    }
//}
//
//
//fun main(){
//    val human=Human("Denis","USA",170.0,30.0)
//    val elephant=Elephant("HAathi","Inida",700.0,20.0)
//
//    human.run()
//    elephant.run()
//    println("")
//    human.breath()
//    elephant.breath()
//
//    //val mammal=Mammal("Gotcha","Russia",70.0,34.0) <- Abstract class can't be instantiated
//
//    /* ************************************** DIFFERENCE B/W ABSTRACT CLASS $ INTERFACE ******** */
//
//        // INTERFACE ->  can't hold state, can't have constructor,
//        //               have both concrete + abstract methods,
//        //               class can implement multiple interfaces,
//        //               no constructor, can't hold fields
//    // ABSTRACT CLASS -> can hold state, can have constructors
//    //                   have both concrete + abstract methods,
//    //                   class can't inherit multiple abstract classes,
//    //                   abstract classes can't be final(but methods and properties can be final)
//}



/* *************************************** ABSTRACT CLASS /* *******************************************/* */





///* ***************************************INTERFACE /* *******************************************/* */
//
///* Interface may or may not provide default implementation of functions */
/* Can't instantiate Interface */
///* If any class implements interface -
//    that class needs to implement the unimplemented function of interface */
///* An interface can inherit another interface */
//
//interface Drivable{
//    val maxSpeed:Double
//    fun drive():String
//    fun brake(){
//        println("The drivable is braking")
//    }
//}
//
//open class Car(override val maxSpeed: Double, val name:String, val brand:String):Drivable{
//    open var range:Double=0.0
//    fun extendRange(amount:Double){
//        if(amount>0)
//            range+=amount;
//    }
//    // override interface's unimplemented function
//    override fun drive():String="Driving the interface Drive"
//}
//
//class ElectricCar(override val maxSpeed: Double, name:String, brand:String, batteryLife:Double):Car(maxSpeed,name, brand){
//    override var range=batteryLife*6
//    override fun drive():String="In Electric Car Drive"
//    override fun brake() {
//        super.brake()
//    }
//
//}
//
//
//fun main(){
//    var myCar=Car(300.00,"X7","BMW")
//    var myEcar=ElectricCar(400.00,"S-Model","Tesla",85.0)
//
//    println(myCar.drive())
//    println(myEcar.drive())
//    myCar.brake()
//
//}
//
//
//
///* ***************************************INTERFACE /* *******************************************/* */














/* *************************************** INHERITANCE /* *******************************************/* */

//
//// Any class inherits from Any class. Any is the superclass of any class
//// ALL Classes in Kotlin are Final by default(so specify - open) to inherit
//
//open class Car(val name:String,val brand:String){
//    open var range:Double=0.0
//
//    fun extendRange(amount:Double){
//        if(amount>0)
//            range+=amount;
//    }
//
//    open fun drive(distance:Double){
//        println("Drove for ${distance} KM")
//    }
//}
//
//class ElectricCar(name:String, brand:String, batteryLife:Double):Car(name, brand){
//    override var range=batteryLife*6
//    override fun drive(distance: Double) {
//        println("Drove range $distance KM on electricity")
//    }
//    fun drive(){
//        println("Drove range is ${range}")
//    }
//}
//
//fun main(){
//    var myCar=Car("X7","BMW")
//    var myEcar=ElectricCar("S-Model","Tesla",85.0)
//
//    //PolyMorphism
//    myCar.drive(200.00)
//    myEcar.extendRange(300.00)
//    myEcar.drive(400.00) //Although Electric Car never implemented function drive()
//
//    myEcar.drive()
//}
/* *************************************** INHERITANCE /* *******************************************/* */