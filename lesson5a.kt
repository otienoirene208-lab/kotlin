// kotlin inheritance

class Person {
    // attribute /characteristic/features of person

    val name ="samantha"
    val age =31
    val height=1.89

    //  actionable /functions/behaviours
    fun walk(){
        println("the person can walk")
    }
    fun eat(){
        println("the person can eat")
    }
}
fun main(){
    // we shall create an object from the class person to be able to access both the features and the characteristic of the person


    var myObject =Person()

    // bellow we access the properties
    println("The name of the person is:"+ myObject.name)

    myObject.walk()
}