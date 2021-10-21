package com.example.study_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AndroidCourse : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_course)
// create arrayListOf to hold the set of string
        val List_Android = arrayListOf(
            arrayListOf("Project Setup", "Setting up an Android Studio Project.", "New project - name of project - language programming - finish"),
            arrayListOf("Console", "Printing to the console.", "we use Log.d(key , name )"),
            arrayListOf("Resource Files", "Identifying, editing, and using resource files.", "We have touched upon some resource files in the Project Overview. \n Here, we will take a closer look at the colors.xml and themes.xml files. Making changes to these files allows us to set a base color for every UI Element (more on those later) we create. These UI Elements can then be changed individually if we choose to do so.\n"),
            arrayListOf("UI Elements", "Creating, modifying, and initializing UI Elements.", " We have Xml file we can write the code and see the design in design item , there are a lot of type of UI such as: Edit Text , Text View , Button, Plain Text , Check Box \n we should initializing the UI with Id reference so we can use it in our Application ")
        )
        //we Initialize the UI element to use it
        val RecAnd = findViewById<RecyclerView>(R.id.rvAndroid)
        RecAnd.adapter = myAdapter(this, List_Android)
        RecAnd.layoutManager = LinearLayoutManager(this)


        title = "Android Review"

    }



}