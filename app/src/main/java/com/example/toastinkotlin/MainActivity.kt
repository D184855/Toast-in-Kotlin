package com.example.toastinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            Toast.makeText(this, "Button1", Toast.LENGTH_LONG).show()
        }

        button2.setOnClickListener(){

            Toast.makeText(this, "Button 2", Toast.LENGTH_LONG).show()
        }

        button3.setOnClickListener(){
            Toast.makeText(this, "Button 3", Toast.LENGTH_LONG).show()
        }

        button4.setOnClickListener(){
            Toast.makeText(this, "Button 4", Toast.LENGTH_LONG).show()
        }

        button5.setOnClickListener(){
            Toast.makeText(this, "Button 5", Toast.LENGTH_LONG).show()
        }



    }
}