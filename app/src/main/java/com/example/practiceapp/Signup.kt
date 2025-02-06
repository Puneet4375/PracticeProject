package com.example.practiceapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Signup : AppCompatActivity() {
    lateinit var enemail: EditText
    lateinit var enname: EditText
    lateinit var enpass: EditText
    lateinit var btnsignup: Button
    lateinit var signin: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        enemail = findViewById(R.id.enemail)
        enname = findViewById(R.id.enname)
        enpass = findViewById(R.id.enpass)
        btnsignup = findViewById(R.id.btnsignup)
        signin = findViewById(R.id.signin)

        signin.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        btnsignup.setOnClickListener {
            if (enemail.text.toString().isEmpty()) {
                enemail.error = "Enter your e-mail id"
            } else if (enname.text.toString().isEmpty()) {
                enname.error = "Enter your name"
            } else if (enpass.text.toString().isEmpty()) {
                enpass.error = "Enter your password"
            } else {
                startActivity(Intent(this, Homepage::class.java))
            }
        }
    }
}