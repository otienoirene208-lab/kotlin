fun main() {
    // below is an examplefunction that calculate the sum

    fun  addition(){
        val number1 =10
        val number2 =30
        val number3 =5
        
        val sum = number1+number2+number3
        println("the sum of the numbers is : $sum")
    }
    // invoke the function
    addition()

    println("====================")

    // create a function that is able to find the product of three random numbers
    fun product(){
         val number1=5
         val number2=2
         val number3=4

         val product= number1* number2* number3
         println("the product is: $product")
    }
    product()

    println("====================")
    // given two numbers , create a function that is able to find the largest and the smallest of the numbers.

    fun find(){
        val number1=120
        val number2=42
        

        if(number1 >number2){
            println("$number1 is largest/smallest")
        }
        else if(number2 >number1){
            println("$number2 is greater while $number1 is the smaller")
        }
        else{
            println("both of the numbers are equal")
        }
    }
    find()

    println("====================")

    // given 179 minutes ,create a function that is able  to convert the said minutes into hours and show the remainder of the minutes

    fun converting(){
        val minutesgiven =179

        val hours=minutesgiven/60
        val remainderminutes =minutesgiven %60
        println("the $minutesgiven  converted to minutes and hours given $hours hours and $remainderminutes minutes.")
          

          }
    
        converting()
}