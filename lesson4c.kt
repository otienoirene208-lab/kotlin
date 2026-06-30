// function with parameters
// parameters are values that get passed as argurments when invoking a function
// in kotlin when you add a parameter into a function ,you must specify its datatype


fun main() {
    // below is a function with parameters
    fun sayHello(name: String){
        println("Hello $name, hope you are doing fine")
    }
    sayHello("Mary")

    println("======================")
    // below is a function that is able to calculate the BMI of an individual
    fun BMI(weight:Int ,height: Double){
        val answer =weight/ (height*height)


        println("the BMI of the person is :$answer kg/m2")
    }
    BMI(78,1.73)
   

    println("======================")
    // given a child was born in the midnight of the 1st june 2026, how old will the child be in the midnight of 30th june 2026 in terms of days ,hours, minutes and second .create a function that is able to calculate the same.
    fun converted(){
        val days=29
        val hours=days*24
        val minutes=hours*60
        val seconds=minutes*60

        println("the child is $days days old,is $hours hours old,is $minutes minutes old,is $seconds seconds old")
        
    }
    converted()
}