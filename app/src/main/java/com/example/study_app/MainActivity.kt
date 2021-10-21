package com.example.study_app

import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CustomAlertDialog(activity: Activity, title: String, text: String) {
    init {
        // build alert dialog
        val dialogBuilder = AlertDialog.Builder(activity)

        // set message in alert dialog to show it in alert
        dialogBuilder.setMessage(text)
            // positive button text, action and it will show ok button
            .setPositiveButton("OK", DialogInterface.OnClickListener {
                    dialog, id -> dialog.cancel()
            })

        // create dialog box
        val alert = dialogBuilder.create()
        // set title  to show it in alert dialog box
        alert.setTitle(title)
        // show alert dialog in box
        alert.show()
    }
}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //we Initialize the UI elements to use it
        val Androidbtn = findViewById<Button>(R.id.Andbtn)
        val kotlinbtn = findViewById<Button>(R.id.ktbtn)

        // her we use onclicklistner to go to anther activity
        Androidbtn.setOnClickListener {
            val i = Intent(this,AndroidCourse::class.java)
            startActivity(i)
        }
// her we use onclicklistner to go to anther activity
        kotlinbtn.setOnClickListener {
            val i = Intent(this, KotlinCourse::class.java)
            startActivity(i)
        }

    }
}