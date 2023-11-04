package com.example.kalkulyator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kalkulyator.databinding.ActivityMainBinding
import java.net.URL

class MainActivity : AppCompatActivity() {
    var a:Int = 0
    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.apply {
            btnNext.setOnClickListener {
                intent.putExtra("url", btnNext.text.toString())
                startActivity(intent)
            }
        }

        binding.btnCount.setOnClickListener {
            a++
            binding.text.text=a.toString()

        }
        binding.btnReset.setOnClickListener {
            binding.text.text=0.toString()
            a=0

        }
    }
}