package com.example.laba1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById(R.id.textView) as TextView
        val textView2 = findViewById(R.id.textView2) as TextView
        val updateButton = findViewById(R.id.b1) as Button
        val upButton = findViewById(R.id.b2) as Button
        val ran = Random()
        textView.setText(ran.numbers.joinToString())

        updateButton.setOnClickListener {
            ran.updateNumbers()
            val numbers = ran.numbers
            textView.setText(numbers.joinToString())
        }

        upButton.setOnClickListener {
            val number1 = ran.polo()
            var number2 = ran.summa()
            textView2.setText(number1.toString()+ "\n"+ number2.toString())
        }
    }
}