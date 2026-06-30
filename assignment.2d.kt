// create a kotlin program to check the price to win given the points a customer has acquired

fun main() {
    
    val points=700



    when(points){
       in 0..100->println("you do not qualify")
       in 101..400->println("you win a smartphone")
       in 401..1000->println("you win a laptop")
       in 1001..2000->println("you win a trip to canada")
       else-> println("invalid points...")
    }
 
    val points=900

    if((points<0)&&(points >)){
        println("you do not qualify")
    }
    else if(points< 400){
        println("you win a smartphone")
    } 
    else if(points> 1000){
        println("you win a laptop")
    }
    else if(points> 2000){
        println("you win a trip to canada")
    }
    else{
        println("inavalid points.....")
    }
}


    
    
   
