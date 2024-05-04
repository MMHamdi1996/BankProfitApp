package com.example.bankprofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.bankprofit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.profitCalButton.setOnClickListener {

            if (binding.priceEditText.text.toString() != "" ||
                binding.monthNumber.text.toString() != "" ||
                binding.benefitEditText.text.toString() != ""
            ) {
                var price = binding.priceEditText.text.toString().toLong()
                var mothNumber = binding.monthNumber.text.toString().toLong() * 30
                var benefit = binding.benefitEditText.text.toString().toLong()
                val result = (price * mothNumber * benefit) / 36500L
                binding.resulTextView.text = result.toString()
                binding.resulTextView.visibility = View.VISIBLE
                Toast.makeText(this, "سود محاسبه شد", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "تمامی مقادیر باید پر شوند", Toast.LENGTH_SHORT).show()
            }


        }

    }
}