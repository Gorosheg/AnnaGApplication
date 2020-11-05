package com.first.annasapplication

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.move_to_next_page)
        textView.setOnClickListener {
            moveToNextScreen()
        }
    }

    private fun moveToNextScreen() {
        val intent = Intent(this, SecondPage::class.java)
        startActivity(intent)
    }
}