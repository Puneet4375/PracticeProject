package com.example.practiceapp

import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.practiceapp.databinding.ActivitySignupBinding

class Signup : AppCompatActivity() {
  lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.enemail = findViewById(R.id.enemail)
        binding.enname = findViewById(R.id.enname)
        binding.enpass = findViewById(R.id.enpass)
        binding.btnsignup = findViewById(R.id.btnsignup)
        binding.signin = findViewById(R.id.signin)

        binding.signin.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        binding.btnsignup.setOnClickListener {
            if (binding.enemail.text.toString().isEmpty()) {
                binding.enemail.error = "Enter your e-mail id"
            } else if (binding.enname.text.toString().isEmpty()) {
                binding.enname.error = "Enter your name"
            } else if (binding.enpass.text.toString().isEmpty()) {
                binding.enpass.error = "Enter your password"
            } else {
                startActivity(Intent(this, Homepage::class.java))
            }
        }
    }
}