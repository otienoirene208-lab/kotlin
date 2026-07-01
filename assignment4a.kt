// question 1
fun main() {



     fun calculate(radius: Int){
        val  solution =  radius * radius * 3.142
        println("find the area of the circle is :$solution")
     }
     calculate(7)
     println("=================")
    //  q.2
     fun number(num1:Int,num2:Int){
        val sum =num1 +num2
        val difference =num1-num2
        val product=num1*num2
        val quotient=num1/num2
        println("the sum is:$sum,the difference is:$difference,the product is:$product,the quotient is:$quotient")
     }
     number(6,4)
     println("=================")
    //  q.3
    fun checkyear(year:Int){
        if(year %4==0){
            println("the year $year is a leap year")
        }
        else{
            println("the year $year is not a leap year")
        }
    }
    checkyear(2000)
    println("=================")
    fun arearectangle(length :Int,width:Int){
        val area =length*width
        println("the area of the rectangle is:$area")
    }
    arearectangle(45,2)
}