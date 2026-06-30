// for loop: printing form a higher number to lower number

fun main() {
    // we use the "downTo"keyword to print from a higher value to a lower value

    //  bellow  is a program that  print from 10 to1
    for(number in 10 downTo 1){
        println(number)
    }
    println("=================")
    // create a kotlin program that is able to find all the even number from 100 downto 50.
    for(number in 100 downTo 50){
        if(number % 2==0 )
      println(number)

    }
}