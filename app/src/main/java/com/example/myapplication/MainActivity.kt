package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    private lateinit var numberTextView : TextView
    private lateinit var clickButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        listeners()

    }

    private  fun listeners(){
        clickButton.setOnClickListener {
            var number = numberTextView.text.toString().toInt()
            number++
            numberTextView.text = (number.toString())
        }

        clickButton.setOnLongClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
            startActivity(intent)
            true
        }


    }

    private fun init(){
        numberTextView = findViewById(R.id.numberTextView)
        clickButton = findViewById(R.id.clickButton)


    }
}