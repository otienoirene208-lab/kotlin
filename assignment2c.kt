fun main() {
    val attendance =80
    val  covarage =69


if(attendance >70 && covarage >80){
    println("Eligible to seat for exams")
}
else if(attendance >70 && covarage <80){
    println("Not eligible because  average of attendance")
}
else if(attendance <70 && covarage >=80){
    println("Not eligble because of attendance")
}
else{
    println("Not eligble")
}
}