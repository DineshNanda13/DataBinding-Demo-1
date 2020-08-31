package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //val button = findViewById<Button>(R.id.submit_button);

        binding.submitButton.setOnClickListener {
            greetMessage();
        }
    }

    private fun greetMessage(){
        //val editText = findViewById<EditText>(R.id.edit_text)
        //val textView = findViewById<TextView>(R.id.text_view)

        //val message = "Hello: "+editText.text+"!"

        //binding.textView.text = "Hello: "+ binding.editText.text+"!"
        binding.apply {
            textView.text = "Hello: "+ editText.text+"!"
        }
    }
}