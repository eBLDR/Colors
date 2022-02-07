package com.example.colors

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.colors.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnMap: Map<Int, Button> = mapOf(
            ContextCompat.getColor(applicationContext, R.color.white) to binding.btn11,
            ContextCompat.getColor(applicationContext, R.color.lightGray2) to binding.btn12,
            ContextCompat.getColor(applicationContext, R.color.lightRedBerry2) to binding.btn13,
            ContextCompat.getColor(applicationContext, R.color.lightRed2) to binding.btn21,
            ContextCompat.getColor(applicationContext, R.color.lightOrange2) to binding.btn22,
            ContextCompat.getColor(applicationContext, R.color.lightYellow2) to binding.btn23,
            ContextCompat.getColor(applicationContext, R.color.lightGreen2) to binding.btn31,
            ContextCompat.getColor(applicationContext, R.color.lightCyan2) to binding.btn32,
            ContextCompat.getColor(applicationContext, R.color.lightCornflowerBlue2) to binding.btn33,
            ContextCompat.getColor(applicationContext, R.color.lightBlue2) to binding.btn41,
            ContextCompat.getColor(applicationContext, R.color.lightPurple2) to binding.btn42,
            ContextCompat.getColor(applicationContext, R.color.lightMagenta2) to binding.btn43,
        )

        paintButtons(btnMap)

        for ((color, btn) in btnMap) {
            btn.setOnClickListener {
                hideRows()
                binding.root.setBackgroundColor(color)
            }
        }
    }

    private fun paintButtons(btnMap: Map<Int, Button>){
        for ((color, btn) in btnMap) {
            btn.setBackgroundColor(color)
        }
    }

    private fun hideRows() {
        binding.ll1.visibility = View.INVISIBLE
        binding.ll2.visibility = View.INVISIBLE
        binding.ll3.visibility = View.INVISIBLE
        binding.ll4.visibility = View.INVISIBLE
    }
}