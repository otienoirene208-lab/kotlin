// we can use the for loop to loop through an array

fun main() {
    // bellow is an array of numbers

    val number =arrayOf(46,62,78,82,3,451,75,2,66)
    for(num in number){
        println(num)
    }
    println("===================")

    // create an arrray of 8 counties found in kenya.on index 5 of the counties , have the county "Nairobi". By use of a for loop ,loop through the entire array as you check whether "Nairobi is part of the array or not .if "Nairobi is found println("Nairobi found")else println("Nairobi not found.")
    
    val counties =arrayOf("Mombasa","Eldoret","Nakuru","Kitale","Kisumu","Nairobi","Meru","Samburu")
    
    var found =false

    for(county in counties){
        if(county=="Nairobi"){
            found =true
            break
        }
    }

    if(found){
        println("Nairobi found")
    }else{
        println("Nairobi not found")
    }
 
}