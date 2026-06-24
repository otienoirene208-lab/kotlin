// when statement
// the when statement is like a switch case whereby if a condition is met for a certain case ,the statement get printed out otherwise if no condition is met it default to the else block.

fun main() {
    val marks = 56


    when(marks){
        in 1 .. 30 ->println("You failed")
        in 31 .. 50 ->println("You have average")
        in 51 .. 70 ->println("You have above average")
        in 71 .. 100->println("Exellent.")
        else->println("Invalid score...!")
    }
}