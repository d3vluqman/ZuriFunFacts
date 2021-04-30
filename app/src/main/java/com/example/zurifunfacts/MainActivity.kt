package com.example.zurifunfacts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.zurifunfacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var binding: ActivityMainBinding? = null
    var adapter: FactAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setupFact()
    }

    private fun setupFact() {
        adapter = FactAdapter(this, DummyData.funFacts)
        binding?.lvFact?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}