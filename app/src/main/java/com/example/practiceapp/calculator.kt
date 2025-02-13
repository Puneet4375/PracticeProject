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
import com.example.practiceapp.databinding.CalculatorBinding
import java.lang.Integer.sum

class Calculator : AppCompatActivity() {
    lateinit var binding: CalculatorBinding
    var result: Any? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = CalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }



        binding.bt1.setOnClickListener {
            if (binding.et1.text.toString().isEmpty()) {
                binding.et1.error = "Enter any number"
            } else if (binding.et2.text.toString().isEmpty()) {
                binding.et2.error = "Enter any number"
           }else {

                val inp1 = binding.et1.text.toString().trim().toInt()
                val inp2 = binding.et2.text.toString().trim().toInt()
                result = (inp1 + inp2)
                binding.result1.text = result.toString()
            }
        }

        binding.bt2.setOnClickListener {

            if (binding.et1.text.toString().isEmpty()) {
                binding.et1.error = "Enter any number"
            } else if (binding.et2.text.toString().isEmpty()) {
                binding.et2.error = "Enter any number"
            } else {
                val inp1 = binding.et1.text.toString().toInt()
                val inp2 = binding.et2.text.toString().toInt()
                result = inp1 - inp2
                // binding.result.text = "Result: $subtract"
                binding.result1.text = result.toString()
            }
        }
        binding.bt3.setOnClickListener {

            if (binding.et1.text.toString().isEmpty()) {
                binding.et1.error = "Enter any number"
            } else if (binding.et2.text.toString().isEmpty()) {
                binding.et2.error = "Enter any number"
            } else {
                val inp1 = binding.et1.text.toString().toInt()
                val inp2 = binding.et2.text.toString().toInt()
                result = (inp1 * inp2)
                //   binding.result.text = "Result: $multiply"
                binding.result1.text = result.toString()
            }
        }
        binding.bt4.setOnClickListener {

            if (binding.et1.text.toString().isEmpty()) {
                binding.et1.error = "Enter any number"
            } else if (binding.et2.text.toString().isEmpty()) {
                binding.et2.error = "Enter any number"
            }else{
            val inp1 = binding.et1.text.toString().toInt()
            val inp2 = binding.et2.text.toString().toInt()
            result = (inp1 / inp2)
          //  binding.result.text = "Result: $divide"
            binding.result1.text = result.toString()
        }
}


//        binding.bt1.setOnClickListener {
//            if (binding.et1.text.toString().isEmpty()) {
//                binding.et1.error = "Enter any number"
//            } else if (binding.et2.text.toString().isEmpty()) {
//                binding.et2.error = "Enter any number"
//            }
//                binding.result.text="$sum"
//            }
//
//        binding.bt2.setOnClickListener {
//            if (binding.et1.text.toString().isEmpty()) {
//                binding.et1.error = "Enter any number"
//            } else if (binding.et2.text.toString().isEmpty()) {
//                binding.et2.error = "Enter any number"
//            }
//              binding.result.text="$subtract"
//        }
//
//        binding.bt3.setOnClickListener {
//            if (binding.et1.text.toString().isEmpty()) {
//                binding.et1.error = "Enter any number"
//            } else if (binding.et2.text.toString().isEmpty()) {
//                binding.et2.error = "Enter any number"
//            }
//           binding.result.text="$multiply"
//        }
//
//        binding.bt4.setOnClickListener {
//            if (binding.et1.text.toString().isEmpty()) {
//                binding.et1.error = "Enter any number"
//            } else if (binding.et2.text.toString().isEmpty()) {
//                binding.et2.error = "Enter any number"
//            }
//            binding.result.text="$divide"
//        }
        }
    }
