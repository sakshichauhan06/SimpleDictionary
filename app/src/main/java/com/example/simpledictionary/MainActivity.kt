package com.example.simpledictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.simpledictionary.databinding.ActivityMainBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.searchBtn.setOnClickListener {
            val word = binding.searchField.text.toString()
            getMeaning(word)
        }
    }

    private fun getMeaning(word : String) {
        GlobalScope.launch {
            val response = RetrofitInstance.dictionaryApi.getMeaning(word)
            Log.i("Response from API", response.body().toString())
        }
    }
}