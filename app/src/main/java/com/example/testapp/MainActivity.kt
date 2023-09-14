package com.example.testapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // variable to hold name
        val myname = "Victoria"

        // finding TextView by ID
        val tv = findViewById<TextView>(R.id.txtbx)

        // setting text to new string
        val str = "My name is $myname"
        tv?.text = str

        val back = findViewById<ConstraintLayout>(R.id.layout)
        back.setBackgroundColor(Color.CYAN)
    }

}