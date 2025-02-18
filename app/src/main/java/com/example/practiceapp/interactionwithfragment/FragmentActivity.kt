package com.example.practiceapp.interactionwithfragment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.practiceapp.R
import com.example.practiceapp.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity() {
    lateinit var binding: ActivityFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun createColor(){
        binding.main.setBackgroundColor(resources.getColor(R.color.red))
    }

    fun changeColor(){
        binding.main.setBackgroundColor(resources.getColor(R.color.white))
    }

    fun addData(text: String) {
    binding.tvText.text = text
    }
}