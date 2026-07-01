open class House{
    // properties
    val name ="name"

    // behaviours/function
    fun doors(){
        println("The house should have four doors")
    }

    fun sink(){
        println("The house must have a sink")
    }
}

class Brick :House(){
    fun color(){
        println("apply a pink color....")
    }
}

fun main(){
    var myHouse =House()

    myHouse.doors()
}