package com.example.ukl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        text = findViewById(R.id.emailText)

        val email = intent.getStringExtra("String")
        if(email != null){
            text.text = email
        }
    }
}