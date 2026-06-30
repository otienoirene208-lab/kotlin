fun main() {
    // looping statements in kotlin allows us to repeat a block of code several times until a condition is met.
    // for loop :it executes s fixed number of times i.e

    for(number in 1.. 10){
        println("the count is: $number")
    }
        println("===================")
    // create a for loop that is able to print form 50 to 65

    for(number in 50..65){
        println("the count is: $number")
    }
    println("================")
    // research on how to put an increment with some steps by use of the for loop
    // create a program that is able to print from 20 to40 with the step of 2
    for(number in 20..40 step 2){
        println(number)
    }
    println("================")
    // bellow is a program that print out the odd number between 70 and 100
    for(number in 70..100) {
        if(number % 2!=0){
            println(number)
        }

    }
    println("================")
    // create a program that is able to generate the multiplication table of 5(from 1to5)
    for(number in 1..5  ){
        val answer =number * 5
     println("5  * $number =$answer")
        
    }
}