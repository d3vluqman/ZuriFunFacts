package com.example.zurifunfacts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.zurifunfacts.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private var binding: ActivityDetailBinding? = null
    private var logo = 0
    private var name: String? = null
    private var detail: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        logo = intent.getIntExtra(FactAdapter.LOGO_EXTRAs, 0)
        name = intent.getStringExtra(FactAdapter.NAME_EXTRAs)
        detail = intent.getStringExtra(FactAdapter.FACT_EXTRAs)

        setUpFactDetail()
    }

    private fun setUpFactDetail() {
        binding?.tvDetailText?.text = detail
        binding?.ivDetailLogo?.setImageResource(logo)
        title = name
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}