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
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    lateinit var enemail: EditText
    lateinit var enpass: EditText
    lateinit var btnlogin: Button
    lateinit var signup: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        enemail = findViewById(R.id.enemail)
        enpass = findViewById(R.id.enpass)
        btnlogin = findViewById(R.id.btnlogin)
        signup = findViewById(R.id.signup)

        signup.setOnClickListener {
            startActivity(Intent(this, Signup::class.java))
        }
        btnlogin.setOnClickListener {
            if(enemail.text.toString().isEmpty()){
                enemail.error="Enter your e-mail id"
        }else if(enpass.text.toString().isEmpty()) {
                enpass.error = "Enter your password"
            }else{
                startActivity(Intent(this, Homepage::class.java))
            }
        }
    }
}