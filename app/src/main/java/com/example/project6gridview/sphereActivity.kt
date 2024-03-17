package com.example.project6gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class sphereActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var textView2: TextView
    lateinit var editText: EditText
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sphere)

        textView = findViewById(R.id.textView)
        textView2 = findViewById(R.id.textView2)
        editText = findViewById(R.id.editText)
        button = findViewById(R.id.button1)

        button.setOnClickListener {
            var radius = editText.text.toString()
            var r = Integer.parseInt(radius)

            var volume = (4/3)*3.14159* r*r*r
            textView2.text = "V = $volume m^3"
        }
    }
}