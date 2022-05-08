package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.nio.file.OpenOption

class MainActivity : AppCompatActivity() {
    lateinit var btnEnter: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnEnter = findViewById(R.id.btnEnter)
        btnEnter.setOnClickListener {
            val intent = Intent(this, Sendmoneyapp:: class.java )
            startActivity(intent)
        }
    }
}