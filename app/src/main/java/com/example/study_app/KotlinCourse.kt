package com.example.study_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KotlinCourse : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_course)
// create arrayListOf to hold the set of string
        val List= arrayListOf(
            arrayListOf("var and val", "Declaring variables.", "Kotlin requires each variable to be labeled val or var.\n \n Variables labeled with the val keyword are immutable, meaning they can not be reassigned later.\n \n On the other hand, variables with the var keyword are mutable and can be changed anytime.\n \n" +
                    " val number: Int = 5\n" +   " var name: String = \"Tim\"\n" +  " name = \"Bob\"\n" + "\n"),
            arrayListOf("User Input", "Getting user input.", "it is always a good idea to give the user a prompt before they can enter any text\n \n" + "print(\"Enter your name: \")\n \n " +
              "val name = readLine()\n \n"
            + "\n"),


            arrayListOf("Strings", "String concatenations, interpolation, and methods.", "String concatenation refers to combining strings (or other data types) with the use of a + sign\n \n" +
                    "\n" +  "println(\"Hello\" + \"Sam\" )   // --> HelloSam\n " +" val message = \"Hi there\"\n " +  " val name = \"Sam\"\n \n" + " println(message + name)    // --> Hi thereSam\n"  + "\n \n"),


            arrayListOf("Data Types", "Understanding data types.", "We learn in kotlin two  data types such as :\n \n" + "1- we can set variables without identify the type and the program can understand it in value. \n \n" +
                    " val numInt = 6\n \n" +  "println(numInt)\n \n" +  "2- we can set variables and  identify the type, that is why  the program can understand it in  variables\n \n" +
                    "val numFloat = 6f\n \n" +  " println(numFloat) \n \n" +"One last thing to keep in mind when converting Floats and Integers  is the unexpected result of converting \"down.\" \n \n  Floats use more memory than Integers, which means that converting Floats to Integers can lead to data loss."  + "\n \n"),

            arrayListOf("Basic Operations", "Performing math operations in Kotlin.", "\n \n" +  "here are same rules apply to subtraction, multiplication, and division.\n \n" +
                    " var num = 10\n" +"println(num) \n \n //  --> 10\n" +  " num /= 2\n" + " println(num)  //  --> 5\n" +  "  num *= 3\n" +" println(num)  //  --> 15\n \n" + " num --\n \n"  +
                    " println(num)  //  --> 14\n" + "It is important to avoid dividing by zero, as it would lead to a crash.\n \n" +"var num = 10 / 0  //  --> Zero Division Error\n \n"  + "\n \n"),


            arrayListOf("If Statements", "Understanding when and how to use if, else if, and else statements.", "some situations must use an else if and/or else statement to work correctly.\n \n" +
                    "val num = readLine()!!.toInt()\n" + "if(num < 5){\n" +  " println(\"One\")  // --> This would be true\n}" + "if(num < 9){\n" + "println(\"Two\")  // --> This would be true\n }" +
                    "if(num < 15){" + "println(\"Three\")  // --> This would be true\n }" + "if(num < 5){\n" + " println(\"One\")  // --> \n  \n This would be true, the rest would be skipped" +
                    " }else if(num < 9){" + " println(\"Two\")" +  "}else{" +  " println(\"Three\")}" + " \n \n If the user input is '4', the first set of if statements would execute all three print statements, \n \n" +
                    "  // while the second set would only print 'One' "),

            arrayListOf("Error Handling", "Using try blocks to avoid runtime errors.", "Try/Catch\n" +"val num = 10\n" + "print(\"Enter a number: \")\n \n" +
                    "try {\n" + "val userNum = readLine()!!.toInt()\n" + "val sum = num + userNum\n" +"println(sum)\n" +  "} catch (e: Exception)  " +
                    " \n \n { println(\"Please enter numbers only\")}   \n" + "  \n Now if the user does not enter anything, or enters a non digit character, the program will print 'Please enter numbers only' instead of crashing.\n"  + "\n" +"\n"),

            arrayListOf("When", "Using  when to automate code.", "When blocks are similar to a series of if statements.\n \n  They allow us to perform a check in a more concise way and handle each condition appropriately.\n \n " + "\n"+"val grade = readLine()!!.toInt()\n" +" \n"+
        " when {\n" + "grade < 60 -> println(\"F\")\n" +  " grade < 70 -> println(\"D\")\n" + "grade < 80 -> println(\"C\")\n" + " grade < 90 -> println(\"B\")\n" + " else -> println(\"A\")}" +  " \n \n If the user enters a grade of 83, the letter 'B' would be printed to the console.\n"),

            arrayListOf("While Loops", "Using while loops to automate code." +"\n", "While Loops\n" + "\n"+ "While loops are very similar to For Loops. They can perform the same actions.\n" + "\n" +
                    "var count = 0\n" + " while (count < 5){\n" +" count ++\n" +"println(count) }\n"  + "\n" )


        )
//we Initialize the UI element to use it
        val recKt = findViewById<RecyclerView>(R.id.rvkotlin)
        recKt.adapter = myAdapter(this,List )
        recKt.layoutManager = LinearLayoutManager(this)
        title = "Kotlin Review"



    }
}