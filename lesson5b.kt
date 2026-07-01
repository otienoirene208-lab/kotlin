// below is an example by the use of the rectangle

class Rectangle{
    // properties/variables

    val length =30
    val width =18

    // function /behaviours/actionable
    fun area(){
        val area = length*width
        println("the area of the rectangle is :$area")
    }

    fun perimeter(){
        val perimeter= 2 *(length +width)
        println("the perimeter of the rectangle is:$perimeter")
    }
}

fun main(){
    // below is the object for the rectangle
    val myRectangle =Rectangle()

    // we access the area and the perimeter of the rectangle

myRectangle.area()
myRectangle.perimeter()
}