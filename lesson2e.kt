   fun main() {
    val score =100

    if((score >0)&&(score <40)){
    println("got grade E.failed")
   }
   else if ((score >=40)&&(score <50)){
    println("you got grade D.pull up your socks...")
   }
   else if ((score >=50)&&(score <60)){
    println("you got grade C. you can do better")
   }
   else if ((score >=60)&&(score<70)){
    println("you got grade B. thats,good, one floor up much better ...")
   }
   else if((score >70)&&(score<=100)){
    println("you got grade A. excellent ! maintain the same..")
   }
   else{
    println("invalid score...")
   }


}