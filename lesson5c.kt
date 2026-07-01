// inheritance:this is the aspect whereby you find the child class obtaining the properties or behaviours of the parent class.

  open class Animal{
    // properties
    val name ="name"

    // behaviours/functions
    fun walk(){
        println("The animal can walk.")
    }

    fun sleep(){
        println("The animal can be able to sleep.")
    }
}

class Dog : Animal(){
    fun bark(){
        println("The dog can bark...!")
    }
}

fun main(){
    // below is an object of the class dog
    var myDog=Dog()

    myDog.bark()
    myDog.sleep()
    myDog.walk()
}